package com.example.accounts;

import java.util.Date;

public class Student extends Person {

    //Extra fields
    private static int Frequency;
    private static String Conduct;

    public Student(String name, String sex, String phone, String email, Date dateOfBirth, String username, String password, int frequency, String conduct){
        super(name, sex, phone, email, dateOfBirth, username, password);
        setFrequency(frequency);
        setConduct(conduct);
    }

    public static int getFrequency() {
        return Frequency;
    }

    public static void setFrequency(int frequency) {
        Frequency = frequency;
    }

    public static String getConduct() {
        return Conduct;
    }

    public static void setConduct(String conduct) {
        Conduct = conduct;
    }

}
