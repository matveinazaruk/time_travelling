package by.bsu.famcs.model.parsing;

import by.bsu.famcs.model.entities.Event;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * Created by matvei on 18.02.15.
 */
public class EventsReader {

    public static final String EVENTS_FILENAME = "events.json";
    private static EventsReader reader = new EventsReader();

    private EventsReader() {}

    public static EventsReader getInstance() {
        return reader;
    }

    public List<Event> getEvents() {
        Path path = Paths.get("src", EVENTS_FILENAME);
        try {
            List<String> lines = Files.readAllLines(path);
            StringBuilder resultJson = new StringBuilder("");
            lines.forEach(resultJson::append);
            return parseEventsJson(resultJson.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private List<Event> parseEventsJson(String json) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        List<Event> events = mapper.readValue(json,
                mapper.getTypeFactory().constructCollectionType(List.class, Event.class));
        return events;
    }
}
