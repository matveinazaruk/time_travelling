package by.bsu.famcs.model.parsing;

import by.bsu.famcs.model.entities.Publication;
import org.codehaus.jackson.map.ObjectMapper;
import java.io.*;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

public class PublicationReader {
    private static PublicationReader reader = new PublicationReader();

    private PublicationReader() {}

    public static PublicationReader getInstance() {
        return reader;
    }

    // Тут томасу надо считать из файла и вернуть ваньке публикации
    public List<Publication> getPublications(String articlesFolderName) throws IOException {
        File f = new File(articlesFolderName);
        String[] names = f.list(); //получает список имен файлов в папке

        ArrayList<Publication> pubs = new ArrayList<>();


        for (String name : names) {
            pubs.add(parsePublication(articlesFolderName + "/" + name));
        }
        return pubs;
    }

    private Publication parsePublication(String fileName) throws IOException {
        String content = readPublication(fileName);
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(content, Publication.class);
    }

    public String readPublication(String fileName) {

        Path path = Paths.get(fileName);
        try {
            List<String> lines = Files.readAllLines(path);
            final StringBuilder resultJson = new StringBuilder("");
            lines.forEach(resultJson::append);
            return resultJson.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static void main(String[] args) throws IOException {

       PublicationReader reader = PublicationReader.getInstance();
       reader.getPublications("src/articles").forEach(p -> System.out.println(p.getTitle()));
    }
}