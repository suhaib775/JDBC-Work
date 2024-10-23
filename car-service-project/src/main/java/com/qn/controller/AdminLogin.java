package com.qn.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.qn.model.Admin;

public class AdminLogin extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String admin_username = request.getParameter("admin_username");
		String admin_password = request.getParameter("admin_password");

		Admin a = new Admin();
		a.setAdmin_username(admin_username);
		a.setAdmin_password(admin_password);

		int status = a.AdminLogin();
		if (status == 1) {
			response.sendRedirect("/car-service-project/AdminLoginSuccess.jsp");
		}else if(status == -1) {
			response.sendRedirect("/car-service-project/InvalidUsernamejsp.jsp");
		}else {
			response.sendRedirect("/car-service-project/InvalidPassword.jsp");
		}
			
	}
}