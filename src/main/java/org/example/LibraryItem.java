package org.example;

public abstract class LibraryItem {
    public String title;
    public int releaseYear;

    public LibraryItem(String title, int releaseYear) {
        this.title =title;
        this.releaseYear =releaseYear;
    }

    //Returns library items--Book or DVD
    public abstract String getItemType();

    //Returns the details of the library item
    public abstract String getItemDetails();


}
