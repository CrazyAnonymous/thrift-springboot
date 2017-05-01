package org.snowman.controller;

import org.apache.thrift.TException;
import org.snowman.model.Customer;
import org.snowman.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	private static final org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(WelcomeController.class);
	
	@Autowired
	private CustomerService.Iface customerService;

	@RequestMapping(value = "/")
	public String welcome() {
		try {
			Customer customer = customerService.queryById(123);
			logger.info("customer: {}", customer);
		} catch (TException e) {
			logger.error("query error", e);
		}
		return "welcome";
	}
}
