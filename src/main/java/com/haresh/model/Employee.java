/**
 * 
 */
package com.haresh.model;

import java.util.List;

/**
 * @author Haresh
 *
 */
public class Employee {
	private int id;
	private String name;
	private Address address;
	private List<Long> phoneNumbers;
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}
	
	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}
	
	/**
	 * @return the phoneNumbers
	 */
	public List<Long> getPhoneNumbers() {
		return phoneNumbers;
	}
	
	/**
	 * @param phoneNumbers the phoneNumbers to set
	 */
	public void setPhoneNumbers(List<Long> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", phoneNumbers=" + phoneNumbers
				+ "]";
	}
}
