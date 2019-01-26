package com.slg.costsplitter.transaction;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TransactionService {
	
	List<Transaction> transactions = new ArrayList<Transaction>();
	
	public TransactionService() {
		transactions.add(new Transaction("1", "uber", "today", "VEGAS", "Semai"));
		transactions.add(new Transaction("2", "pizza", "today", "Vegas", "Seun"));
		transactions.add(new Transaction("3", "club", "today", "LA", "D"));
		transactions.add(new Transaction("4", "drinks", "today", "LA", "Henry"));
	}
	
	
	public List<Transaction> getAllTransactions(){
		return transactions;
	}
	
	public Transaction getTransaction(String id) {
		return transactions.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}


	public void addTransaction(Transaction transaction) {
		transactions.add(transaction);
		
	}


	public void updateTransaction(Transaction transaction, String id) {
		for(Transaction t : transactions) {
			if(t.getId().equals(id)) {
				//transactions.set(index, transaction);
			}
		}
		
	}


	public void deleteTransaction(String id) {
		transactions.removeIf(t -> t.getId().equals(id));
	}
}
