
package com.enterprise.business;

import com.enterprise.beans.UserBean;
import com.enterprise.jdbc.customerDTO;
import com.enterprise.service.Service;

/**
 * @author group01
 * An abstract class that connects the 
 * Web Tier (Commands) and the business layer
 * This class implements all the methods
 * that required by calling the method
 * getService(), and be concretized by subclasses
 *
 */
public abstract class Delegate {
	
	/**
	 * Find the appropriate Service
	 * @return The business interface Service 
	 */
	
	protected abstract Service getService();
	
	/**
	 * Build the methods that find the appropriate
	 * service for various users
	 * e.g.:
	 * Login
	 * add
	 * delete
	 * findAll
	 */
	
	public UserBean stafflogin(String username, String password){
		return getService().stafflogin(username, password);
	}
	
	public String register(String newuser, String newpassword, String newemail){
		//String registerName = null;
		
		return getService().register(newuser, newpassword, newemail);
	}
	
	public customerDTO customerlogin(String username, String password){
		return getService().customerlogin(username, password);
	}
	
	public customerDTO editProfile(customerDTO old){
		return getService().editProfile(old);
	}
	public UserBean ownerlogin(String username, String password){
		return getService().ownerlogin(username, password);
	}

}
