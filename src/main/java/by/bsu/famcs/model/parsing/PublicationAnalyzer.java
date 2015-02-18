package by.bsu.famcs.model.parsing;

import by.bsu.famcs.help.LocationHolder;
import by.bsu.famcs.model.entities.Publication;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PublicationAnalyzer {

    private static PublicationAnalyzer analyzer = new PublicationAnalyzer();

    private PublicationReader reader;
    private List<Publication> analyzedPublications = new ArrayList<>();
    private boolean analyzed = false;

    private PublicationAnalyzer() {
        reader = PublicationReader.getInstance();
    }

    public static PublicationAnalyzer getInstance() {
        return analyzer;
    }

    public List<Publication> getAnalyzedPublications() {

        if (!analyzed) {
            try {
                String location = LocationHolder.getResourcesLocation();
                analyzedPublications = reader.getPublications(location + "/articles");
                analyzedPublications.forEach(Publication::analyze);
                analyzed = true;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return analyzedPublications;
    }
}
