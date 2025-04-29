package org.supplychain.inventory;


/**
 * *******************************************************
 * Package: org.supplychain.inventory
 * File: StorageUnit.java
 * Author: Ochwada
 * Date: Tuesday, 29.Apr.2025, 2:15 PM
 * Description: A generic class called {@code StorageUnit<T>} that can hold one item of any type {@code T}.
 * Objective: To demonstrate the use of Java Generics by creating a flexible and type-safe container
 *            that stores a single item, regardless of its data type.
 *
 *  @param <T> The type of the item to be stored.
 * *******************************************************
 */

public class StorageUnit<T> {

    private T item;


    /**
     * Constructs a StorageUnit with the specified item.
     *
     * @param item The item to store.
     */
    public StorageUnit(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }


    /**
     * Returns a string representation of the StorageUnit and its contents.
     *
     * @return A string describing the stored item.
     */
    @Override
    public String toString() {
        return "StorageUnit contains: " + item;
    }
}
