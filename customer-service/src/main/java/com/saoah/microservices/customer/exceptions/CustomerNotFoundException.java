/**
 * 
 */
package com.saoah.microservices.customer.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author saoah
 *
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class CustomerNotFoundException extends Exception {

	private static final long serialVersionUID = 1L;

	/**
	 * @param pesel
	 */
	public CustomerNotFoundException(String pesel) {
		super("No such customer : " + pesel);
	}

}
