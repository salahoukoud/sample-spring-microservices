/**
 * 
 */
package com.saoah.microservices.customer.model;

/**
 * @author saoah
 *
 */
public class Account {
	private Integer id;
	private String number;

	/**
	 * 
	 */
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param number
	 */
	public Account(Integer id, String number) {
		super();
		this.id = id;
		this.number = number;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the number
	 */
	public String getNumber() {
		return number;
	}

	/**
	 * @param number
	 *            the number to set
	 */
	public void setNumber(String number) {
		this.number = number;
	}

}
