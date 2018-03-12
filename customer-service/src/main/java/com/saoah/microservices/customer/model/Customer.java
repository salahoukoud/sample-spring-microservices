/**
 * 
 */
package com.saoah.microservices.customer.model;

import java.util.List;

/**
 * @author saoah
 *
 */
public class Customer {
	private Integer id;
	private String pesel;
	private String name;
	private CustomerType type;
	private List<Account> accounts;

	/**
	 * 
	 */
	public Customer() {
		super();
	}

	/**
	 * @param id
	 * @param pesel
	 * @param name
	 * @param type
	 */
	public Customer(Integer id, String pesel, String name, CustomerType type) {
		super();
		this.id = id;
		this.pesel = pesel;
		this.name = name;
		this.type = type;
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
	 * @return the pesel
	 */
	public String getPesel() {
		return pesel;
	}

	/**
	 * @param pesel
	 *            the pesel to set
	 */
	public void setPesel(String pesel) {
		this.pesel = pesel;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the type
	 */
	public CustomerType getType() {
		return type;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(CustomerType type) {
		this.type = type;
	}

	/**
	 * @return the accounts
	 */
	public List<Account> getAccounts() {
		return accounts;
	}

	/**
	 * @param accounts
	 *            the accounts to set
	 */
	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}

}
