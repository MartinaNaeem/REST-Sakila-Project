package gov.iti.jets.filmslibrary.jaxrs.services;


import gov.iti.jets.filmslibrary.dtos.cityDtos.CityGetterDto;
import gov.iti.jets.filmslibrary.dtos.cityDtos.CitySetterDto;
import gov.iti.jets.filmslibrary.dtos.staffDtos.StaffGetterDto;
import gov.iti.jets.filmslibrary.dtos.staffDtos.StaffSetterDto;
import gov.iti.jets.filmslibrary.model.City;
import gov.iti.jets.filmslibrary.repository.CityRepo;
import gov.iti.jets.filmslibrary.repository.StaffRepo;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("city")
public class CityService {

    @GET
    @Path("getAllCities")
    @Produces(MediaType.APPLICATION_JSON)
    public List<CityGetterDto> getAllCities() {
        return new CityRepo().getAllCities();
    }

    @POST
    @Path("postNewCity")
    @Consumes(MediaType.APPLICATION_JSON)
    public City addCity(CitySetterDto citySetterDto) {
        return new CityRepo().addCity(citySetterDto);
    }


}
