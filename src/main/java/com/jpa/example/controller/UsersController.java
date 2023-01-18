package com.jpa.example.controller;

import com.jpa.example.entity.Users;
import com.jpa.example.service.UsersService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/main")
@RequiredArgsConstructor
public class UsersController {

    private final UsersService usersService;

    @PostMapping("/users")
    public List<Users> createAllUser(@RequestBody List<Users> users) {
        return usersService.createAllUser(users);
    }

    @GetMapping("/users")
    public List<Users> getAllUser(){
        return usersService.getAllUser();
    }

    @GetMapping("/user/{id}")
    public Users getUserById(@PathVariable Integer id) {
        return usersService.getUserById(id);
    }

}
