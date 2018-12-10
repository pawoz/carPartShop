package pl.pawoz.carshop.carShop;

public class Main {
    public static void main(String[] args) {
        Cart cart = new Cart();
        Product doors = new Doors();
        Product wheels = new Wheels();

        cart.addProductToCart(3, doors);
        cart.addProductToCart(4, doors);
        cart.addProductToCart(5, wheels);

        cart.printContent();
    }
}