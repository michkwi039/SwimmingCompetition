package com.polsl.controllers;
import com.polsl.model.Swimmer;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.DELETE;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Path("/swimmers")
public class SwimmerController {
    List<Swimmer> swimmers = new ArrayList<Swimmer>();
    @GET
    public List<Swimmer> getAll() {
        swimmers = Arrays.asList(
                new Swimmer(),
                new Swimmer(),
                new Swimmer()
        );
        return swimmers;
    }
    @DELETE
    public Response deleteSwimmer(Swimmer swimmer){
        swimmers.remove(swimmer) ;
        return new Response.ok().build();
    }
    @POST
    public Response addSwimmer(Swimmer swimmer){
        swimmers.add(swimmer);
        return new Response.ok().build();
    }

}
