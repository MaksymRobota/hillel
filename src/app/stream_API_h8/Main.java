package app.stream_API_h8;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Product> products = List.of(
                new Product("Book", 75, 0, LocalDateTime.now()),
                new Product("Phone", 1300, 0, LocalDateTime.now()),
                new Product("Book", 76, 10, LocalDateTime.now()),
                new Product("Phone", 2000, 0, LocalDateTime.now())
        );

        List<Product> filteredProducts = ProductFilter.getFilteredProducts(products, "Book", 250);
        System.out.println("Products category \"Book\" where Price > 250:");
        filteredProducts.forEach(System.out::println);

        List<Product> discountedBooks = ProductFilter.getDiscountedBooks(products, "Book");
        System.out.println("Products category \"Book\" with discount:");
        discountedBooks.forEach(System.out::println);

        Product cheapestProduct = ProductFilter.getCheapestProduct(products, "Book");
        System.out.println("Cheapest product category \"Book\":");
        System.out.println(cheapestProduct);


        List<Product> lastThreeProducts = ProductFilter.getLastThreeAddedProducts(products);
        System.out.println("Last three products: ");
        lastThreeProducts.forEach(System.out::println);


        double totalCost = ProductFilter.calculateTotalCost(products, "Book", 75, true);
        System.out.println("Sum: " + totalCost);

        Map<String, List<Product>> groupedProducts = ProductFilter.groupByCategory(products);

        groupedProducts.forEach((category, productList) -> {
            System.out.println("Category: " + category);
            productList.forEach(System.out::println);
        });
    }

}