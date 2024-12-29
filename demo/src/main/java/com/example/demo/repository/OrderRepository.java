package com.example.demo.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.example.demo.model.Order;

public interface OrderRepository extends ReactiveMongoRepository<Order, String> {
}