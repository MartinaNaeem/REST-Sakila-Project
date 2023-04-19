package gov.iti.jets.filmslibrary.jaxrs.services;


import gov.iti.jets.filmslibrary.dtos.actorDtos.ActorGetterDto;
import gov.iti.jets.filmslibrary.dtos.actorDtos.ActorSetterDto;
import gov.iti.jets.filmslibrary.dtos.addressDtos.AddressGetterDto;
import gov.iti.jets.filmslibrary.dtos.addressDtos.AddressSetterDto;
import gov.iti.jets.filmslibrary.model.Address;
import gov.iti.jets.filmslibrary.repository.ActorRepo;
import gov.iti.jets.filmslibrary.repository.AddressRepo;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("address")
public class AddressService {

    @GET
    @Path("getAllAddresses")
    @Produces(MediaType.APPLICATION_JSON)
    public List<AddressGetterDto> getAllAddresses() {
        return new AddressRepo().getAllAddresses();
    }

    @POST
    @Path("postNewAddress")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Address addAddress(AddressSetterDto addressSetterDto) {
        return new AddressRepo().addAddress(addressSetterDto);
    }

    @PUT
    @Path("putAddress")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Address updateAddress(AddressSetterDto addressSetterDto) {
        return new AddressRepo().updateAddress(addressSetterDto);
    }


}
