package gov.iti.jets.filmslibrary.jaxrs.services;

import gov.iti.jets.filmslibrary.dtos.rentsDtos.AllRentsDto;
import gov.iti.jets.filmslibrary.dtos.rentsDtos.RentalSetterDto;
import gov.iti.jets.filmslibrary.repository.RentingRepo;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("rents")
public class RentingService {

    @GET
    @Path("getAllRents")
    @Produces(MediaType.APPLICATION_JSON)
    public List<AllRentsDto> getAllRents(){
        return new RentingRepo().getAllRents();
    }

    @POST
    @Path("rentFilm")
    @Consumes(MediaType.APPLICATION_JSON)
    public void  rentFilm(RentalSetterDto rentalSetterDto){
        new RentingRepo().rentFilm(rentalSetterDto);
    }

    @PUT
    @Path("returnFilm")
    public void returnFilm(@QueryParam("rentalId") Integer rentalId){
        new RentingRepo().returnFilm(rentalId);
    }

}
