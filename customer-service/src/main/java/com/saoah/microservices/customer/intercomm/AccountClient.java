/**
 * 
 */
package com.saoah.microservices.customer.intercomm;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.saoah.microservices.customer.model.Account;

/**
 * @author saoah
 *
 */
@FeignClient("account-service")
public interface AccountClient {

	@RequestMapping(method = RequestMethod.GET, value = "/accounts/customer/{customerId}")
	List<Account> getAccounts(@PathVariable("customerId") Integer customerId);
}
