package gov.iti.jets.filmslibrary.jaxrs.services;

import gov.iti.jets.filmslibrary.dtos.actorDtos.ActorFilmsDto;
import gov.iti.jets.filmslibrary.mappers.ActorFilmsMapper;
import gov.iti.jets.filmslibrary.repository.ActorFilmsRepo;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("actorFilms")
public class ActorFilmsService {

    @GET
    @Path("getFilmsOfAllActors")
    @Produces(MediaType.APPLICATION_JSON)
    public List<ActorFilmsDto> getFilmsOfAllActors() {
        return new ActorFilmsRepo().getFilmsOfAllActors();
    }

    @GET
    @Path("getFilmsOFAnActor")
    @Produces(MediaType.APPLICATION_JSON)
    public ActorFilmsDto getFilmsOFAnActor(@QueryParam(value = "actorId") short id) {
        return new ActorFilmsMapper().toDto(new ActorFilmsRepo().getFilmsOFAnActor(id));
    }

    @POST
    @Path("postFilmToActor")
    @Produces(MediaType.APPLICATION_JSON)
    public ActorFilmsDto addExistingFilmToAnExistingActor(@QueryParam(value = "filmId") short filmId,
                                                          @QueryParam(value = "actorId") short actorId) {
        if (new ActorFilmsRepo().addExistingFilmToAnExistingActor(filmId, actorId)) {
            return getFilmsOFAnActor(actorId);
        }
        return null;
    }

   @DELETE
   @Path("deleteFilmOfAnActor")
   @Produces(MediaType.APPLICATION_JSON)
   public ActorFilmsDto removeFilmOfAnActor(@QueryParam(value = "filmId") short filmId,
                                            @QueryParam(value = "actorId") short actorId) {
       int effectedRows = new ActorFilmsRepo().removeFilmOfAnActor(filmId, actorId);
       if (effectedRows>0) {
           return getFilmsOFAnActor(actorId);
       }
       return null;

   }
}
