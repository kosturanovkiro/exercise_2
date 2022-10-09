package com.example.training;
import com.example.training.Address;
public class Student {
    private String firstName;
    private String lastName;
    private int index;
    private String email;
    private String phoneNumber;
    private String university;
    private int credits;
    private Address address;

    public Student(){}
    public Student(String firstName, String lastName, int index, String email, String phoneNumber, String university,int credits,Address address) {
        this.firstName = firstName;
        this.index = index;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.university = university;
        this.credits = credits;
        this.address = address;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getUniversity() {
        return university;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public int getCredits() {
        return credits;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

}
