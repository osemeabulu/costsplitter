package com.slg.costsplitter.transaction;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="transaction")
public class Transaction {
	
	@Id
	private Long id;
	
	@Column(name="description")
	private String name;
	
	@Column(name="transaction_date")
	private String date;
	
	@Column(name="trip")
	private String trip;
	
	@Column(name="payer")
	private Long payerId;
	
	public Transaction() {
		
	}
	
	public Transaction(Long id, String name, String date, String trip, Long payerId) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
		this.trip = trip;
		this.payerId = payerId;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
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
	public Long getPayerId() {
		return payerId;
	}
	public void setPayerId(Long payerId) {
		this.payerId = payerId;
	}
}
