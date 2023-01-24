package com.jpa.example.service;

import com.jpa.example.dto.UserRequest;
import com.jpa.example.entity.Users;
import com.jpa.example.repository.UsersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UsersService {
    private final UsersRepository usersRepository;

    public List<Users> createAllUser(List<UserRequest>  userRequest ) {

        Users user ;
        List<Users> users = new ArrayList<>();
        for (UserRequest u1 : userRequest) {
            user = new Users();
            user.setFirstName(u1.getFirstName());
            user.setLastName(u1.getLastName());
            users.add(user);
        }
        return  usersRepository.saveAll(users);
    }

    public List<Users> getAllUser(){
        return usersRepository.findAll();
    }

    public Users createUser(UserRequest  userRequest ){
        Users user = new Users();

        user.setFirstName(userRequest.getFirstName());
        user.setLastName(user.getLastName());

        return usersRepository.save(user);
    }

    public Users getUserById(Integer id) {
        return usersRepository.findById(id).orElse(null);
    }
}
