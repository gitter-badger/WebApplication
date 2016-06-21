package com.yamada.services;

import com.yamada.model.User;

public class LoginService 
{
	static String placeHolderUserName="root";
	static String placeHolderPassword="root";
	
	public boolean authenticate(String userName, String password)
	{
		if(userName.equals(placeHolderUserName) && password.equals(placeHolderPassword))
		{
			return true;
		}
		return false;
	}
	
	public User getUserShortDetails(String userName, String password)
	{
		User user=new User(0,userName,password);
		return user;	
	}
}
