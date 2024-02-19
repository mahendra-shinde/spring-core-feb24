package com.mahendra.demo1;

import java.util.HashMap;
import java.util.Map;

public class AccountServiceImpl  implements AccountService{

	private Map<Integer, Double> accounts = new HashMap<>();
	
	
	@Override
	public void deposit(int accountId, double amt) {
		double oldBalance = accounts.get(accountId).doubleValue();
		oldBalance += amt;
		accounts.put(accountId, oldBalance);
	}

	@Override
	public void withdraw(int accountId, double amt) {
		double oldBalance = accounts.get(accountId).doubleValue();
		oldBalance -= amt;
		accounts.put(accountId, oldBalance);
	}

	@Override
	public double getBalance(int accountId) {
		return accounts.get(accountId);
	}

	
}
