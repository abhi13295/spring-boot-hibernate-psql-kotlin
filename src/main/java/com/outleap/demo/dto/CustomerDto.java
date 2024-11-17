package com.outleap.demo.dto;

public class CustomerDto {

    public String name;
    public String email;
    public String contactNumber;

    CustomerDto(String name, String email, String contactNumber) {
        this.name = name;
        this.email = email;
        this.contactNumber = contactNumber;
    }

    CustomerDto() {}
}
