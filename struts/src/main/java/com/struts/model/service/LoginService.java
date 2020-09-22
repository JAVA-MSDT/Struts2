package com.struts.model.service;

import com.struts.model.domain.User;

public class LoginService {

	public boolean verifyLogin(final User user) {
		if (user.getUserId().equals("user") && user.getUserPassword().equals("password")) {

			return true;
		}
		return false;
	}
}
