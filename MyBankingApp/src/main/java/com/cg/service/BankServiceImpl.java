package com.cg.service;

import com.cg.model.Account;
import com.cg.model.Customer;
import com.cg.test.MinimumBalanceException;
import com.cg.util.BankUtil;

public class BankServiceImpl implements BankService {

	public Account createAccount(Customer customer, int amt) throws MinimumBalanceException {
		Account account=null;
		if(customer==null)
			throw new IllegalArgumentException("Enter Proper Customer info");
			else if(amt<1000)
				throw new MinimumBalanceException("Minimum balance must be 1000");
			else{
				account=new Account();
				account.setCustomer(customer);
				account.setAccNo(BankUtil.generateAccno());
				account.setOpeningBalance(amt);
				return account;
				}
		
		
	}

}
