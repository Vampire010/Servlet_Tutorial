package com.app.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServletRespnse  extends HttpServlet
{
	public void doGet(HttpServletRequest req ,HttpServletResponse res) throws IOException
	{
		PrintWriter pwriter=res.getWriter();
		res.setContentType("text/html");
		
		String name = req.getParameter("uname");
		pwriter.println("User Details Page");
		pwriter.println("Hello " + name);
		pwriter.close();

	}
}
