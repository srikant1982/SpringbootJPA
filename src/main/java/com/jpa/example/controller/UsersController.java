package com.jpa.example.controller;

import com.jpa.example.dto.UserRequest;
import com.jpa.example.entity.Users;
import com.jpa.example.service.UsersService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/main")
@RequiredArgsConstructor
public class UsersController {

    private final UsersService usersService;

   /* @PostMapping("/users")
    public List<UserRequest> createAllUser(@RequestBody List<Users> UserRequest) {
        return usersService.createAllUser(UserRequest);
    }*/

    @PostMapping("/user")
    public Users createSingleUser(@RequestBody @Valid UserRequest UserRequest) {
        return usersService.createUser(UserRequest);
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
