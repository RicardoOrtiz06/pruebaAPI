/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.api.crud.services;

import com.api.crud.models.UserModel;
import com.api.crud.repositories.IUserRepository;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 *
 * @author ricar
 */
public class UserServices {
 
    @Autowired
    private IUserRepository userRepository;
    
    
    public ArrayList<UserModel> getUsers(){
        return (ArrayList<UserModel>) userRepository.findAll();
    }
    
    
    public UserModel saveUser(UserModel user){
            return  userRepository.save(user);
    }
    
    public Optional<UserModel> getById(Long id){
    
        return userRepository.findById(id);
    }
    
    
    public UserModel updateById(UserModel request, Long id){
            
        UserModel user = userRepository.findById(id).get();
        
        user.setFirstName(request.getFirstName());
        user.setLastName(request.getLastName());
        user.setEmail(request.getEmail());
        
        return user;
                
    }
 
    
}
