package by.bsu.famcs.model.parsing;

import by.bsu.famcs.model.entities.Publication;

import java.util.List;

/**
 * Created by matvei on 18.02.15.
 */
public class PublicationReader {
    private static PublicationReader reader = new PublicationReader();

    private PublicationReader() {}

    public static PublicationReader getInstance() {
        return reader;
    }

    // Тут томасу надо считать из файла и вернуть ваньке публикации
    public List<Publication> getPublications() {
        return null;
    }
}
