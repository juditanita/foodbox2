package com.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.entity.Product;

@Service
public interface ProductService {

	Product saveProduct(Product product);

	Product updateProduct(Product product);

	void deleteProduct(Integer id);

	Long numberOfProducts();

	List<Product> findAllProducts();

}
