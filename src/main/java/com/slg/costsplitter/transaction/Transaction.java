package com.slg.costsplitter.transaction;

public class Transaction {

	
	
	private String id;
	private String name;
	private String date;
	private String trip;
	private String payerId;
	
	public Transaction() {
		
	}
	
	public Transaction(String id, String name, String date, String trip, String payerId) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
		this.trip = trip;
		this.payerId = payerId;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTrip() {
		return trip;
	}
	public void setTrip(String trip) {
		this.trip = trip;
	}
	public String getPayerId() {
		return payerId;
	}
	public void setPayerId(String payerId) {
		this.payerId = payerId;
	}
}
