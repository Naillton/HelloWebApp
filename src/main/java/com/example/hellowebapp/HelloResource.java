package com.example.hellowebapp;

import jakarta.ws.rs.*;

@Path("/hello-world")
public class HelloResource {
    @GET
    @Produces("text/plain")
    public String hello() {
        return "Hello, World!";
    }

    @POST
    @Path("/{name}")
    @Produces("text/plain")
    public String sayHello(@PathParam("name") String name) {
        return "Helooo "+name;
    }
}