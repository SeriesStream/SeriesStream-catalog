package com.fri.series.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class SeriesDatabase {
    static Serie it = new Serie(1,"IT Ceowd",2009);
    static Serie big = new Serie(2,"The big Bang Theory",2006);
    private static List<Serie> series = Arrays.asList(it, big);

    public static List<Serie> getSeriess() {
        System.out.println("List getted"); return series;
    }

    public static Serie getSerie(int id) {
        for (Serie serie : series) {
            if (serie.getId() == (id))
                return serie;
        }

        return null;
    }

    public static void addSerie(Serie serie) {
        series.add(serie);
    }

    public static void deleteSerie(int id) {
        for (Serie serie : series) {
            if (serie.getId() == (id)){
                series.remove(serie);
                break;
            }
        }
    }
}
