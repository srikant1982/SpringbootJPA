package com.jpa.example.repository;

import com.jpa.example.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends ListCrudRepository<Users,Integer> , JpaRepository<Users, Integer> {
}
