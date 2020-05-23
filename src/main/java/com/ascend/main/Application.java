package com.ascend.main;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ascend.service.Apple;
import com.ascend.service.Banana;
import com.ascend.service.Dollar;

@SpringBootApplication
public class Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("/////// Start Program //////");
		Dollar dollar = new Dollar(20);
		dollar.getApple();            // output on screen: 100
		dollar.getDollar();			  // output on screen: 20
		dollar.getBanana();           // output on screen: 200 

		Apple apple = new Apple(20);
		apple.getApple();			  // output on screen: 20
		apple.getDollar();            // output on screen: 4
		apple.getBanana();            // output on screen: 40

		Banana banana = new Banana(20);
		banana.getApple();            // output on screen: 10
		banana.getDollar();           // output on screen: 2
		banana.getBanana();			  // output on screen: 20
		
		Dollar dollar1 = new Dollar(0);
		dollar1.getApple();            // (1)

		Apple apple1 = new Apple(-5); 
		apple1.getBanana();            // (2)

		Banana banana1 = new Banana("HELLO");
		banana1.getApple();            // (3)
		System.out.println("/////// End Program //////");
	}

}