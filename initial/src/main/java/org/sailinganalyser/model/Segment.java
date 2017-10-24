package org.sailinganalyser.model;

public class Segment {
    private String lat;
    private String lon;
    private String time;

    public Segment(String lat, String lon, String time) {
        this.lat = lat;
        this.lon = lon;
        this.time = time;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
