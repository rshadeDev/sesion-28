package com.example.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Characters {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    
    @Column(name = "id", nullable=false)
    private Integer id;
    
    @Column(name = "status", length=8)
    private String status;
    
    @Column(name = "created", length=45)
    private String created;
    
    @Column(name = "gender", length=45)
    private String gender;
    
    @Column(name = "species", length=45)
    private String species;
    
    @Column(name = "img", length=100)
    private String img;
    
    @Column(name = "name", length=100)
    private String name;
    
    @Column(name = "url", length=100)
    private String url;
    
    @OneToMany(mappedBy = "characters")
    private Location location_id;

    @OneToMany(mappedBy = "characters")
    private User user_id;

    @ManyToMany
    @JoinTable(
        name = "characters_episode",
        joinColumns = @JoinColumn(name = "characters_id"),
        inverseJoinColumns = @JoinColumn(name = "episode_id")
    )
    private List<Episode> episodes = new ArrayList<>();
}