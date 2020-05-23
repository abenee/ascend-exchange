package com.ascend.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class AppleTest {

	@ParameterizedTest
	@CsvSource(
		{
		"0,0,0,0",
		"1,1,5,0.5",
		"-1,0,0,0",
		"0.123,0.123,0.615,0.0615"
		}
	)
	void appleDoubleTest(double input,double outApple,double outDollar,double outBanana) {
		Apple apple = new Apple(input);
	    assertEquals(outApple, apple.getApple());
	    System.out.println("Apple -> Apple : input="+input+" output="+outApple);
	    
	    Dollar dollar = new Dollar(input);
	    assertEquals(outDollar, dollar.getApple());
	    System.out.println("Dollar -> Apple : input="+input+" output="+outDollar);
	    
	    Banana banana = new Banana(input);
	    assertEquals(outBanana, banana.getApple());
	    System.out.println("Banana -> Apple : input="+input+" output="+outBanana);
	}
	
	@ParameterizedTest
	@CsvSource(
		{
		"HELLO,0,0,0"
		}
	)
	void appleStringTest(String input,double outApple,double outDollar,double outBanana) {
		Apple apple = new Apple(input);
	    assertEquals(outApple, apple.getApple());
	    System.out.println("Apple -> Apple : input="+input+" output="+outApple);
	    
	    Dollar dollar = new Dollar(input);
	    assertEquals(outDollar, dollar.getApple());
	    System.out.println("Dollar -> Apple : input="+input+" output="+outDollar);
	    
	    Banana banana = new Banana(input);
	    assertEquals(outBanana, banana.getApple());
	    System.out.println("Banana -> Apple : input="+input+" output="+outBanana);
	}
}
