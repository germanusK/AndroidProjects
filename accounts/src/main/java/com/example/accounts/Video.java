package com.example.accounts;

import java.util.Date;

public class Video extends Item {

    //Fields
    private static int Length;//in minutes
    private static String VideoCategory;

    //Constructors
    public Video(){}

    public Video(String title, String author, String description, String category, Date releaseDate, int length, String videoCategory, String address){
        super(title, author, address, description, category, releaseDate);
        setLength(length);
        setVideoCategory(videoCategory);
    }

    public static int getLength() {
        return Length;
    }

    public static void setLength(int length) {
        Length = length;
    }

    public static String getVideoCategory() {
        return VideoCategory;
    }

    public static void setVideoCategory(String videoCategory) {
        VideoCategory = videoCategory;
    }

    @Override
    public String toString() {
        return String.format("Title > %s: Author > %s: Description > %s: Category > %s: ReleaseDate > %s: Length > %d: VideoCategory > %s: A=Location",
                getTitle(), getAuthor(), getDescription(), getCategory(), getReleaseDate(), getLength(), getVideoCategory(), getAddress());
    }
}
