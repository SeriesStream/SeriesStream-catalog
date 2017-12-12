package com.fri.series.stream;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;
import com.kumuluz.ee.logs.cdi.Log;

@Produces(MediaType.APPLICATION_JSON)
@Path("episodes")
@Log
@ApplicationScoped
public class EpisodeResource {

    @GET
    public Response getAllEpisodes() {
        List<Episode> episodes = EpisodesDatabase.getEpisodess();
        return Response.ok(episodes).build();
    }

    @GET
    @Path("{id}")
    public Response getEpisode(@PathParam("id") int id) {
        Episode episode = EpisodesDatabase.getEpisode(id);
        if(episode != null){
            return Response.ok(episode).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

    @POST
    public Response addEpisode(Episode episode) {
        EpisodesDatabase.addEpisode(episode);
        return Response.noContent().build();
    }

    @DELETE
    @Path("{id}")
    public Response deleteEpisode(@PathParam("id") int id) {
        EpisodesDatabase.deleteEpisode(id);
        return Response.noContent().build();
    }
}
