package com.oehm4.account.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "account_details")
public class AccountDTO implements Serializable{

	@Id
	@Column(name = "ID")
	private Long id;
	@Column(name = "ACCOUNT_NUMBER")
	private String accountNumber;
	@Column(name = "ACCOUNT_HOLDER_NAME")
	private String accountHodlerName;
	@Column(name = "ADDRESS")
	private String address;
	@Column(name = "MOBILE_NUMBER")
	private Long mobileNumber;
	@Column(name = "BALANCE")
	private Double balance;
	
	public AccountDTO() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public String getAccountHodlerName() {
		return accountHodlerName;
	}

	public String getAddress() {
		return address;
	}

	public Long getMobileNumber() {
		return mobileNumber;
	}

	public Double getBalance() {
		return balance;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void setAccountHodlerName(String accountHodlerName) {
		this.accountHodlerName = accountHodlerName;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}
}
	
	


