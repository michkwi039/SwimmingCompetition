package com.polsl.controllers;

import com.polsl.model.Competition;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.DELETE;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

public class CompetitionController {
    List<Competition> competitions = new ArrayList<>();
    @GET
    public Competition getCompetition(int ID) {
        for (Competition c: competitions) {
            if(c.getID()==ID)return c;
        }
        return null;
    }
    @DELETE
    public Response deleteCompetition(Competition competition){
        competitions.remove(competition) ;
        return new Response.ok().build();
    }
    @POST
    public Response addCompetition(Competition competition){
        competitions.add(competition);
        return new Response.ok().build();
    }
}
