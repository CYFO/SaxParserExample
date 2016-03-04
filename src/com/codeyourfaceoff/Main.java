package com.codeyourfaceoff;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {

    public static void main(String[] args) {
        String path = new File("books.xml").getAbsolutePath();
        try {
//                InputStream in = Files.newInputStream();
//            FileReader fileReader = new FileReader(path);
//            // Always wrap FileReader in BufferedReader.
//            BufferedReader bufferedReader =
//                    new BufferedReader(fileReader);
//
//            String line = null;
//            StringBuilder sb = new StringBuilder();
//            while ((line = bufferedReader.readLine()) != null) {
//                sb.append(line);
//            }
//            System.out.println(sb.toString());
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser parser = factory.newSAXParser();
            BookXMLHandler handler = new BookXMLHandler();
            parser.parse(new File("books.xml"), handler);
        } catch (IOException x) {
            System.err.println(x);
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        }
    }
}