package pbo1;

public class Product {
    private String name;
    private double price;
    private int quantity;

    // Konstruktor
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Getter dan Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Overloading
    public double calculateTotalPrice() {
        return price * quantity;
    }

    public double calculateTotalPrice(double discount) {
        return price * quantity * (1 - discount);
    }

    // Overriding
    @Override
    public String toString() {
        return "Product: " + name + ", Price: " + price + ", Quantity: " + quantity;
    }
}
