package com.example.demo.Models;

import javax.persistence.*;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String username;

    // getters and setters for id
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    // getters and setters for username
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }




}
