package com.example.foodapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.foodapp.entity.Orders;

public interface OrderRepository extends JpaRepository<Orders, Integer> {

}
