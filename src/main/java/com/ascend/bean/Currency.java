package com.ascend.bean;

public enum Currency {
	DOLLAR(1),
    APPLE(5),
    BANANA(10);

	public final double rate;

    Currency(double rate) {
        this.rate = rate;
    }

    public double getRate() {
        return rate;
    }
}
