package com.yamada.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yamada.log.ConsoleLog;
import com.yamada.model.User;
import com.yamada.services.LoginService;

public class LoginServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	ConsoleLog log = ConsoleLog.getInstance();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		String userName=req.getParameter("userName");
		String password=req.getParameter("userPassword");
		
		LoginService loginServ = new LoginService();
		boolean result = loginServ.authenticate(userName, password);
		
		if(result)
		{
			User user = loginServ.getUserShortDetails(userName, password);
			req.setAttribute("user", user);
			RequestDispatcher dispacher = req.getRequestDispatcher("main.jsp");
			dispacher.forward(req, resp);
			log.logServletMessage("LoginServlet","doPost",userName,"Operation completed Successfully");
			return;
		}
		else			
		{	User user = loginServ.getUserShortDetails("", "");
			req.setAttribute("user", user);
			RequestDispatcher dispacher = req.getRequestDispatcher("login.jsp");
			dispacher.forward(req, resp);
			log.logServletMessage("LoginServlet","doPost",userName,"Operation completed Successfully");
			return;
		}
			
	}
	
}
