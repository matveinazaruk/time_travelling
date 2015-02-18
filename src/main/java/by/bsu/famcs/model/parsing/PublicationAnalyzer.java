package by.bsu.famcs.model.parsing;

import by.bsu.famcs.model.entities.Publication;

import java.util.List;

/**
 * Created by matvei on 18.02.15.
 */
public class PublicationAnalyzer {

    private static PublicationAnalyzer analyzer = new PublicationAnalyzer();

    private PublicationReader reader;

    private PublicationAnalyzer() {
        reader = PublicationReader.getInstance();
    }

    public static PublicationAnalyzer getInstance() {
        return analyzer;
    }


    // А тут ванька анализирует статьи
    // и если она из будущего ставит  fromFuture = true;
    // и возвращает проанализированные
    public List<Publication> getAnalyzedPublications() {
        List<Publication> publications = reader.getPublications();
        //что то с ними делаешь
        return null;
    }
}
