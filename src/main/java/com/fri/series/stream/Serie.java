package com.fri.series.stream;

public class Serie {

    private int id;
    private String seriesName;
    private int releaseYear;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSeriesName() {
        return seriesName;
    }

    public void setSeriesName(String seriesName) {
        this.seriesName = seriesName;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Serie(int id, String name, int year){
        setId(id);
        setSeriesName(name);
        setReleaseYear(year);
    }
}
