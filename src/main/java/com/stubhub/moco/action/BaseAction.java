package com.stubhub.moco.action;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author fuxie
 * @date 2014-6-20 ÏÂÎç02:55:18 
 */
@SuppressWarnings("serial")
public class BaseAction  extends ActionSupport {
	public HttpServletRequest request() {
		return ServletActionContext.getRequest();
	}
	
	public HttpSession session() {
		return ServletActionContext.getRequest().getSession();
	}
	
	public ServletContext application() {
		return ServletActionContext.getServletContext();
	}
	
	public HttpServletResponse response() {
		return ServletActionContext.getResponse();
	}
}
