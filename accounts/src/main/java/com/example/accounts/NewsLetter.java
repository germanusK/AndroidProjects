package com.example.accounts;

import java.util.Date;

public class NewsLetter extends Item {

    //Fields
    private static String NewsCategory;

    //Constructor
    public NewsLetter(){}

    public NewsLetter(String title, String author, String description, String category, Date releaseDate, String newsCategory, String address)
    {
        super(title, author, address, description, category, releaseDate);
        setNewsCategory(newsCategory);
    }

    public static String getNewsCategory() {
        return NewsCategory;
    }

    public static void setNewsCategory(String newsCategory) {
        NewsCategory = newsCategory;
    }

    @Override
    public String toString() {
        return String.format("Title > %s: Author > %s: Description > %s: Category > %s: ReleaseDate > %s: NewsCategory > %s: Location > %s",
                getTitle(), getAuthor(), getDescription(), getCategory(), getReleaseDate().toString(), getNewsCategory(), getAddress());
    }
}