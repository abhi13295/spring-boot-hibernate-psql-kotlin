package com.outleap.demo.entity;


import jakarta.persistence.*;
import org.hibernate.annotations.SQLRestriction;

@Entity(name = "customer")
@SQLRestriction(value = "is_delete = false")
public class Customer extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(name = "name")
    public String name;

    @Column(name = "email")
    public String email;

    @Column(name = "contact_number")
    public String contactNumber;

}
