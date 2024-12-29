package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.model.Order;
import com.example.demo.repository.OrderRepository;

import jakarta.transaction.Transactional;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class OrderService {

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Transactional
    public Mono<Order> createOrder(Order order) {
        return orderRepository.save(order);
    }

    public Mono<Order> getOrderById(String id) {
        return orderRepository.findById(id);
    }

    public Flux<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    @Transactional
    public Mono<Order> updateOrder(String id, Order order) {
        return orderRepository.save(order);
    }

    @Transactional
    public Mono<Void> deleteOrder(String id) {
        return orderRepository.deleteById(id);
    }
}
