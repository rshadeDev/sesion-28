package com.example.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Location {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "dimension")
    private Integer dimension;

    @Column(name = "id", nullable=false)
    private Integer id;

    @Column(name = "created", length=45)
    private String created;

    @Column(name = "type", length=45)
    private String type;

    @Column(name = "name", length=100)
    private String name; 

    @Column(name = "residents_length", length=100)
    private String residents_length;

    @Column(name = "url", length=100)
    private String url;
}