/**
 * 
 */
package com.saoah.microservices.account.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author saoah
 *
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class AccountNotFoundException extends Exception {

	private static final long serialVersionUID = 1L;

	/**
	 * @param accountNumber
	 */
	public AccountNotFoundException(String accountNumber) {
		super("No such account: " + accountNumber);
	}

}
