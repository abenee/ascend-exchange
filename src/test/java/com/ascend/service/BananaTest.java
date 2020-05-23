package com.ascend.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class BananaTest {

	@ParameterizedTest
	@CsvSource(
		{
		"0,0,0,0",
		"1,2,10,1",
		"-1,0,0,0",
		"0.123,0.246,1.23,0.123"
		}
	)
	void bananaDoubleTest(double input,double outApple,double outDollar,double outBanana) {
		Apple apple = new Apple(input);
	    assertEquals(outApple, apple.getBanana());
	    System.out.println("Apple -> Banana : input="+input+" output="+outApple);
	    
	    Dollar dollar = new Dollar(input);
	    assertEquals(outDollar, dollar.getBanana());
	    System.out.println("Dollar -> Banana : input="+input+" output="+outDollar);
	    
	    Banana banana = new Banana(input);
	    assertEquals(outBanana, banana.getBanana());
	    System.out.println("Banana -> Banana : input="+input+" output="+outBanana);
	}
	
	@ParameterizedTest
	@CsvSource(
		{
		"HELLO,0,0,0"
		}
	)
	void bananaStringTest(String input,double outApple,double outDollar,double outBanana) {
		Apple apple = new Apple(input);
	    assertEquals(outApple, apple.getBanana());
	    System.out.println("Apple -> Banana : input="+input+" output="+outApple);
	    
	    Dollar dollar = new Dollar(input);
	    assertEquals(outDollar, dollar.getBanana());
	    System.out.println("Dollar -> Banana : input="+input+" output="+outDollar);
	    
	    Banana banana = new Banana(input);
	    assertEquals(outBanana, banana.getBanana());
	    System.out.println("Banana -> Banana : input="+input+" output="+outBanana);
	}
}
