package com.ascend.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class DollarTest {

	@ParameterizedTest
	@CsvSource(
		{
		"0,0,0,0",
		"1,0.2,1,0.1",
		"-1,0,0,0",
		"0.123,0.0246,0.123,0.0123"
		}
	)
	void bananaDoubleTest(double input,double outApple,double outDollar,double outBanana) {
		Apple apple = new Apple(input);
	    assertEquals(outApple, apple.getDollar());
	    System.out.println("Apple -> Dollar : input="+input+" output="+outApple);
	    
	    Dollar dollar = new Dollar(input);
	    assertEquals(outDollar, dollar.getDollar());
	    System.out.println("Dollar -> Dollar : input="+input+" output="+outDollar);
	    
	    Banana banana = new Banana(input);
	    assertEquals(outBanana, banana.getDollar());
	    System.out.println("Banana -> Dollar : input="+input+" output="+outBanana);
	}
	
	@ParameterizedTest
	@CsvSource(
		{
		"HELLO,0,0,0"
		}
	)
	void bananaStringTest(String input,double outApple,double outDollar,double outBanana) {
		Apple apple = new Apple(input);
	    assertEquals(outApple, apple.getDollar());
	    System.out.println("Apple -> Dollar : input="+input+" output="+outApple);
	    
	    Dollar dollar = new Dollar(input);
	    assertEquals(outDollar, dollar.getDollar());
	    System.out.println("Dollar -> Dollar : input="+input+" output="+outDollar);
	    
	    Banana banana = new Banana(input);
	    assertEquals(outBanana, banana.getDollar());
	    System.out.println("Banana -> Dollar : input="+input+" output="+outBanana);
	}
}
