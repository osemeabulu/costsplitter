package com.slg.costsplitter.transaction;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionService {
	
	@Autowired
	private TransactionRepository transRepo;
	
	public TransactionService() {
		//transactions.add(new Transaction("1", "uber", "today", "VEGAS", "Semai"));
		//transactions.add(new Transaction("2", "pizza", "today", "Vegas", "Seun"));
		//transactions.add(new Transaction("3", "club", "today", "LA", "D"));
		//transactions.add(new Transaction("4", "drinks", "today", "LA", "Henry"));
	}	
	
	public List<Transaction> getAllTransactions(){
		List<Transaction> transactions = new ArrayList<Transaction>();
		transRepo.findAll().forEach(transactions::add);
		return transactions;
	}
	
	public Transaction getTransaction(Long id) {
		//return transactions.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		Transaction trans = new Transaction();
		if (!transRepo.findById(id).isPresent()) {
			trans = transRepo.findById(id).get();
		}
		return trans;
	}


	public void addTransaction(Transaction transaction) {
		transRepo.save(transaction);
		
	}


	public void updateTransaction(Transaction transaction, String id) {
		
		transRepo.save(transaction);
	}


	public void deleteTransaction(Long id) {
		transRepo.deleteById(id);
	}
}
