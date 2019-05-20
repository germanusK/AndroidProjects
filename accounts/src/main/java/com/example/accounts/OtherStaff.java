package com.example.accounts;

import java.util.Date;

public class OtherStaff extends Staff {

    //fields
    private static String Job;

    //constructor
    public OtherStaff(){}
    public OtherStaff(String name, String sex, String phone, String email, Date dateOfBirth, String username, String password, String rank, HomeAddress address, String officeAddress, String employmentType, Date employmentDate, String job){
        super(name, sex, phone, email, dateOfBirth, username, password, rank, address, officeAddress, employmentType, employmentDate);
        setJob(job);
    }

    public static String getJob() {
        return Job;
    }

    public static void setJob(String job) {
        Job = job;
    }
}