package com.heima.ssh.dao.impl;


import javax.annotation.Resource;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.heima.ssh.dao.CustomerDao;
import com.heima.ssh.domain.Customer;


//<bean id="customerDao" class="com.heima.ssh.dao.impl.CustomerDaoImp"> ===@Repository("customerDao")


@Repository("customerDao")
public class CustomerDaoImpl implements CustomerDao  {

	@Resource(name="hibernateTemplate")
	private HibernateTemplate hibernateTemplate;
	
	@Override
	public void save(Customer customer) {
		System.out.println("DAO----------");
		this.hibernateTemplate.save(customer);
	}


}
