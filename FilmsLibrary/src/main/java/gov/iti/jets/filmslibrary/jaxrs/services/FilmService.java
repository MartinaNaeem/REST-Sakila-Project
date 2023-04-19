package gov.iti.jets.filmslibrary.jaxrs.services;


import gov.iti.jets.filmslibrary.dtos.filmDtos.FilmFilterDto;
import gov.iti.jets.filmslibrary.dtos.filmDtos.FilmGetterDto;
import gov.iti.jets.filmslibrary.dtos.filmDtos.FilmSetterDto;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

import gov.iti.jets.filmslibrary.repository.*;

@Path("film")
public class FilmService {

    @GET
    @Path("getAllFilms")
    @Produces(MediaType.APPLICATION_JSON)
    public List<FilmGetterDto> getAllFilms() {
        return new FilmRepo().getAllFilms();
    }

    @POST
    @Path("postNewFilm")
    @Consumes(MediaType.APPLICATION_JSON)
    public boolean addFilm(FilmSetterDto filmSetterDto) {
        return new FilmRepo().addFilm(filmSetterDto);
    }

    @PUT
    @Path("putFilm")
    @Consumes(MediaType.APPLICATION_JSON)
    public boolean updateFilm(FilmSetterDto filmSetterDto) {
        return new FilmRepo().updateFilm(filmSetterDto);
    }

    @DELETE
    @Path("deleteFilm")
    public boolean deleteFilm(@QueryParam(value = "id") short id) {
        return new FilmRepo().removeFilm(id);
    }


    @POST
    @Path("filterFilms")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public List<FilmGetterDto> filterFilms(FilmFilterDto filmFilterDto) {
        return new FilmRepo().filterFilms(filmFilterDto);
    }


}
