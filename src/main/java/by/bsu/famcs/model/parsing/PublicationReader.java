package by.bsu.famcs.model.parsing;

import by.bsu.famcs.model.entities.Publication;

import javax.naming.spi.DirectoryManager;
import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.*;
import java.util.ArrayList;
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
    public List<Publication> getPublications(String articlesFolderName) {
        File f = new File(articlesFolderName);
        String[] names = f.list(); //получает список имен файлов в папке

        ArrayList<Publication> pubs = new ArrayList<>();

        for (String name : names) {
            System.out.println(name);
            parsePublication(articlesFolderName + "/" + name);
        }
        return pubs;
    }

    private Publication parsePublication(String fileName) {
        String content = readPublication(fileName);
        System.out.println(content);
        return null;
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

    public static void main(String[] args) {

       PublicationReader reader = PublicationReader.getInstance();
       reader.getPublications("src/articles");
    }
}