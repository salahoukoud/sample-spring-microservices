/**
 * 
 */
package com.saoah.microservices.account.api;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.saoah.microservices.account.model.Account;

/**
 * @author saoah
 *
 */

@RestController
public class Api {

	private List<Account> accounts;

	protected Logger logger = Logger.getLogger(Api.class.getName());

	/**
	 * 
	 */
	public Api() {
		super();
		accounts = new ArrayList<Account>();
		accounts.add(new Account(1, 1, "111111"));
		accounts.add(new Account(2, 2, "222221"));
		accounts.add(new Account(3, 3, "333333"));
		accounts.add(new Account(4, 4, "444444"));
		accounts.add(new Account(5, 5, "555555"));
		accounts.add(new Account(6, 6, "666666"));
		accounts.add(new Account(7, 7, "777777"));
	}

	@RequestMapping("/accounts/{number}")
	public Account findByNumber(@PathVariable("number") String number) {
		logger.info(String.format("Account.findByNumber(%s)", number));
		return accounts.stream().filter(it -> it.getNumber().equals(number)).findFirst().get();
	}

	@RequestMapping("/accounts/customer/{customer}")
	public List<Account> findByCustomer(@PathVariable("customer") Integer customerId) {
		logger.info(String.format("Account.findByCustomer(%s)", customerId));
		return accounts.stream().filter(it -> it.getCustomerId().intValue() == customerId.intValue())
				.collect(Collectors.toList());
	}

	@RequestMapping("/accounts")
	public List<Account> findAll() {
		logger.info("Account.findAll()");
		return accounts;
	}
}
