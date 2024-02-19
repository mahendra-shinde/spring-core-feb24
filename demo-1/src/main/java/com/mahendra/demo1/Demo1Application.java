package com.mahendra.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(AppConfig.class)
public class Demo1Application implements CommandLineRunner{

	@Autowired
	private AccountManager manager;
	
	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
		
		
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("List of accounts");
		manager.listAccounts().forEach(System.out::println);
	}
}
