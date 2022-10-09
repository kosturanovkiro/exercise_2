package com.example.training;

public class Address {
    private String streetName;
    private int streetNumber;

    public Address(){}

    public Address(String streetName, int streetNumber){
        this.streetName=streetName;
        this.streetNumber=streetNumber;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getStreetName() {
        return streetName;
    }
    public void setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
    }
    public int getStreetNumber() {
        return streetNumber;
    }

}
