package com.mahendra.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo2Application implements CommandLineRunner {

	@Autowired
	private AccountService oldService;
	
	public static void main(String[] args) {
		SpringApplication.run(Demo2Application.class, args);
	}

	
	@Override
	public void run(String... args) throws Exception {
		oldService.deposit(10001,1000);
		oldService.withdraw(10001, 2000);
		System.out.println("Balance :"+oldService.getBalance(10001));
	}
}
