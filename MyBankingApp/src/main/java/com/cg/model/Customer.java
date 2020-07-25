package com.cg.model;

public class Customer {
	private int customerId;
	private Address address;
	private String customerName;
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", address=" + address + ", customerName=" + customerName + "]";
	}
	public Customer(int customerId, Address address, String customerName) {
		super();
		this.customerId = customerId;
		this.address = address;
		this.customerName = customerName;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + customerId;
		result = prime * result + ((customerName == null) ? 0 : customerName.hashCode());
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
		Customer other = (Customer) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (customerId != other.customerId)
			return false;
		if (customerName == null) {
			if (other.customerName != null)
				return false;
		} else if (!customerName.equals(other.customerName))
			return false;
		return true;
	}
	

}
