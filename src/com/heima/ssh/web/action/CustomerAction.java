package com.heima.ssh.web.action;

import javax.annotation.Resource;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import com.heima.ssh.domain.Customer;
import com.heima.ssh.service.CustomerService;

//之前将Action交给Spring管理
//<bean id="customerAction" class="com.itheima.ssh.web.action.CustomerAction" scope="prototype"> ==@Controller("customerAction")  @Scope("prototype")
//配置Action的访问
//<package name="demo" extend="struts-default" namespace="/"> ===@ParentPackage("struts-default")  @Namespace("/")
// 	<action name="customer_*" class="cuotmerAction" method="{1}">
//		<action name="customer_save"class="customerAction" method="save">
@Controller("customerAction")
@Scope("prototype")
@ParentPackage("struts-default")
@Namespace("/")
public class CustomerAction extends ActionSupport implements ModelDriven<Customer> {

	private Customer customer = new Customer();
	
	@Override
	public Customer getModel() {
		// TODO Auto-generated method stub
		return customer;
	}
	 //注入Serivce
	@Resource(name="customerService")
	private CustomerService customerService;
	
	
	//保存客户的方法：save
//	@Action(value="customer_save", results= {@Result(name="success",location="/login.jsp")})
	@Action(value="customer_save")
	public String save() {
		System.out.println("action--------------");
		//customerService.save(customer);
		return  NONE;
		}
}
