package com.struts.model.domain;

public class User {

	private String userId;
	private String userPassword;

	public User() {
	}

	public User(final String userId, final String userPassword) {
		this.userId = userId;
		this.userPassword = userPassword;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(final String userId) {
		this.userId = userId;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(final String userPassword) {
		this.userPassword = userPassword;
	}
}
