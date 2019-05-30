package com.commands;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Customer {

    @NotNull(message = "is Required")
    @Size(min = 3)
    private String firstName;

    @NotNull(message = "is Required")
    @Size(min = 3)
    private String lastName;

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
}
