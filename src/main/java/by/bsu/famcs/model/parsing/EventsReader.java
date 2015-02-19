package by.bsu.famcs.model.parsing;

import by.bsu.famcs.help.LocationHolder;
import by.bsu.famcs.model.entities.Event;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class EventsReader {

    public static final String EVENTS_FILENAME = "events.json";
    private static EventsReader reader = new EventsReader();

    private List<Event> events = new ArrayList<>();
    private boolean readed = false;

    private EventsReader() {}

    public static EventsReader getInstance() {
        return reader;
    }

    public List<Event> getEvents() {
        if (!readed) {
            String location = LocationHolder.getResourcesLocation();
            Path path = Paths.get(location, EVENTS_FILENAME);
            try {
                path.toAbsolutePath().toString();
                List<String> lines = Files.readAllLines(path);
                StringBuilder resultJson = new StringBuilder("");
                lines.forEach(resultJson::append);
                events = parseEventsJson(resultJson.toString());
                readed = true;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return events;
    }

    private List<Event> parseEventsJson(String json) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(json,
                mapper.getTypeFactory().constructCollectionType(List.class, Event.class));
    }

}
