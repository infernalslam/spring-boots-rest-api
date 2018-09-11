package com.example.demo.controllers;

import com.example.demo.models.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserControllers {
    @GetMapping("/")
    public ResponseEntity<User> getUser () {
        User user = new User().setName("tak").setSurname("mint").setAge(19);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }
}
