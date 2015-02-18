package by.bsu.famcs.model.parsing;

import by.bsu.famcs.model.entities.Publication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.*;
import java.io.InputStreamReader;
import java.util.List;

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
//
//    private Publication parsePublication(String pub) {
//
//    }

    public static void main(String[] args) {

        PublicationReader reader = PublicationReader.getInstance();
        String result = reader.readPublication("article.json");
        System.out.println(result);
    }
}