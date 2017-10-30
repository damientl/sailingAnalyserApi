package org.sailinganalyser.util;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.sailinganalyser.model.Segment;

import java.util.List;

public class XMLReaderTest {
    @Test
    public void readTest(){
        List<Segment> segments = XmlReader.readXML("./src/test/resources/example.gpx").segments;
        assertTrue(segments.size() > 0);

    }
}
