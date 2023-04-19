package gov.iti.jets.filmslibrary.jaxrs.services;


import gov.iti.jets.filmslibrary.dtos.actorDtos.ActorGetterDto;
import gov.iti.jets.filmslibrary.dtos.actorDtos.ActorSetterDto;
import gov.iti.jets.filmslibrary.repository.ActorRepo;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("actor")
public class ActorService {

    @GET
    @Path("getAllActors")
    @Produces(MediaType.APPLICATION_JSON)
    public List<ActorGetterDto> getAllActors() {
        return new ActorRepo().getAllActors();
    }

    @POST
    @Path("postNewActor")
    @Consumes(MediaType.APPLICATION_JSON)
    public boolean addActor(ActorSetterDto actorSetterDto) {
        return new ActorRepo().addActor(actorSetterDto);
    }

    @PUT
    @Path("putActor")
    @Consumes(MediaType.APPLICATION_JSON)
    public boolean updateActor(ActorSetterDto actorSetterDto) {
        return new ActorRepo().updateActor(actorSetterDto);
    }

    @DELETE
    @Path("deleteActor")
    public boolean deleteActor(@QueryParam(value = "id") short id) {
        return new ActorRepo().deleteActor(id);
    }



}
