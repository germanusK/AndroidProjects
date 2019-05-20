package com.example.main;

public class Library {

    //Fields
    private static String Name;
    private static String Location;
    private static String Phone;
    private static String Email;
    private static String Type;

    //Constructor
    public Library(){}

    public Library(String name, String location, String phone, String email, String type){
        setName(name);
        setLocation(location);
        setPhone(phone);
        setEmail(email);
        setType(type);
    }

    public static String getName() {
        return Name;
    }

    public static void setName(String name) {
        Name = name;
    }

    public static String getLocation() {
        return Location;
    }

    public static void setLocation(String location) {
        Location = location;
    }

    public static String getPhone() {
        return Phone;
    }

    public static void setPhone(String phone) {
        Phone = phone;
    }

    public static String getEmail() {
        return Email;
    }

    public static void setEmail(String email) {
        Email = email;
    }

    public static String getType() {
        return Type;
    }

    public static void setType(String type) {
        Type = type;
    }

    @Override
    public String toString() {
        return String.format("Name > %s: Phone > %s: Email > %s: Location > %s: Type > %s", Name, Phone, Email, Location, Type);
    }
}