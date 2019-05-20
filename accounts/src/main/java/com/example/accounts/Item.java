package com.example.accounts;

import java.util.Date;

public class Item {

    //Fields
    private static String Title;
    private static String Author;
    private static String Address;
    private static String Description;
    private static String Category;
    private static Date ReleaseDate;

    //Constructors
    public Item(){}

    public Item(String title, String author, String address, String description, String category, Date releaseDate){
        setTitle(title);
        setAuthor(author);
        setAddress(address);
        setCategory(category);
        setDescription(description);
        setReleaseDate(releaseDate);
    }

    public static String getTitle() {
        return Title;
    }

    public static void setTitle(String title) {
        Title = title;
    }

    public static String getAuthor() {
        return Author;
    }

    public static void setAuthor(String author) {
        Author = author;
    }

    public static String getAddress() {
        return Address;
    }

    public static void setAddress(String address) {
        Address = address;
    }

    public static String getDescription() {
        return Description;
    }

    public static void setDescription(String description) {
        Description = description;
    }

    public static String getCategory() {
        return Category;
    }

    public static void setCategory(String category) {
        Category = category;
    }

    public static Date getReleaseDate() {
        return ReleaseDate;
    }

    public static void setReleaseDate(Date releaseDate) {
        ReleaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return String.format("Title > %s: Author > %s: Description > %s: Category > %s: ReleaseDate > %s: Location > %s",
                getTitle(), getAuthor(), getDescription(), getCategory(), getReleaseDate(), getAddress());
    }
}
