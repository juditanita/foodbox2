package com.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Product;
import com.repo.ProductRepository;

@Service
@Transactional
public class ProductServiceImp implements ProductService{
	
	@Autowired
	private ProductRepository productRepository;
	
	
	

	@Override
	public Product saveProduct(Product product) {
	
		return productRepository.save(product);
	}

	@Override
	public Product updateProduct(Product product) {
		
		return productRepository.save(product);
	}

	@Override
	public void deleteProduct(Integer id) {
		deleteProduct(id);
		
	}

	@Override
	public Long numberOfProducts() {
		
		return productRepository.count();
	}

	@Override
	public List<Product> findAllProducts() {
		
		  return productRepository.findAll();
	}

	
}
