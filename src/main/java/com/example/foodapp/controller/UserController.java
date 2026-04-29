package com.example.foodapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.foodapp.dto.UserDTO;
import com.example.foodapp.entity.User;
import com.example.foodapp.service.UserService;

import jakarta.validation.Valid;

@RestController
public class UserController {
	
	@Autowired
	private UserService service;
	
	// saving user
	@PostMapping("/adduser")
	public User addUser(@Valid @RequestBody UserDTO dto)
	{
		return service.saveUser(dto);
	}
	
	// getting all user
	@GetMapping("/getallusers")
    public List<User> getUsers() {
        return service.getAllUsers();
    }
	
	// getting user by ID
	@GetMapping("/getuserbyid/{id}")
	public User getById(@PathVariable Integer id)
	{
		return service.getUser(id);
	}
	
	// updating user
	@PutMapping("/updateuser/{id}")
	public User updateUser(@PathVariable Integer id,@Valid @RequestBody UserDTO dto)
	{
		return service.updateUser(id, dto);
	}
}
