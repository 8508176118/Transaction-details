package com.nayamsoft.transaction;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionService {

	@Autowired
	private TransactionRepository repo;
	 
	public List<Transaction> listAll(){
	 return repo.findAll();
	}
	//List<Transaction> listall=repo.findAll();
	// return listall;
	
	
	public void save(Transaction transaction) {
		repo.save(transaction);
	}
	
	public Transaction get(Integer id) {
		return repo.findById(id).get();
	}
	
	public void delete(Integer id) {
		repo.deleteById(id);
	}
	
}
