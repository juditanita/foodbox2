package com.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.entity.Transaction;

@Repository
public interface TransactionRepo extends JpaRepository<Transaction, Integer>{

	Optional<Transaction>findById(int id);
	
	

}
