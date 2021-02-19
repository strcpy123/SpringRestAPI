package com.example.demo.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Product;

@Repository("Product")
public interface ProductRepository extends JpaRepository<Product, String> {

	Optional<Product> findById(int id);

}
