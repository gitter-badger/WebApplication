package com.yamada.model;

public class User 
{
	Integer userId=-1;
	String userName="";
	String password="";
	
	public User(Integer userId, String userName, String password) 
	{
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
	}

	public Integer getUserId() 
	{
		return userId;
	}
	
	public void setUserId(Integer userId) 
	{
		this.userId = userId;
	}
	
	public String getUserName() 
	{
		return userName;
	}
	
	public void setUserName(String userName) 
	{
		this.userName = userName;
	}
	
	public String getPassword() 
	{
		return password;
	}
	
	public void setPassword(String password) 
	{
		this.password = password;
	}
	
}
