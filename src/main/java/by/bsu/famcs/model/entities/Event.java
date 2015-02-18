package by.bsu.famcs.model.entities;

import org.joda.time.DateTime;

/**
 * Created by matvei on 18.02.15.
 */
public class Event {
    private String name;
    private String date;

    public Event() {
    }

    public Event(String name, String date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
