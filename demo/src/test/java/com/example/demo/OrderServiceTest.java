package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.service.OrderService;

class OrderServiceTest {

    @Autowired
    private OrderService orderService;

    @Test
    void testCreateOrder() {
        // Implementar prueba para crear un pedido
    }

    @Test
    void testGetOrderById() {
        // Implementar prueba para obtener un pedido por ID
    }
}