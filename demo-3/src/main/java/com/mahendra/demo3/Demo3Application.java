package com.mahendra.demo3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

import com.mahendra.demo3.beans.AccountService;

@SpringBootApplication
public class Demo3Application implements CommandLineRunner {

	@Autowired
	private AccountService oldService;
	
	public static void main(String[] args) {
		SpringApplication.run(Demo3Application.class, args);
	}

	
	@Override
	public void run(String... args) throws Exception {
		oldService.deposit(10001,1000);
		oldService.withdraw(10001, 2000);
		System.out.println("Balance :"+oldService.getBalance(10001));
	}
}
