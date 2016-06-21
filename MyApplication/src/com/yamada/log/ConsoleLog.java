package com.yamada.log;

public class ConsoleLog 
{
	private static ConsoleLog instance = new ConsoleLog();
	
	private ConsoleLog() 
	{
		// TODO Auto-generated constructor stub
	}
	
	public static ConsoleLog getInstance()
	{
		return instance;
	}
	
	public void logServletMessage(String source, String type, String data, String message)
	{
		System.out.println("[Log][Servlet]["+source+"]["+type+"]["+data+"]: " + message + ";");
	}
	
	public void logMessage(String source, String message)
	{
		System.out.println("[Log][Message]["+source+"]: " + message + ";");
	}
	
	public void logQuerryMessage(String source, String querry, String data, String message)
	{
		System.out.println("[Log][Query]["+source+"]["+querry+"]["+data+"]: " + message + ";");
	}
	
	public void logQuerryErrMessage(String source, String querry, String data, String code, String message)
	{
		System.out.println("[Log][Query-error]["+source+"]["+querry+"]["+data+"]["+code+"]: " + message + ";");
	}
	
	public void logSystemMessage(String source, String message)
	{
		System.out.println("[Log][System]["+source+"]: " + message + ";");
	}
	
	public void logErrorMessage(String source, String code,String message)
	{
		System.out.println("[Log][Error]["+source+"]["+code+"]: " + message + ";");
	}
	
	public void logDebugMessage(String source, String message)
	{
		System.out.println("[Log][Debug]["+source+"]: " + message + ";");
	}
}
