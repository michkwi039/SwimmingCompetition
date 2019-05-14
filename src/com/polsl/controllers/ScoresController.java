package com.polsl.controllers;

import com.polsl.model.Scores;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.DELETE;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

public class ScoresController {
    List<Scores> scores = new ArrayList<>();
    @GET
    public Scores getScore(int ID) {
        for (Scores s: scores) {
            if(s.ID==ID)return s;
        }
        return null;
    }
    @DELETE
    public Response deleteScore(Scores scores){
        this.scores.remove(scores) ;
        return new Response.ok().build();
    }
    @POST
    public Response addScore(Scores scores){
        this.scores.add(scores);
        return new Response.ok().build();
    }
}
