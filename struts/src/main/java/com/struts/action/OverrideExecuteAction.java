package com.struts.action;

import com.opensymphony.xwork2.ActionSupport;

public class OverrideExecuteAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3267579415128847873L;

	public String getOverride() {
		System.out.println("Override Method Execute: ");
		return ActionSupport.SUCCESS;
	}

	public String addOverride() {
		System.out.println("addOverride Method");
		return ActionSupport.ERROR;
	}
}
