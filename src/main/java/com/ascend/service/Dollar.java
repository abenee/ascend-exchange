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
		return exchange(Currency.DOLLAR, Currency.DOLLAR);
	}

	@Override
	public double getApple() {
		return exchange(Currency.DOLLAR, Currency.APPLE);
	}

	@Override
	public double getBanana() {
		return exchange(Currency.DOLLAR, Currency.BANANA);
	}

}
