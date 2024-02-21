package com.example.demo.projectfurniture.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.projectfurniture.model.User;
@Repository
public interface UserRepo extends JpaRepository<User,Integer> {
    
}
