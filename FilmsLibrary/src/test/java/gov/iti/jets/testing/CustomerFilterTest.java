package gov.iti.jets.testing;

import gov.iti.jets.filmslibrary.dtos.customerDtos.CustomerGetterDto;
import jakarta.ws.rs.client.*;
import jakarta.ws.rs.core.GenericType;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.*;

import java.util.List;


class CustomerFilterTest {

    @Test
    void filterCustomer() {

        String filter1 = "country";
        String value1 = "Egypt";

        String filter2 = "city";
        String value2 = "Bilbays";

        Client client = ClientBuilder.newClient();

        List< CustomerGetterDto> customers  = client.target("http://localhost:8080/libraryRS/customer/filterCustomer")
                .queryParam(filter1,value1).queryParam(filter2,value2).request().get(new GenericType<>(){});

        for(CustomerGetterDto customer: customers){
            Assertions.assertThat(customer.getCountry()).isEqualTo(value1);
            Assertions.assertThat(customer.getCity()).isEqualTo(value2);
        }

    }


}