package org.supplychain.inventory;


import java.util.*;


/**
 * *******************************************************
 * Package: org.supplychain.inventory
 * File: MultiStorageUnit.java
 * Author: Ochwada
 * Date: Tuesday, 29.Apr.2025, 2:49 PM
 * Description: A generic class called {@code MultiStorageUnit<T>} that can hold multiple items of any type {@code T}
 * using a {@code List<T>}.
 * Objective: To demonstrate the use of generics and collections in Java by storing and managing a dynamic list
 * of items of any specified type.
 *
 * @param <T> The type of items to be stored.
 *            *******************************************************
 */

public class MultiStorageUnit<T> {

    private List<T> items;

    // Constructs an empty MultiStorageUnit.

    public MultiStorageUnit() {
        this.items = new ArrayList<>();
    }

    /**
     * Adds an item to the storage.
     *
     * @param item The item to add.
     */
    public void addItem(T item) {
        items.add(item);
    }

    /**
     * Retrieves all stored items.
     *
     * @return The list of stored items.
     */
    public List<T> getItems() {
        return items;
    }

    /**
     * Returns the number of items currently stored.
     *
     * @return The number of items.
     */
    public int size() {
        return items.size();
    }
    /**
     * Returns a string representation of the MultiStorageUnit and its contents.
     *
     * @return A string describing the stored items.
     */
    @Override
    public String toString() {
        return "MultiStorageUnit contains: " + items;
    }



}
