package com.karina.Inheritance;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;

@Entity
@Table(name="Account")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Account
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	double accountno;
	String holdername;
	String gender;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getAccountno() {
		return accountno;
	}
	public void setAccountno(double accountno) {
		this.accountno = accountno;
	}
	public String getHoldername() {
		return holdername;
	}
	public void setHoldername(String holdername) {
		this.holdername = holdername;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	

}
