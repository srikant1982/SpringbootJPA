package com.jpa.example.service;

import com.jpa.example.dto.UserRequest;
import com.jpa.example.entity.Users;
import com.jpa.example.repository.UsersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UsersService {
    private final UsersRepository usersRepository;

    /*public List<UserRequest> createAllUser(List<UserRequest>  userRequest ) {
        return ((List<Users>) usersRepository
                .saveAll())
                .stream()
                .map(this::createAllUser)
                .collect(Collectors.toList())

                .stream()
                .map(this::userRequest)
                .collect(Collectors.toList());
    }*/

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
