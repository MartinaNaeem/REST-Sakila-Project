package gov.iti.jets.filmslibrary.jaxrs.services;

import gov.iti.jets.filmslibrary.dtos.inventoryDtos.InventoryGetterDto;
import gov.iti.jets.filmslibrary.dtos.inventoryDtos.InventorySetterDto;
import gov.iti.jets.filmslibrary.repository.InventoryRepo;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("inventory")
public class InventoryService {
    @GET
    @Path("getAllInventories")
    @Produces(MediaType.APPLICATION_JSON)
    public List<InventoryGetterDto> getAllInventories(){
        return new InventoryRepo().getAllInventories();
    }

    @POST
    @Path("addInventory")
    @Consumes(MediaType.APPLICATION_JSON)
    public boolean  addInventory(InventorySetterDto inventorySetterDto){
        return new InventoryRepo().addInventory(inventorySetterDto);
    }

    @PUT
    @Path("updateInventory")
    public boolean updateInventory(InventorySetterDto inventorySetterDto){
       return new InventoryRepo().updateInventory(inventorySetterDto);
    }

    @DELETE
    @Path("deleteInventory")
    @Produces(MediaType.APPLICATION_JSON)
    public boolean deleteInventory(@QueryParam(value = "id") Integer id) {
        return new InventoryRepo().removeInventory(id);
    }

}
