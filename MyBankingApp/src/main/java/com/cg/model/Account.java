package com.cg.model;

public class Account {
	private int accNo;
	private Customer customer;
	private float openingBalance;
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public float getOpeningBalance() {
		return openingBalance;
	}
	public void setOpeningBalance(float openingBalance) {
		this.openingBalance = openingBalance;
	}
	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", customer=" + customer + ", openingBalance=" + openingBalance + "]";
	}
	public Account(int accNo, Customer customer, float openingBalance) {
		super();
		this.accNo = accNo;
		this.customer = customer;
		this.openingBalance = openingBalance;
	}
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + accNo;
		result = prime * result + ((customer == null) ? 0 : customer.hashCode());
		result = prime * result + Float.floatToIntBits(openingBalance);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (accNo != other.accNo)
			return false;
		if (customer == null) {
			if (other.customer != null)
				return false;
		} else if (!customer.equals(other.customer))
			return false;
		if (Float.floatToIntBits(openingBalance) != Float.floatToIntBits(other.openingBalance))
			return false;
		return true;
	}
	

}
