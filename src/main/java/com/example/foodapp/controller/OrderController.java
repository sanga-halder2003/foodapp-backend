package com.example.foodapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.foodapp.entity.Orders;
import com.example.foodapp.service.OrderService;

@RestController
public class OrderController {
	
	@Autowired
	private OrderService service ;
	
	@PostMapping("/placeorders")
	public Orders placeOrders(@RequestBody Orders order)
	{
		return service.placeOrder(order);
	}
	
	@GetMapping("/getorders")
    public List<Orders> getOrders() {
        return service.getAll();
    }
}
