package com.example.User_Management_1.controller;

import com.example.User_Management_1.model.User;
import com.example.User_Management_1.repository.UserRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserRepository userRepo;

    public UserController(UserRepository userRepo) {
        this.userRepo= userRepo;
    }

    @GetMapping
    public List<User> getAllUsers(){
        return userRepo.findAll();
    }
    @PostMapping
    public User addUser(@RequestBody User user){
        return userRepo.save(user);
    }
    @DeleteMapping("/{id}")
    public void DeleteUser(@PathVariable Long id){
         userRepo.deleteById(id);
    }
}
