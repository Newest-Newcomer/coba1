package com.example.cobafirebase;

public class UserInformation {

    public String name;
    public String address;

    public UserInformation(){

    }

    public UserInformation(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

