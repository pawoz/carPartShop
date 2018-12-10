package pl.pawoz.carshop.carShop;

public class OrderItem {
    int amount;
    Product product;

    public OrderItem(int amount, Product product) {
        this.amount = amount;
        this.product = product;
    }

    public void increaseAmountBy(int amount) {
        this.amount += amount;
    }

    public Product getProduct() {
        return product;
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "amount = " + amount +
                ", product = " + product +
                '}';
    }
}
