package com.jpa.example.service;

import com.jpa.example.entity.Users;
import com.jpa.example.repository.UsersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UsersService {
    private final UsersRepository usersRepository;

    public List<Users> createAllUser(List<Users> users) {
        return usersRepository.saveAll(users);
    }

    public List<Users> getAllUser(){
        return usersRepository.findAll();
    }

    public Users getUserById(Integer id) {
        return usersRepository.findById(id).orElse(null);
    }
}
