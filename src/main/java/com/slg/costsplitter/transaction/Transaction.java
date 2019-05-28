package com.slg.costsplitter.transaction;

import java.sql.Date;

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
	private Date date;
	
	@Column(name="trip_id")
	private Long trip;
	
	@Column(name="payer_id")
	private Long payerId;
	
	public Transaction() {
		
	}
	
	public Transaction(Long id, String name, Date date, Long trip, Long payerId) {
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
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Long getTrip() {
		return trip;
	}
	public void setTrip(Long trip) {
		this.trip = trip;
	}
	public Long getPayerId() {
		return payerId;
	}
	public void setPayerId(Long payerId) {
		this.payerId = payerId;
	}
}
