package app.stream.API_h8;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ProductFilter {
    public static List<Product> getFilteredProducts(List<Product> products, String category, double minPrice) {
        return products.stream()
                .filter(product -> category.equals(product.getCategory()))
                .filter(product -> product.getPrice() > minPrice)
                .toList();
    }

    public static List<Product> getDiscountedBooks(List<Product> products, String category) {
        return products.stream()
                .filter(product -> category.equals(product.getCategory()))
                .map(product -> new Product(
                        product.getCategory(),
                        product.getPrice() * (1 - product.getDiscount() / 100),
                        product.getDiscount(),
                        product.getCreatedAt()
                ))
                .toList();
    }

    public static Product getCheapestProduct(List<Product> products, String category) {
        return products.stream()
                .filter(product -> category.equals(product.getCategory()))
                .min(Comparator.comparing(Product::getPrice))
                .orElseThrow(() -> new IllegalArgumentException(
                        "Product [category: " + category + "] doesn't exist"
                ));
    }

    public static List<Product> getLastThreeAddedProducts(List<Product> products) {
        return products.stream()
                .sorted(Comparator.comparing(Product::getCreatedAt).reversed())
                .limit(3)
                .toList();
    }

    public static double calculateTotalCost(List<Product> products, String category, double maxPrice, Boolean withDiscount) {
        int currentYear = LocalDateTime.now().getYear();

        return products.stream()
                .filter(product -> category.equals(product.getCategory()))
                .filter(p -> p.getCreatedAt().getYear() == currentYear)
                .filter(p -> withDiscount ? p.getPrice() * (1 - p.getDiscount() / 100) <= maxPrice : p.getPrice() <= maxPrice)
                .mapToDouble(p -> p.getPrice() * (1 - p.getDiscount() / 100))
                .sum();
    }

    public static Map<String, List<Product>> groupByCategory(List<Product> products) {
        return products.stream()
                .collect(Collectors.groupingBy(Product::getCategory));
    }
}
