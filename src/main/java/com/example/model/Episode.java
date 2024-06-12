package com.example.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Episode {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id", nullable=false)
    private Integer id;

    @Column(name = "air_date", length=45)
    private String air_date;

    @Column(name = "episode", length=45)
    private String episode;

    @Column(name = "character", length=100)
    private String character;

    @Column(name = "name", length=100)
    private String name;

    @Column(name = "created", length=100)
    private String created;

    @Column(name = "url", length=100)
    private String url;
}