package com.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.entity.Transaction;
import com.repo.TransactionRepo;

@Service
@Transactional
public class TransactionServiceImp  implements TransactionService{
	
	
	@Autowired
	private TransactionRepo transactionRepo;
	
	
	
	@Override
	public Transaction saveTransaction(final Transaction ta) {
		return transactionRepo.save(ta);
	}
	
	@Override
	public Long numberOfTransactions() {
		return transactionRepo.count();
		
	}
	
	@Override
	  public List<Transaction> findAllTransactions(){
		  
		  return transactionRepo.findAll();
		  
		
}
}
