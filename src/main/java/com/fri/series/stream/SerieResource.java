package com.fri.series.stream;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;
import com.kumuluz.ee.logs.cdi.Log;

@Produces(MediaType.APPLICATION_JSON)
@Path("series")
@Log
@ApplicationScoped
public class SerieResource {

    @GET
    public Response getAllSeries() {
        List<Serie> series = SeriesDatabase.getSeriess();
        return Response.ok(series).build();
    }

    @GET
    @Path("{id}/episodes")
    public Response getSerieEpisodes(@PathParam("id") int id) {
        List<Episode> episodes = EpisodesDatabase.getSerieEpisodes(id);
        return Response.ok(episodes).build();
    }

    @GET
    @Path("{id}")
    public Response getSerie(@PathParam("id") int id) {
        Serie serie = SeriesDatabase.getSerie(id);
        if(serie != null){
            return Response.ok(serie).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

    @POST
    public Response addSerie(Serie serie) {
        SeriesDatabase.addSerie(serie);
        return Response.noContent().build();
    }

    @DELETE
    @Path("{id}")
    public Response deleteSerie(@PathParam("id") int id) {
        SeriesDatabase.deleteSerie(id);
        return Response.noContent().build();
    }
}
