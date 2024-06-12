package com.example.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class User {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    
    @Column(name = "id")
    private Integer id;

    @Column(name = "universe", length=45)
    private String universe;

    @Column(name = "password", length=255)
    private String password;
}