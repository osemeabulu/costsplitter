package com.slg.costsplitter.transaction;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransactionController {
	
	@Autowired
	private TransactionService transactionService;
	
	@RequestMapping("/transaction")
	public List<Transaction> getAllCosts() {
		
		return transactionService.getAllTransactions();
	}
	
	@RequestMapping("/transaction/{id}")
	public Transaction getTransactionById(@PathVariable String id) {	
		return transactionService.getTransaction(id);
	}
	
	@RequestMapping("/transaction/trip/{id}")
	public List<Transaction> getTransactionsPerTrip(String id) {
		
		return transactionService.getAllTransactions();
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/transaction" )
	public void addTransaction(@RequestBody Transaction transaction) {
		transactionService.addTransaction(transaction);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/transaction/{id}" )
	public void updateTransaction(@RequestBody Transaction transaction, @PathVariable String id) {
		transactionService.updateTransaction(transaction, id);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/transaction/{id}" )
	public void deleteTransaction( @PathVariable String id) {
		transactionService.deleteTransaction( id);
	}

}
