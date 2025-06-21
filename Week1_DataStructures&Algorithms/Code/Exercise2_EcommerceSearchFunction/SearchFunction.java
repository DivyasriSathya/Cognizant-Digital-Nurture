package ecommerce;

import java.util.Arrays;
import java.util.Comparator;

public class SearchFunction {

    // Linear search by name
    public static Product linearSearch(Product[] products, String name) {
        for (Product product : products) {
            if (product.productName.equalsIgnoreCase(name)) {
                return product;
            }
        }
        return null;
    }

    // Binary search by name (requires sorted array)
    public static Product binarySearch(Product[] products, String name) {
        int low = 0, high = products.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int cmp = products[mid].productName.compareToIgnoreCase(name);
            if (cmp == 0) return products[mid];
            else if (cmp < 0) low = mid + 1;
            else high = mid - 1;
        }
        return null;
    }

    // Main method
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Mobile", "Electronics"),
            new Product(102, "Shirt", "Clothing"),
            new Product(103, "Laptop", "Electronics"),
            new Product(104, "Shoes", "Footwear")
        };

        System.out.println("Linear Search for 'Laptop':");
        Product result1 = linearSearch(products, "Laptop");
        System.out.println(result1 != null ? result1 : "Product not found");

        // Sort the array for binary search
        Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));

        System.out.println("\nBinary Search for 'Laptop':");
        Product result2 = binarySearch(products, "Laptop");
        System.out.println(result2 != null ? result2 : "Product not found");
    }
}

