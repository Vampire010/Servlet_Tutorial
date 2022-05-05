package com.app.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WelcomeUser extends HttpServlet
{
	public void doPost(HttpServletRequest req ,HttpServletResponse res) throws IOException, ServletException
	{
		res.setContentType("text/html");
		PrintWriter pwriter=res.getWriter();
		String name = req.getParameter("uname");
		pwriter.print("Hello " + name + " !");
		pwriter.print("Welcome to SoftwareTestingXperts ");

	}

}
