package com.example.h2mock.entities;


import lombok.Data;

import javax.persistence.*;

@Entity
@Table (name = "users")


public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String firstName, lastName, email;
}
