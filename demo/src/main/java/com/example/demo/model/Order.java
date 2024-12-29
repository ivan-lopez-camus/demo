package com.example.demo.model;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
public class Order {
    private String id;
    private String customerId;
    private List<String> productIds;
    private double total;

    // Getters y Setters
}