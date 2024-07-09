package com.examples.product_management;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

class Product {
    private int id;
    private String name;
    private double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{id=" + id + ", name='" + name + "', price=" + price + "}";
    }
}

public class ProductManagement {
    private static final Logger logger = (Logger) LogManager.getLogger(ProductManagement.class);
    private List<Product> products = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ProductManagement pm = new ProductManagement();
        pm.run();
    }

    public void run() {
        while (true) {
            logger.info("Displaying menu options");
            System.out.println("1. Add Product");
            System.out.println("2. View Products");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // consume newline

            switch (choice) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    viewProducts();
                    break;
                case 3:
                    logger.info("Exiting the application");
                    System.out.println("Exiting...");
                    return;
                default:
                    logger.warn("Invalid option chosen: " + choice);
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private void addProduct() {
        logger.info("Adding a new product");
        System.out.print("Enter product ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();  // consume newline
        System.out.print("Enter product name: ");
        String name = scanner.nextLine();
        System.out.print("Enter product price: ");
        double price = scanner.nextDouble();

        Product product = new Product(id, name, price);
        products.add(product);
        logger.info("Product added: " + product);
        System.out.println("Product added successfully.");
    }

    private void viewProducts() {
        logger.info("Viewing all products");
        if (products.isEmpty()) {
            System.out.println("No products available.");
        } else {
            for (Product product : products) {
                System.out.println(product);
            }
        }
    }
}