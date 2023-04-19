package gov.iti.jets.filmslibrary.jaxrs.services;

import gov.iti.jets.filmslibrary.dtos.paymentDtos.PaymentGetterDto;
import gov.iti.jets.filmslibrary.dtos.paymentDtos.PaymentSetterDto;
import gov.iti.jets.filmslibrary.repository.PaymentRepo;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("payment")
public class PaymentService {

    @GET
    @Path("getAllPayments")
    @Produces(MediaType.APPLICATION_JSON)
    public List<PaymentGetterDto> getAllPayments() {
        return new PaymentRepo().getAllPayments();
    }

    @POST
    @Path("addPayment")
    @Consumes(MediaType.APPLICATION_JSON)
    public Boolean addPayment(PaymentSetterDto paymentSetterDto) {
        new PaymentRepo().addPayment(paymentSetterDto);
        return true;
    }
}
