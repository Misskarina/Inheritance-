package com.karina.Inheritance;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="Debit")
public class DebitCard extends Account 
{
	int debitid;
	double debitno;
	double overdraft;
	
	public int getDebitid() {
		return debitid;
	}
	public void setDebitid(int debitid) {
		this.debitid = debitid;
	}
	public double getDebitno() {
		return debitno;
	}
	public void setDebitno(double debitno) {
		this.debitno = debitno;
	}
	public double getOverdraft() {
		return overdraft;
	}
	public void setOverdraft(double overdraft) {
		this.overdraft = overdraft;
	}
	
	
}
