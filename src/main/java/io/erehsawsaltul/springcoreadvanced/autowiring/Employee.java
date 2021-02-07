package io.erehsawsaltul.springcoreadvanced.autowiring;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	
	private Employee(Address address) {
		this.address = address;
	}

	@Autowired(required = true)
	private Address address;

	public Address getAddress() {
		return address;
	}


	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}

}
