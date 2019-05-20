package com.example.accounts;

import java.util.Date;

public class Staff extends Person {

    //Fields
    private static String Rank;
    private static HomeAddress Address;
    private static String OfficeAddress;

    private static String EmploymentType;

    private static Date EmploymentDate;
    public Staff(){}

    public Staff(String name, String sex, String phone, String email, Date dateOfBirth, String username, String password, String rank, HomeAddress address, String officeAddress, String employmentType, Date employmentDate){
        super(name, sex, phone, email, dateOfBirth, username, password);
        setRank(rank);
        setAddress(address);
        setOfficeAddress(officeAddress);
        setEmploymentType(employmentType);
        setEmploymentDate(employmentDate);
    }

    public static String getRank() {
        return Rank;
    }

    public static void setRank(String rank) {
        Rank = rank;
    }

    public static HomeAddress getAddress() {
        return Address;
    }

    public static void setAddress(HomeAddress address) {
        Address = address;
    }

    public static String getOfficeAddress() {
        return OfficeAddress;
    }

    public static void setOfficeAddress(String officeAddress) {
        OfficeAddress = officeAddress;
    }

    public static String getEmploymentType() {
        return EmploymentType;
    }

    public static void setEmploymentType(String employmentType) {
        EmploymentType = employmentType;
    }

    public static Date getEmploymentDate() {
        return EmploymentDate;
    }

    public static void setEmploymentDate(Date employmentDate) {
        EmploymentDate = employmentDate;
    }

    @Override
    public String toString() {
        return String.format("Name > %s: DateOfBirth > %s: Sex > %s: Phone > %s: Email > %s: Rank > %s: HomeAddress > %s: OfficeAddress > %s: EmploymentType > %s: EmploymentDate > %s: Username > %s",
                getName(), getDateOfBirth(), getSex(), getPhone(), getEmail(), getRank(), getAddress(), getOfficeAddress(), getEmploymentType(), getEmploymentDate(), getUsername());
    }
}
