package org.supplychain.items;


/**
 * *********************,**********************************
 * Package: org.supplychain
 * File: Product.java
 * Author: Ochwada
 * Date: Monday, 28.Apr.2025, 5:14 PM
 * Description:
 * Objective:
 * *******************************************************
 */

public abstract class Product {
    private final String id;
    private final String name;

    public Product(String id, String name){
        this.id = id;
        this.name = name;
    }

    // --- Abstract method  to get Type ---
    public  abstract String getType();

    // --- Getters
    public   String getName(){
        return  name;
    }

    public String getId() {
        return "PRO-"+id;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
