package org.example;

public class LibraryApp {
    public static void main(String[] args) {
        LibraryOperations<LibraryItem> libraryManager = new LibraryManager<>();

        //Instantiate objects of Book and DVD classes
        Book book1 = new Book("The Jake Matthew Saga", 2019, "Josiah Akhtab", "9781705344514");
        Book book2 = new Book("Yet Holding On",2006, "Nicole Bird Faulkner","1424121876" );

        DVD dvd1 = new DVD("Toy Story",1995,"John Lasseter",81 );
        DVD dvd2 = new DVD("Fast and Furious",2001, "Rob Cohen", 106 );

        System.out.println("Library Management System\n");

        //Add items from the library
        libraryManager.addItem(book1);
        libraryManager.addItem(book2);
        libraryManager.addItem(dvd1);
        libraryManager.addItem(dvd2);

        //Displays the list of items in the library
        libraryManager.displayItems();

        //Remove items from the library
        libraryManager.removeItem(book1);
        libraryManager.removeItem(dvd2);

        //Displays updated list of items in the library
        libraryManager.displayItems();

    }
}