package gov.iti.jets.filmslibrary.jaxrs.services;


import gov.iti.jets.filmslibrary.dtos.staffDtos.StaffGetterDto;
import gov.iti.jets.filmslibrary.dtos.staffDtos.StaffSetterDto;
import gov.iti.jets.filmslibrary.dtos.storeDtos.StoreGetterDto;
import gov.iti.jets.filmslibrary.dtos.storeDtos.StoreSetterDto;
import gov.iti.jets.filmslibrary.repository.StaffRepo;
import gov.iti.jets.filmslibrary.repository.StoreRepo;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("staff")
public class StaffService {

    @GET
    @Path("getAllStaff")
    @Produces(MediaType.APPLICATION_JSON)
    public List<StaffGetterDto> getAllStaff() {
        return new StaffRepo().getAllStaff();
    }

    @POST
    @Path("postNewStaff")
    @Consumes(MediaType.APPLICATION_JSON)
    public boolean addStaff(StaffSetterDto staffSetterDto) {
        return new StaffRepo().addStaff(staffSetterDto);
    }

    @PUT
    @Path("putStaff")
    @Consumes(MediaType.APPLICATION_JSON)
    public boolean updateStaff(StaffSetterDto staffSetterDto) {
        return new StaffRepo().updateStaff(staffSetterDto);
    }

}
