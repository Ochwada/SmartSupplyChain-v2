package org.supplychain.inventory;

import java.util.*;

/**
 * *******************************************************
 * Package: org.supplychain.inventory
 * File: Package.java
 * Author: Ochwada
 * Date: Tuesday, 29.Apr.2025, 4:09 PM
 * Description:
 * The {@code Package<T>} class represents a container that groups multiple items of type {@code T}.
 * It is part of the inventory module in SmartSupplyChain and  is used to handle grouped product handling.
 * Objective:
 * - Demonstrate usage of Java Generics.
 * - Model real-world packaging in logistics.
 * - Support type-safe item grouping (e.g., Electronics, Documents).
 *
 * @param <T> the type of item this package holds
 *            *******************************************************
 */

public class Package<T> {

    private final List<T> items;


    public Package() {
        this.items = new ArrayList<>();
    }

    public void addItem(T item) {
        items.add(item);
    }

    public List<T> getItems() {
        return items;
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

}
