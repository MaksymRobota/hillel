package app.stream_API_h8;

import java.time.LocalDateTime;

public class Product {
    private final String category;
    private final double price;
    private final double discount;
    private final LocalDateTime createdAt;

    public Product(String category, double price, double discount, LocalDateTime createdAt) {
        if (discount < 0 || discount > 100) {
            throw new IllegalArgumentException("Discount must be between 0 and 100%");
        }

        this.category = category;
        this.price = price;
        this.discount = discount;
        this.createdAt = createdAt;
    }

    public double getDiscount() {
        return discount;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    @Override
    public String toString() {
        return "Product{" +
                "category='" + category + '\'' +
                ", price=" + price +
                ", discount=" + discount +
                ", createdAt=" + createdAt +
                '}';
    }
}
