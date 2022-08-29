package com.example.demo.Controllers;

import com.example.demo.Models.User;
import com.example.demo.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Api {


    @Autowired
    private UserRepo userRepo;

    @GetMapping("/")
    public List<User> getPage() {
        return userRepo.findAll();
    }

    @PostMapping("/create")
    public String createUser(@RequestBody User user) {

        userRepo.save(user);

        return "User created";

    }

}
