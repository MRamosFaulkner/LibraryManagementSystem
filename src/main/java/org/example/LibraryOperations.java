package org.example;

public interface LibraryOperations<T extends LibraryItem> {

    void addItem(T item);
    void removeItem(T item);
    void displayItems();

}
