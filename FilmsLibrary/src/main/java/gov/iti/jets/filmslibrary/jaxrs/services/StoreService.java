package gov.iti.jets.filmslibrary.jaxrs.services;


import gov.iti.jets.filmslibrary.dtos.storeDtos.StoreGetterDto;
import gov.iti.jets.filmslibrary.dtos.storeDtos.StoreSetterDto;
import gov.iti.jets.filmslibrary.repository.StoreRepo;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("store")
public class StoreService {

    @GET
    @Path("getAllStores")
    @Produces(MediaType.APPLICATION_JSON)
    public List<StoreGetterDto> getAllStores() {
        return new StoreRepo().getAllStores();
    }

    @POST
    @Path("postNewStore")
    @Consumes(MediaType.APPLICATION_JSON)
    public boolean addStore(StoreSetterDto storeSetterDto) {
        return new StoreRepo().addStore(storeSetterDto);
    }

    @PUT
    @Path("putStore")
    @Consumes(MediaType.APPLICATION_JSON)
    public boolean updateStore(StoreSetterDto storeSetterDto) {
        return new StoreRepo().updateStore(storeSetterDto);
    }

}
