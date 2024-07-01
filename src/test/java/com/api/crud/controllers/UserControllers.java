/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.api.crud.controllers;

import com.api.crud.models.UserModel;
import com.api.crud.repositories.IUserRepository;
import com.api.crud.services.UserServices;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ricar
 */

@RestController
@RequestMapping("/user")

public class UserControllers {
    
    @Autowired
    private UserServices userService;
    
    @GetMapping
    public ArrayList<UserModel> getUsers(){
        return this.userService.getUsers();
    }
    
    @PostMapping
    public UserModel savedIser(@RequestBody UserModel user){
        return this.userService.saveUser(user);
    }
    
    @GetMapping(path = "/{id}")
    public Optional<UserModel> getUserById(@PathVariable("id") Long id){
        return this.userService.getById(id);
    }
    
    
    @PutMapping(path = "/{id}")
    public UserModel updateUserById(@RequestBody UserModel request, Long id){ 
        return this.userService.updateById(request, id);
       
    }
    
}
