package pl.pawoz.carshop.carShop.Controllers;

import org.springframework.web.bind.annotation.PutMapping;

public class CartController {

    @PutMapping("/")
    public void createNewCart() {
        System.out.println("a new cart has been created");


    }
}
