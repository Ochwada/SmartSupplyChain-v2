package org.supplychain.main;


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
        System.out.println("\uD83C\uDF9F\uFE0F === Welcome to Our Smart Supply Chain === \uD83C\uDF9F\uFE0F ");
        System.out.println();

        Product doc1 = new Document("DOC1", "Book");
        Product ele1 = new Electronic("ELE1", "Phone");
        Perishable per1 = new Perishable("PER1", "Milk", 14);

        System.out.println("Type: " + doc1.getType() + ", Name: " + doc1.getName());
        System.out.print("Type: " + per1.getType() + ", Name: " + per1.getName() + ", ");
        System.out.println(per1.isExpired(10));
        //System.out.println(((Perishable)per1).isExpired(10)); //  When type of 'per1' is 'Product'





    }
}
