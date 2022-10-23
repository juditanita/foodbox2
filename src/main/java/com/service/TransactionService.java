package com.service;

import java.util.List;

import org.springframework.stereotype.Service;


import com.entity.Transaction;


@Service
public interface TransactionService {

	Transaction saveTransaction(Transaction transaction);

	Long numberOfTransactions();

	List<Transaction> findAllTransactions();

}
