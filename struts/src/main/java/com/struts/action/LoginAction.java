package com.struts.action;

import org.apache.commons.lang3.StringUtils;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.struts.model.domain.User;
import com.struts.model.service.LoginService;

public class LoginAction extends ActionSupport implements ModelDriven<User> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2220103412368207939L;
	private static final String FAILURE = "failure";
	private static final String SUCCESS = "success";

	private User user = new User();

	private LoginService loginService;

	@Override
	public String execute() {

		loginService = new LoginService();
		if (loginService.verifyLogin(user)) {
			return SUCCESS;
		}
		return FAILURE;

	}

	@Override
	public void validate() {
		System.out.println("Validate works!!");
		if (StringUtils.isEmpty(user.getUserId())) {
			System.out.println("getUserId works!!");
			addFieldError("userId", "User Id can not be blanked");
		}

		if (StringUtils.isEmpty(user.getUserPassword())) {
			System.out.println("getUserPassword works!!");
			addFieldError("userPassword", "User Password can not be blanked");
		}
	}

	@Override
	public User getModel() {
		return user;
	}

}
