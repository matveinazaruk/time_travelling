package by.bsu.famcs.model.entities;

import by.bsu.famcs.model.parsing.EventsReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by matvei on 18.02.15.
 */
public class Publication {
    private String title;
    private String content;
    private String date;
    private String author;
    private ArrayList<Event> events = new ArrayList<Event>();

    private boolean fromFuture = false;

    public Publication() {
    }

    public Publication(String title, String content, String publicationDate, String author) {
        this.title = title;
        this.content = content;
        this.date = publicationDate;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isFromFuture() {
        return fromFuture;
    }

    public void setFromFuture(boolean fromFuture) {
        this.fromFuture = fromFuture;
    }

    public ArrayList<Event> getEvents() {
        return events;
    }

    public boolean addEvent(Event event) {
        return events.add(event);
    }

    public void analyze() {
        List<Event> fixedEvents = EventsReader.getInstance().getEvents();
        events.addAll(fixedEvents.stream().filter(event -> content.toLowerCase().contains(event.getName().toLowerCase())).collect(Collectors.toList()));
    }

    public boolean containsEvent(String eventName) {
        for (Event event : events) {
            if (event.getName().equalsIgnoreCase(eventName))
                return true;
        }
        return false;
    }
}
