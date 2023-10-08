package com.dev.models;

import com.dev.services.KeyGenerator;

public class User {
    private long userId;
    private String firstName;
    private String lastName;
    private long phoneNumber;
    private String email;
    private String userPassword;

    public User() {
        setUserId(0);
    }

    public User(String firstName, String lastName, long phoneNumber, String email, String userPassword) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.userPassword = userPassword;
        this.userId = KeyGenerator.generateKey();
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        if (userId == 0)
            this.userId = KeyGenerator.generateKey();
        else this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                ", userPassword='" + userPassword + '\'' +
                '}';
    }
}