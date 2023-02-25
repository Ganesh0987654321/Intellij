package com.example.demo_Ganesh.controller;

import com.example.demo_Ganesh.entity.User;
import com.example.demo_Ganesh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private UserService userService;
    @PostMapping(value="/addUser" , consumes="application/json")
    public ResponseEntity<User> addUser(@RequestBody User user){

        User user1 = userService.addUser(user);
        return new ResponseEntity<User>(user1, HttpStatus.CREATED);
    }

}
