package com.fri.series.stream;

public class Episode {

    private int id;
    private int seriesId;
    private String episodeName;
    private int season;
    private int episode;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getSeriesId() {
        return seriesId;
    }
    public void setSeriesId(int id) {
        this.seriesId = id;
    }

    public String getEpisodeName() {
        return episodeName;
    }
    public void setEpisodeName(String episodeName) {
        this.episodeName = episodeName;
    }

    public int getSeason() {
        return season;
    }
    public void setSeason(int season) {
        this.season = season;
    }

    public int getEpisode() {
        return episode;
    }
    public void setEpisode(int episode) {
        this.episode = episode;
    }

    public Episode(int id, int seriesId, String name, int se, int ep){
        setId(id);
        setSeriesId(seriesId);
        setEpisodeName(name);
        setSeason(se);
        setEpisode(ep);
    }
}
