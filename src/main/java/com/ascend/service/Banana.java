package com.ascend.service;

import com.ascend.bean.Currency;

public class Banana extends CurrencyExchange {
	
	public Banana(double amount) {
		super.currency(amount);
	}
	
	public Banana(String amount) {
		super.currency(amount);
	}

	@Override
	public double getDollar() {
		return exchange(Currency.BANANA, Currency.DOLLAR);
	}

	@Override
	public double getApple() {
		return exchange(Currency.BANANA, Currency.APPLE);
	}

	@Override
	public double getBanana() {
		return exchange(Currency.BANANA, Currency.BANANA);
	}

}
