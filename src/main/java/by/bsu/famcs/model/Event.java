package by.bsu.famcs.model;

import org.joda.time.DateTime;

/**
 * Created by matvei on 18.02.15.
 */
public class Event {
    private String name;
    private DateTime date;

    public Event() {
    }

    public Event(String name, DateTime date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DateTime getDate() {
        return date;
    }

    public void setDate(DateTime date) {
        this.date = date;
    }
}
