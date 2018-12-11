package pl.pawoz.carshop.carShop;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CartController {
    private Cart cart;

    @PutMapping("/")
    public void createNewCart() {
        this.cart = new Cart();
    }

    @GetMapping("/")
    public String ceNewCart() {
        return "zzzz";
    }
}
