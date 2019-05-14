package com.polsl.controllers;

import com.polsl.model.Runs;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.DELETE;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

public class RunsController {
    List<Runs> runs = new ArrayList<>();
    @GET
    public Runs getRun(int ID) {
        for (Runs r: runs) {
            if(r.ID==ID)return r;
        }
        return null;
    }
    @DELETE
    public Response deleteRun(Runs runs){
        this.runs.remove(runs) ;
        return new Response.ok().build();
    }
    @POST
    public Response addRun(Runs runs){
        this.runs.add(runs);
        return new Response.ok().build();
    }
}
