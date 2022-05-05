package com.app.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Validation extends HttpServlet
{

	public void doPost(HttpServletRequest req ,HttpServletResponse res) throws IOException, ServletException
	{
		res.setContentType("text/html");
		PrintWriter pwriter=res.getWriter();
		
		String name = req.getParameter("uname");
		String pass = req.getParameter("upass");
		
		if(name.equals("Girish") && pass.equals("softwaretestingXperts"))
		{
			RequestDispatcher dis = req.getRequestDispatcher("Welcome");
			dis.forward(req, res);
		}
		else
		{
			pwriter.print("User name or password is incorrect");
			RequestDispatcher dis = req.getRequestDispatcher("index_disp.html");
			dis.forward(req, res);
		}

		
	}
}
