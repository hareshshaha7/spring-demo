/**
 * 
 */
package com.haresh.model;

/**
 * @author Haresh
 *
 */
public class Address {
	private String location;
	private String city;
	private int pincode;
	
	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}
	
	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}
	
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the pincode
	 */
	public int getPincode() {
		return pincode;
	}
	
	/**
	 * @param pincode the pincode to set
	 */
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	@Override
	public String toString() {
		return "Address [location=" + location + ", city=" + city + ", pincode=" + pincode + "]";
	}
}
