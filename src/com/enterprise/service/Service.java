
package com.enterprise.service;

import com.enterprise.beans.UserBean;
import com.enterprise.jdbc.customerDTO;

/**
 * @author group01
 * Warning: All the method will return null; methods need to be written in xxxServiceImpl
 */
public abstract class Service {

	
	/**
	 * Finds a user with the given details
	 * @param username The username to login with
	 * @param password The password to login with
	 * @return A user if one exists with the given details
	 * You may add and exception handler later
	 */
	public UserBean stafflogin(String username, String password){
		return null;
	}
	
	public String register(String newuser, String newpassword, String newemail){
		return null;
	}
	
	public customerDTO customerlogin(String username, String password){
		return null;
	}
	
	public customerDTO editProfile(customerDTO old){
		return null;
	}
	/**
	 * Need to add more methods later
	 */
	public UserBean ownerlogin(String username, String password){
		return null;
	}

	
}
