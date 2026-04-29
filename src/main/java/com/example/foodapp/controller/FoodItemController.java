package com.example.foodapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.foodapp.entity.FoodItem;
import com.example.foodapp.service.FoodItemService;

@RestController
public class FoodItemController {
	
	@Autowired
	private FoodItemService service;
	
	@PostMapping("/addfood")
	public FoodItem addFood(@RequestBody FoodItem item)
	{
		return service.save(item);
	}
	
	@GetMapping("/getallfood")
	public List<FoodItem> getFoodItems()
	{
		return service.getAll();
	}
	
	
}
