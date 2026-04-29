package com.example.foodapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.foodapp.entity.FoodItem;
import com.example.foodapp.repository.FoodItemRepository;

@Service
public class FoodItemService {
	
	@Autowired
	private FoodItemRepository repo;
	public FoodItem save(FoodItem item) {
        return repo.save(item);
    }

    public List<FoodItem> getAll() {
        return repo.findAll();
    }
	
}
