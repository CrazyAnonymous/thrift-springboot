package org.snowman.service.impl;

import java.util.Date;

import org.apache.thrift.TException;
import org.snowman.model.Customer;
import org.snowman.service.CustomerService;
import org.springframework.stereotype.Service;

@Service("customerQYLServiceImpl")
public class CustomerServiceImpl implements CustomerService.Iface {
	
	private static final org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(CustomerServiceImpl.class);

	@Override
	public Customer queryById(long id) throws TException {
		Date now = new Date();
		Integer createDate = new Long(now.getTime()).intValue();
		Customer dto = new Customer();
		dto.setId(id);
		dto.setName("Jack");
		dto.setCreateDate(createDate);
		return dto;
	}

	@Override
	public void create(Customer customer) throws TException {
		logger.info("create customer: {}", customer);
	}

}
