package com.cg.service;

import com.cg.model.Account;
import com.cg.model.Customer;
import com.cg.test.MinimumBalanceException;

public interface BankService {

	public Account createAccount(Customer customer, int i) throws MinimumBalanceException;

}
