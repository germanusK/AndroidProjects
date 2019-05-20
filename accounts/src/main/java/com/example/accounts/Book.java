package com.example.accounts;

import com.example.accounts.Item;

import java.util.Date;

public class Book extends Item {

    //fields
    private static int Size;//number of pages
    private static int Edition;
    private static int Rating;

    public Book(){}
    public Book(String title, String author, String address, String description, String category, Date releaseDate, int size, int edition, int rating){
        super(title, author, address, description, category, releaseDate);
        setSize(size);
        setEdition(edition);
        setRating(rating);
    }

    public static int getSize() {
        return Size;
    }

    public static void setSize(int size) {
        Size = size;
    }

    public static int getEdition() {
        return Edition;
    }

    public static void setEdition(int edition) {
        Edition = edition;
    }

    public static int getRating() {
        return Rating;
    }

    public static void setRating(int rating) {
        Rating = rating;
    }

    @Override
    public String toString() {
        return String.format("Title > %s: Author > %s: Description > %s: Category > %s: ReleaseDate > %s: Size > %d: Edition > %d: Rating > %d: Location > %s",
                getTitle(), getAuthor(), getDescription(), getCategory(), getReleaseDate(), getSize(), getEdition(), getRating(), getAddress());
    }
}
