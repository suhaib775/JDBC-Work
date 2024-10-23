package com.qn.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.qn.model.Customer;


public class CustomerRegister extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String conpassword = request.getParameter("conpassword");
		String email = request.getParameter("email");
		
		if(!password.equals(conpassword)) {
			response.sendRedirect("/car-service-project/regpassfailure.jsp");
			return;
		}
		
		Customer c = new Customer();
		c.setName(name);
		c.setUsername(username);
		c.setPassword(password);
		c.setEmail(email);
		
		int flag = c.register();
		
		if(flag==1) {
			response.sendRedirect("/car-service-project/regpass.jsp");
		}else {
			response.sendRedirect("/car-service-project/regfail.jsp");
		}
		
	}
}
