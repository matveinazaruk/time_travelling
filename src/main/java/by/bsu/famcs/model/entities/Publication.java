package by.bsu.famcs.model.entities;

import org.joda.time.DateTime;

import java.util.ArrayList;

/**
 * Created by matvei on 18.02.15.
 */
public class Publication {
    private String title;
    private String content;
    private String publicationDate;
    private String author;
    private ArrayList<Event> events = new ArrayList<Event>();

    private boolean fromFuture = false;

    public Publication() {
    }

    public Publication(String title, String content, String publicationDate, String author) {
        this.title = title;
        this.content = content;
        this.publicationDate = publicationDate;
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

    public String getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
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
}
