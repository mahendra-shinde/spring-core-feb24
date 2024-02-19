package com.mahendra.demo1;


public interface AccountService {
	void deposit(int accountId, double amt);
	void withdraw(int accountId, double amt);
	double getBalance(int accountId);
}
