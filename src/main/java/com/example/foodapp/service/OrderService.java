package com.example.foodapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.foodapp.entity.Orders;
import com.example.foodapp.repository.OrderRepository;

@Service
public class OrderService {
	@Autowired
    private OrderRepository repo;

    public Orders placeOrder(Orders order) {
        return repo.save(order);
    }

    public List<Orders> getAll() {
        return repo.findAll();
    }
}
