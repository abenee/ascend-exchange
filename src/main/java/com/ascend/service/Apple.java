package com.ascend.service;

import com.ascend.bean.Currency;

public class Apple extends CurrencyExchange {
	
	public Apple(double amount) {
		super.currency(amount);
	}
	
	public Apple(String amount) {
		super.currency(amount);
	}
	
	@Override
	public double getDollar() {
		return exchangeCurrency(Currency.APPLE, Currency.DOLLAR);
	}

	@Override
	public double getApple() {
		return exchangeCurrency(Currency.APPLE, Currency.APPLE);
	}

	@Override
	public double getBanana() {
		return exchangeCurrency(Currency.APPLE, Currency.BANANA);
	}

}
