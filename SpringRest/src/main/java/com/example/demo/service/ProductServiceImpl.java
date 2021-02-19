package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Product;
import com.example.demo.repositories.ProductRepository;

@Service("productService")
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;

	@Override
	public Optional<Product> getProduct(int id) {
		// TODO Auto-generated method stub
//		try {
//			String query = "Select * from Product where Id='" + id + "'";
//			preparedStatement = ConnectionHandler.getConnection().prepareStatement(query);
//			ResultSet resultSet = preparedStatement.executeQuery();
//			while (resultSet.next()) {
//				product = new Product();
//				product.setId(resultSet.getInt(1));
//				product.setName(resultSet.getString(2));
//				product.setPrice(resultSet.getFloat(3));
//			}
//		} catch (ClassNotFoundException | SQLException e) {
//			e.printStackTrace();
//		}
//		System.out.println(product);
//		return product;
		return productRepository.findById(id);
	}

}
