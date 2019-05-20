package com.example.accounts;

import com.example.accounts.HomeAddress;
import com.example.accounts.Staff;

import java.util.Date;

public class Manager extends Staff {

    //fields
    private static String Department;

    //constructor;
    public Manager(){}
    public Manager(String name, String sex, String phone, String email, Date dateOfBirth, String username, String password, String rank, HomeAddress address, String officeAddress, String employmentType, Date employmentDate, String department){
        super(name, sex, phone, email, dateOfBirth, username, password, rank, address, officeAddress, employmentType, employmentDate);
        setDepartment(department);
    }

    public static String getDepartment() {
        return Department;
    }

    public static void setDepartment(String department) {
        Department = department;
    }
}
