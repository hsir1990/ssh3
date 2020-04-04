package com.heima.ssh.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.heima.ssh.dao.CustomerDao;
import com.heima.ssh.domain.Customer;
import com.heima.ssh.service.CustomerService;

//之前 
//<bean id="customerService" class="com.itheima.ssh.service.impl.CustomerServiceImpl"> ===@Service("customerService")


@Service("customerService")
@Transactional
public class CustomerServiceImpl implements CustomerService {

	//注入DAO
	@Resource(name="customerDao")
	private CustomerDao customerDao;
	
	
	@Override
	public void save(Customer customer) {
		System.out.println("Service=========================");
		customerDao.save(customer);
		
	}

}
