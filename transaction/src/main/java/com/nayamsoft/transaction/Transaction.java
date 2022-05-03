package com.nayamsoft.transaction;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="transaction_details")
public class Transaction {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column(name="account_number")
	private Integer account_number;
	@Column(name="account_name")
	private String account_name;
	@Column(name="bank_id")
	private String bank_id;
	@Column(name="bank_name")
	private String bank_name;
	@Column(name="transaction_id")
	private String transaction_id;
	@Column(name="amount")
	private Double amount;
	@Column(name="receiver_account_number")
	private Integer receiver_account_number;
	@Column(name="receiver_account_name")
	private String receiver_account_name;
	@Column(name="status")
	private String status;
	@Column(name="date")
	private Date date;

	public Transaction() {

	}

	public Transaction(Integer id, Integer account_number, String account_name, String bank_id,
			String bank_name, String transaction_id, Double amount, Integer receiver_account_number,
			String receiver_account_name, String status, Date date) {
	
		this.id = id;
		this.account_number = account_number;
		this.account_name = account_name;
		this.bank_id = bank_id;
		this.bank_name = bank_name;
		this.transaction_id = transaction_id;
		this.amount = amount;
		this.receiver_account_number = receiver_account_number;
		this.receiver_account_name = receiver_account_name;
		this.status = status;
		this.date = date;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAccount_number() {
		return account_number;
	}

	public void setAccount_number(Integer account_number) {
		this.account_number = account_number;
	}

	public String getAccount_name() {
		return account_name;
	}

	public void setAccount_name(String account_name) {
		this.account_name = account_name;
	}

	public String getBank_id() {
		return bank_id;
	}

	public void setBank_id(String bank_id) {
		this.bank_id = bank_id;
	}

	public String getBank_name() {
		return bank_name;
	}

	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}

	public String getTransaction_id() {
		return transaction_id;
	}

	public void setTransaction_id(String transaction_id) {
		this.transaction_id = transaction_id;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Integer getReceiver_account_number() {
		return receiver_account_number;
	}

	public void setReceiver_account_number(Integer receiver_account_number) {
		this.receiver_account_number = receiver_account_number;
	}

	public String getReceiver_account_name() {
		return receiver_account_name;
	}

	public void setReceiver_account_name(String receiver_account_name) {
		this.receiver_account_name = receiver_account_name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
