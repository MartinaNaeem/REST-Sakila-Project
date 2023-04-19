package gov.iti.jets.filmslibrary.jaxrs.services;


import gov.iti.jets.filmslibrary.dtos.customerDtos.CustomerGetterDto;
import gov.iti.jets.filmslibrary.dtos.customerDtos.CustomerSetterDto;
import gov.iti.jets.filmslibrary.repository.CustomerRepo;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.*;

import java.util.List;

@Path("customer")
public class CustomerService {
    @Context private UriInfo uriInfo;

    @GET
    @Path("getAllCustomers")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllCustomers() {
        Link self = Link.fromUriBuilder(uriInfo.getAbsolutePathBuilder()).rel("self").build();
        GenericEntity entity = new GenericEntity<>(new CustomerRepo().getAllCustomers()){};
        System.out.println("link:  "+self);
        return Response.ok(entity).links(self).build();
    }

    @POST
    @Path("postNewCustomer")
    @Consumes(MediaType.APPLICATION_JSON)
    public boolean addCustomer(CustomerSetterDto customerSetterDto) {
        return new CustomerRepo().addCustomer(customerSetterDto);
    }

    @PUT
    @Path("putCustomer")
    @Consumes(MediaType.APPLICATION_JSON)
    public boolean updateCustomer(CustomerSetterDto customerSetterDto) {
        return new CustomerRepo().updateCustomer(customerSetterDto);
    }

    @DELETE
    @Path("deleteCustomer")
    public boolean deleteCustomer(@QueryParam(value = "id") short id) {
        return new CustomerRepo().removeCustomer(id);
    }


    @GET
    @Path("filterCustomer")
    @Produces(MediaType.APPLICATION_JSON)
    public List<CustomerGetterDto> filterCustomer(@QueryParam(value = "id") Short id,
                                                  @QueryParam(value = "name") String name,
                                                  @QueryParam(value = "phone") String phone,
                                                  @QueryParam(value = "country") String country,
                                                  @QueryParam(value = "city") String city,
                                                  @QueryParam(value = "email") String email) {

        return new CustomerRepo().filterCustomers(id, name, phone,country, city, email);
    }


}
