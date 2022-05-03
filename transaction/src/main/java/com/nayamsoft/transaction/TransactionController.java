package com.nayamsoft.transaction;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api")
public class TransactionController {

	@Autowired
	private TransactionService service;
	
	@GetMapping("/transactions")
	public List<Transaction> list(){
		return service.listAll();
	}
}
