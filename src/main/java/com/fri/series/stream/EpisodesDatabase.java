package com.fri.series.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class EpisodesDatabase {
    static Episode it1 = new Episode(1,1,"Pilot",1,1);
    static Episode it2 = new Episode(2,1,"Second",1,2);
    static Episode big1 = new Episode(3,2,"Pilot",1,1);
    static Episode big2 = new Episode(4,2,"Something else",1,2);
    private static List<Episode> episodes = Arrays.asList(it1, it2, big1, big2);

    public static List<Episode> getSerieEpisodes(int id) {
        List<Episode> seriesEpisodes = new ArrayList<>();
        for (Episode episode : episodes) {
            if (episode.getSeriesId() == id)
                seriesEpisodes.add(episode);
        }
        System.out.println("List getted for " + id); return seriesEpisodes;
    }

    public static List<Episode> getEpisodess() {
        System.out.println("List getted"); return episodes;
    }

    public static Episode getEpisode(int id) {
        for (Episode episode : episodes) {
            if (episode.getId() == (id))
                return episode;
        }

        return null;
    }

    public static void addEpisode(Episode episode) {
        episodes.add(episode);
    }

    public static void deleteEpisode(int id) {
        for (Episode episode : episodes) {
            if (episode.getId() == (id)){
                episodes.remove(episode);
                break;
            }
        }
    }
}
