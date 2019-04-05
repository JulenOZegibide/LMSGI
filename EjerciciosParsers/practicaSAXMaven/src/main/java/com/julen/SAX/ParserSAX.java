package com.julen.SAX;

import com.julen.euskalmet.Euskalmet;
import com.julen.euskalmet.Alojamiento;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;

/**
 * Ejemplo de lectura de datos XML usando un parser tipo SAX
 */
public class ParserSAX {

    // REF: Tutorial: https://www.journaldev.com/1198/java-sax-parser-example

    public static void main(String[] args) {

        System.out.println("--- SAX (lectura) ---\n");

        SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();

        try {
            SAXParser saxParser = saxParserFactory.newSAXParser();

            GestorEventos handler = new GestorEventos();
            InputSource datos = new InputSource(new StringReader(Euskalmet.tendenciaSeisDias()));

            saxParser.parse(datos, handler);

            List<Alojamiento> Alojamiento = handler.getAlojamientos();

            for (Alojamiento t : Alojamiento)
                System.out.println(t);

        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }

    }
}
