package pl.pawoz.carshop.carShop;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<OrderItem> productsInCart = new ArrayList<>();

    public void addProductToCart(int amount, Product product) {

        if (productExistsInCart(product)) {
            increaseAmountInCart(product, amount);
        } else {
            addToCart(amount, product);
        }
    }

    private boolean productExistsInCart(Product product) {
        for (OrderItem orderItem : productsInCart) {
            if (orderItem.getProduct().getClass().equals(product.getClass())) {
                return true;
            }
        }
        return false;
    }

    private void increaseAmountInCart(Product product, int amount) {
        for (OrderItem orderItem : productsInCart) {
            if (orderItem.getProduct().getClass().equals(product.getClass())) {
                orderItem.increaseAmountBy(amount);
            }
        }
    }

    private boolean addToCart(int amount, Product product) {
        return productsInCart.add(new OrderItem(amount, product));
    }

    public void printContent() {
        for (OrderItem orderItem : productsInCart) {
            System.out.println(orderItem);
        }
    }

    public List<OrderItem> getProductsInCart() {
        return productsInCart;
    }
}