package com.example.demo.service;

import java.util.Optional;

import com.example.demo.entities.Product;
public interface ProductService {

	public Optional<Product> getProduct(int id);
	
}
