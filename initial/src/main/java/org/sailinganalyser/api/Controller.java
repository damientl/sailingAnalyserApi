package org.sailinganalyser.api;

import org.sailinganalyser.model.Segment;
import org.sailinganalyser.model.SegmentDTO;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import org.sailinganalyser.util.XmlReader;

@RestController
public class Controller {

    @RequestMapping("/")
    public String index() {
        return "API Greetings from Spring Boot!";
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping("/segments")
    public SegmentDTO segments() {
        return XmlReader.readXML("src/test/resources/example.gpx");
    }
    
}
