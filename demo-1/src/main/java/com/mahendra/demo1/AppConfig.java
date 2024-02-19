package com.mahendra.demo1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean
	public AccountManager manager() {
		AccountManager manager = new AccountManager();
		Account acc1 = new Account("SB10101","Rohit",12000D);
		Account acc2 = new Account("SB10102","Mohit",11300D);
		manager.add(acc1);
		manager.add(acc2);
		return manager;	
	}
}
