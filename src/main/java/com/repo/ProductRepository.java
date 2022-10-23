package com.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.Product;


@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
	
	Optional<Product>findById(int id);

}
