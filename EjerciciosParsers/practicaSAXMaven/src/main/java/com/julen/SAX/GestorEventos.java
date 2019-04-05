package com.julen.SAX;

import com.julen.euskalmet.Alojamiento;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.List;

/**
 * Manejador de los eventos del parser SAX
 */
public class GestorEventos extends DefaultHandler {

    private List<Alojamiento> Alojamiento = new ArrayList<>();

    private Alojamiento aloj = null;

    private StringBuilder builder = new StringBuilder();

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {

        switch (qName) {
            case "row":
                aloj = new Alojamiento();
                aloj.setId(attributes.getValue("id"));
                break;      
        }

        builder.setLength(0);
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        builder.append(new String(ch, start, length));
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {

        String texto = builder.toString();

        if (qName.equals("row")) {
            Alojamiento.add(aloj);
        } else {
            switch (qName) {
                case "lodgingtype":
                aloj.setTipo(texto);
                break;
            case "documentname":
                aloj.setNombre(texto);
                break;
            case "locality":
                aloj.setMunicipio(texto);
                break;
            case "web":
                aloj.setWeb(texto);
                break;
            case "capacity":
                aloj.setCapacidad(texto);
                break;          
            }
        }

    }

    public List<Alojamiento> getAlojamientos() {
        return Alojamiento;
    }

}
