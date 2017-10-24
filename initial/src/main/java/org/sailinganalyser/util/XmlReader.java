package org.sailinganalyser.util;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.sailinganalyser.model.Segment;

public class XmlReader {
    public static List<Segment> readXML(String filePath){
        List<Segment> segments = new ArrayList<Segment>();
        try {

            File fXmlFile = new File(filePath);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(fXmlFile);

            //optional, but recommended
            //read this - http://stackoverflow.com/questions/13786607/normalization-in-dom-parsing-with-java-how-does-it-work
            doc.getDocumentElement().normalize();

            NodeList nList = doc.getElementsByTagName("trkpt");

            for (int temp = 0; temp < nList.getLength(); temp++) {

                Node nNode = nList.item(temp);

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {

                    Element eElement = (Element) nNode;

                    segments.add(
                        new Segment(eElement.getAttribute("lat"),
                                    eElement.getAttribute("lon"),
                                    eElement.getElementsByTagName("time").item(0).getTextContent()));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return segments;
    }
}
