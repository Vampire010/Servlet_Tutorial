package com.app.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServletDemo extends HttpServlet
{
	//Servlet request getParameter() to display the user input
	/*public void doGet(HttpServletRequest req ,HttpServletResponse res) throws IOException
	{
		res.setContentType("text/html");
		PrintWriter pwriter=res.getWriter();
		
		String name= req.getParameter("username");
		String age = req.getParameter("UAge");
		
		pwriter.println("Name: " + name );
		pwriter.println("Age:  "+age);
		pwriter.close();	
	}*/
	
	//Getting a parameter names and values
	public void doGet(HttpServletRequest req ,HttpServletResponse res) throws IOException
	{
		PrintWriter pwriter=res.getWriter();
		res.setContentType("text/html");
		Enumeration en = req.getParameterNames();
		while(en.hasMoreElements())
		{
			Object obj =en.nextElement();
			String param= (String)obj;
			String pvalue= req.getParameter(param);
			pwriter.print("Parameter Name: " + param + " Parameter Value: " + pvalue );
		}
		pwriter.close();
	
	}
}
