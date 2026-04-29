package com.example.foodapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.foodapp.entity.Restaurant;
import com.example.foodapp.service.RestaurantService;

@RestController
public class RestaurantController {
	
	@Autowired
	private RestaurantService service;
	
	@PostMapping("/addrestaurants")
	public Restaurant addRestaurant(@RequestBody Restaurant r)
	{
		return service.save(r);
	}
	
	@GetMapping("/getrestaurants")
	public List<Restaurant> getAll()
	{
		return service.getAll();
	}
}
