package com.myjava.sharebook.user;

import jakarta.validation.constraints.Size;

public class User {

    private String email;
    @Size(min = 2, max = 25, message = "Firstname Entre 2 et 25 caracteres SVP")
    private String firstName;
    @Size(min = 2, max = 25, message = "Lastname Entre 2 et 25 caracteres SVP")
    private String lastName;
    private String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstname) {
        this.firstName = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastname) {
        this.lastName = lastname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
