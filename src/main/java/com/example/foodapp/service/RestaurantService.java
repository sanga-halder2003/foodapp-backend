package com.example.foodapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.foodapp.entity.Restaurant;
import com.example.foodapp.repository.RestaurantRepository;

@Service
public class RestaurantService {
	@Autowired
    private RestaurantRepository repo;

    public Restaurant save(Restaurant r) {
        return repo.save(r);
    }

    public List<Restaurant> getAll() {
        return repo.findAll();
    }

	
}
