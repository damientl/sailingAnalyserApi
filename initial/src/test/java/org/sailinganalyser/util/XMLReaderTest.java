package org.sailinganalyser.util;

import org.junit.jupiter.api.Test;

public class XMLReaderTest {
    @Test
    public void readTest(){
        XmlReader.readXML("./src/test/resources/example.gpx");

    }
}
