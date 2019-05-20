package com.example.accounts;

import java.util.Date;

public class Admin extends Person {

    //Additional fields
    private static HomeAddress HomeAddress;

    public Admin(){
    }//no argument constructor

    public Admin(String name, String sex, String phone, String email, Date dateOfBirth, String username, String password, HomeAddress homeAddress){
        super(name, sex, phone, email, dateOfBirth, username, password);
        setHomeAddress(homeAddress);
    }

    public static HomeAddress getHomeAddress() {
        return HomeAddress;
    }

    public static void setHomeAddress(HomeAddress homeAddress) {
        HomeAddress = homeAddress;
    }

}
