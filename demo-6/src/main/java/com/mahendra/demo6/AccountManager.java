package com.mahendra.demo6;

import java.util.LinkedList;
import java.util.List;

public class AccountManager {
	private List<Account> accounts = new LinkedList<>();
	
	public void add(Account newAcc ) {
		accounts.add(newAcc);
	}
	
	
	public List<String> listAccounts(){
		List<String> names = new LinkedList<>();
		for(Account a : accounts) {
			names.add(a.getCustomer());
		}
		return names;
	}
}


