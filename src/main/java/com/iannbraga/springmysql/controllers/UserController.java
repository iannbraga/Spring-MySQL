package com.iannbraga.springmysql.controllers;

import com.iannbraga.springmysql.entity.User;
import com.iannbraga.springmysql.repository.UserRepository;
import com.iannbraga.springmysql.services.UserServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@AllArgsConstructor
public class UserController {
    private final UserServiceImpl userService;

    @PostMapping("/save")
    public User saveUser(@RequestBody User user){
        return userService.save(user);
    }

    @GetMapping("/listAll")
    public Iterable<User> listAll(){
        return userService.listAll();
    }
    @PostMapping("/{id}")
    public User findById(@PathVariable Long id){
        return userService.findById(id);
    }

}
