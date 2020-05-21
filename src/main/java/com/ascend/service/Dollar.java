package com.ascend.service;

import com.ascend.bean.Currency;

public class Dollar extends CurrencyExchange {

	public Dollar(double amount) {
		super.currency(amount);
	}
	
	public Dollar(String amount) {
		super.currency(amount);
	}
	
	@Override
	public double getDollar() {
		return exchangeCurrency(Currency.DOLLAR, Currency.DOLLAR);
	}

	@Override
	public double getApple() {
		return exchangeCurrency(Currency.DOLLAR, Currency.APPLE);
	}

	@Override
	public double getBanana() {
		return exchangeCurrency(Currency.DOLLAR, Currency.BANANA);
	}

}
