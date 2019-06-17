package com.polsl.controllers;

import com.polsl.model.Tournament;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.DELETE;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

public class TournamentController {

    List<Tournament> tournaments = new ArrayList<>();

    @GET
    public Tournament getTourturnament(int ID) {
        for (Tournament t : tournaments) {
            if (t.getID() == ID) return t;
        }
        return null;
    }

    @DELETE
    public Response deleteTournament(Tournament tournament) {
        tournaments.remove(tournament);
        return new Response.ok().build();
    }

    @POST
    public Response addTourornament(Tournament tournament) {
        tournaments.add(tournament);
        return new Response.ok().build();
    }

}