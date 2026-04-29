package com.example.foodapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.foodapp.dto.UserDTO;
import com.example.foodapp.entity.User;
import com.example.foodapp.repository.UserRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;
	
	public User saveUser(UserDTO dto)
	{
		User user = new User();
		user.setName(dto.getName());
		user.setAddress(dto.getAddress());
		user.setEmail(dto.getEmail());
		return repo.save(user);
	}
	
	public List<User> getAllUsers()
	{
		return repo.findAll();
	}
	
	public User getUser(Integer id) {
	    return repo.findById(id)
	               .orElseThrow(() -> new EntityNotFoundException("User not found: " + id));
	}
	
	public User updateUser(Integer id, UserDTO dto)
	{
		User existingUser = repo.findById(id).orElseThrow(()->new EntityNotFoundException("User not found"+id));
		
		existingUser.setName(dto.getName());
		existingUser.setEmail(dto.getEmail());
		existingUser.setAddress(dto.getAddress());
		
		return repo.save(existingUser);
		
		
	}

}

