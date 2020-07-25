package com.cg.test;

import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.cg.model.Account;
import com.cg.model.Address;
import com.cg.model.Customer;
import com.cg.service.BankService;
import com.cg.service.BankServiceImpl;

public class BankAppTest {
	//@Mock
	BankService bankService;
	
	@BeforeSuite
	public void setUp()
	{
		MockitoAnnotations.initMocks(this);
		bankService=new BankServiceImpl();
	}
	
	@Test(expectedExceptions=MinimumBalanceException.class)
	public void checkAccountInformation() throws MinimumBalanceException
	{
		Customer customer =new Customer();
		customer.setCustomerId(1001);
		customer.setCustomerName("Tom");
		customer.setAddress(new Address("Pune","Maharashtra"));
		bankService.createAccount(customer,200);
		System.out.println("Exception");
	//	Mockito.when(bankService.createAccount(customer, 200)).thenThrow(MinimumBalanceException.class);
		
		
	}
	
	@Test(expectedExceptions=IllegalArgumentException.class)
	public void checkCustomerInfo() throws MinimumBalanceException
	{
		Customer customer =null;
		bankService.createAccount(null,2000);
		//Mockito.when(bankService.createAccount(customer, 2000)).thenThrow(IllegalArgumentException.class);
		
		
	}
	
	@Test
	public void checkCustomerId() throws MinimumBalanceException
	{
		Customer customer =new Customer();
		customer.setCustomerId(1001);
		customer.setCustomerName("Tom");
		customer.setAddress(new Address("Pune","Maharashtra"));
		Assert.assertEquals(bankService.createAccount(customer,2000).getCustomer(), customer);
		
		
		
		
	}

}
