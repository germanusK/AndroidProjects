package com.example.accounts;

import java.util.Calendar;
import java.util.Date;

public class Person {

    //Fields
    private static String Name;
    private static String Sex;
    private static String Phone;
    private static String Email;
    private static Date DateOfBirth;
    private static String Username;
    private static String Password;

    public Person(){
    }//no argument constructor

    public Person(String name, String sex, String phone, String email, Date dateOfBirth, String username, String password){
        setName(name);
        setSex(sex);
        setPhone(phone);
        setEmail(email);
        setDateOfBirth(dateOfBirth);
        setUsername(username);
        setPassword(password);
    }

    public static String getName() {
        return Name;
    }

    public static void setName(String name) {
        Name = name;
    }

    public static Date getDateOfBirth() {
        return DateOfBirth;
    }

    public static void setDateOfBirth(Date dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

    public static String getSex() {
        return Sex;
    }

    public static void setSex(String sex) {
        Sex = sex;
    }

    public static String getPhone() {
        return Phone;
    }

    public static void setPhone(String phone) {
        Phone = phone;
    }

    public static String getUsername() {
        return Username;
    }

    public static void setUsername(String username) {
        Username = username;
    }

    public static String getPassword() {
        return Password;
    }

    public static void setPassword(String password) {
        Password = password;
    }

    public static String getEmail() {
        return Email;
    }

    public static void setEmail(String email) {
        Email = email;
    }

    public long getAge(){
        return Calendar.getInstance().getTime().getTime() - DateOfBirth.getTime();
    }
}
