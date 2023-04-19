package gov.iti.jets.filmslibrary;

import gov.iti.jets.filmslibrary.repository.FilmRepo;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String args[]) {
        // new CustomerService().getAllCustomers();

//        FilmFilterDto filmFilterDto = new FilmFilterDto();
//        filmFilterDto = FilmFilterDto.builder().category("Documentary").rate("PG")
//                .maxPrice(new BigDecimal(3)).build();

//        new FilmService().filterCustomers(filmFilterDto).stream().forEach(e-> System.out.println("category: "
//                +e.getCategory()+"\ntitle: "+ e.getTitle()+ " rate: "+ e.getRating()+" price: "+e.getPrice()));

//            System.out.println(new ActorFilmsService().getFilmsOFAnActor((short) 1).getFilms().get(0));


        /////////////////////get all films
//        new FilmRepo().getAllFilms().stream().forEach(e-> {System.out.println("==========film========"+e.getFid())
//        ;e.getActors().stream().forEach(x-> System.out.println(x));});

// //////////////get all films
//        new FilmRepo().getAllFilms().stream().forEach(e-> {System.out.println("==========film========"+e.getFid())
//        ;e.getInventoriesList().stream().forEach(x->{ System.out.println(x.getInventoryId());
//            System.out.println(x.getStoreId());});});

//        FilmSetterDto filmSetterDto = new FilmSetterDto();
//        filmSetterDto = FilmSetterDto.builder()
//                .actors(List.of((short)1,(short)2,(short)3))
//                .description("sh8ala bdo3a el waleden")
//                .category((short)1)
//                .languageId((short)1)
//                .length((short)5)
////                .releaseYear(new Date())
//                .rentalDuration((short)5)
//                .rentalRate(new BigDecimal(5))
//                .rating("PG")
//                .title("yarb ostorha")
//                .specialFeatures("Behind the Scenes")
//                .replacementCost(new BigDecimal(5))
//                .inventoryList(List.of(new EmbeddedInventory((short)1), new EmbeddedInventory((short)2),
//                                new EmbeddedInventory((short)1), new EmbeddedInventory((short)2)))
//                .build();
////
//        new FilmRepo().addFilm(filmSetterDto);
//
//
//
//
////        FilmSetterDto filmSetterDto = new FilmSetterDto();
////        filmSetterDto = FilmSetterDto.builder()
////                .filmId((short)1012)
////                .actors(List.of((short)4,(short)5,(short)6))
////                .description("sh8ala bdo3a el waleden2")
////                .category((short)2)
////                .languageId((short)2)
////                .length((short)52)
//////                .releaseYear(new Date())
////                .rentalDuration((short)52)
////                .rentalRate(new BigDecimal(52))
////                .rating("PG")
////                .title("yarb ostorha2")
////                .specialFeatures("Behind the Scenes")
////                .replacementCost(new BigDecimal(52))
////                .inventoryList(List.of(new EmbeddedInventory(4597,(short)1), new EmbeddedInventory(4596,(short)1),
////                                new EmbeddedInventory(4598,(short)2), new EmbeddedInventory(4599,(short)2)))
////                .build();
////
////        new FilmRepo().updateFilm(filmSetterDto);
//
//
//
//
//
////        new FilmRepo().removeFilm((short)1011);
//
    }
}
