package by.bsu.famcs.model;

import org.joda.time.DateTime;

/**
 * Created by matvei on 18.02.15.
 */
public class Publication {
    private String title;
    private String content;
    private DateTime publicationDate;

    public Publication() {
    }

    public Publication(String title, String content, DateTime publicationDate) {
        this.title = title;
        this.content = content;
        this.publicationDate = publicationDate;
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

    public DateTime getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(DateTime publicationDate) {
        this.publicationDate = publicationDate;
    }
}
