package com.hub.rest.v1;

import com.hub.mongo.documents.FormResponse;
import com.hub.mongo.service.FormResponseService;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import lombok.RequiredArgsConstructor;

@Path("/v1/form-response")
@RequiredArgsConstructor
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class FormResponseEndpoint {

    final FormResponseService service;

    @POST
    public Response createFormResponse(FormResponse formResponse) {
        service.persist(formResponse);
        return Response.ok().build();
    }

    @GET
    @Path("/{user}")
    public Response getFormResponse(@PathParam("user") String user) {
        return Response.ok()
                .entity(service.getFormResponse(user))
                .build();
    }
}
