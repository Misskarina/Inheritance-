package com.karina.Inheritance;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="Credit")
public class CreditCard extends Account
{
	int creditid;
	double cardno;
	String creditlimit;
	public int getCreditid() {
		return creditid;
	}
	public void setCreditid(int creditid) {
		this.creditid = creditid;
	}
	public double getCardno() {
		return cardno;
	}
	public void setCardno(double cardno) {
		this.cardno = cardno;
	}
	public String getCreditlimit() {
		return creditlimit;
	}
	public void setCreditlimit(String creditlimit) {
		this.creditlimit = creditlimit;
	}
	
	
	

}
