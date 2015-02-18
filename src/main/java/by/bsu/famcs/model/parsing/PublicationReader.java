package by.bsu.famcs.model.parsing;

import by.bsu.famcs.model.entities.Event;
import by.bsu.famcs.model.entities.Publication;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * Created by matvei on 18.02.15.
 */
public class PublicationReader {
    public static final String EVENTS_FILENAME = "events.json";
    private static PublicationReader reader = new PublicationReader();

    private PublicationReader() {}

    public static PublicationReader getInstance() {
        return reader;
    }
    // Тут томасу надо считать из файла и вернуть ваньке публикации
    public List<Publication> getPublications() {
        return null;
    }

    public String getEvents() {
        Path path = Paths.get("src", EVENTS_FILENAME);
        try {
            List<String> lines = Files.readAllLines(path);
            StringBuilder resultJson = new StringBuilder("");
            lines.forEach(resultJson::append);
            return  resultJson.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(PublicationReader.getInstance().getEvents());
    }
}
