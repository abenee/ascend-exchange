package com.ascend.service;

import com.ascend.bean.Currency;

public abstract class CurrencyExchange {
	
	private double amount;
	
	public abstract double getDollar();
	
	public abstract double getApple();
	
	public abstract double getBanana();
	
	public void currency(String amount) {
	    this.amount = 0;
	}
	 
	public void currency(Double amount) {
		if (amount < 0) { 
			this.amount = 0;
		} else { 
			this.amount = amount;
		}
	}
	
	public double exchange(Currency from, Currency to) {
	    double totalAmount = amount * (to.rate / from.rate);
	    System.out.println("Total amount : " + totalAmount);
	    return totalAmount;
	}
	
	
}
