package org.supplychain.main;


import org.supplychain.exception.*;
import org.supplychain.inventory.*;
import org.supplychain.items.*;

/**
 * *******************************************************
 * Package: org.supplychain.main
 * File: SmartSupplyChainApp.java
 * Author: Ochwada
 * Date: Monday, 28.Apr.2025, 5:20 PM
 * Description:
 * Objective:
 * *******************************************************
 */

public class SmartSupplyChainApp {
    public static void main(String[] args) {
        System.out.println("\uD83C\uDF9F️ === Welcome to Our Smart Supply Chain === \uD83C\uDF9F️\n");

        try {
            // --- Model Products
            Product doc1 = new Document("DOC1", "Book");
            Product ele1 = new Electronic("ELE1", "Phone");
            Perishable per1 = new Perishable("PER1", "Milk", 14);

            System.out.println("\uD83D\uDCA0 Model Product \uD83D\uDCA0");
            System.out.println("Type: " + doc1.getType() + ", Name: " + doc1.getName());
            System.out.print("Type: " + per1.getType() + ", Name: " + per1.getName() + ", ");

            // This will throw ExpiredProductException if expired
            System.out.println("Expired? " + per1.isExpired(18)); // More than expirationDay - true

            // --- Generic Storage Units

            System.out.println("\n\uD83D\uDC8E Generic Storage Units \uD83D\uDC8E");
            StorageUnit<String> docBox = new StorageUnit<>("How to Print in Java");
            StorageUnit<Integer> idBox = new StorageUnit<>(2);
            StorageUnit<String> unit = new StorageUnit<>("Book");
            System.out.println("Single Items");
            System.out.println("🔸" + unit.getItem());
            System.out.println("🔸" + docBox.getItem());
            System.out.println("🔸" + idBox.getItem());

            // --- Multi-Storage Unit
            MultiStorageUnit<String> names = new MultiStorageUnit<>();
            names.addItem("Milk");
            names.addItem("Phone");
            names.addItem("Book");

            if (names.getItems().isEmpty()) {
                throw new EmptyStorageException("MultiStorageUnit is empty.");
            }

            System.out.println(names);

        } catch (InvalidInputException | EmptyStorageException | ExpiredProductException e) {
            System.out.println("❗ Error: " + e.getMessage());
        }
    }
}
