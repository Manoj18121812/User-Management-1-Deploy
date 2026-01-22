package com.example.User_Management_1.repository;

import com.example.User_Management_1.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
