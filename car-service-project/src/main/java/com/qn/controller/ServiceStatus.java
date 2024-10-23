package com.qn.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.qn.model.Car;


public class ServiceStatus extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String regno =request.getParameter("regno");
		  Car c=new Car();
		  c.setRegno(regno);
		  
		  HttpSession session=request.getSession(); 
		  String username=(String)session.getAttribute("susername"); 
		  c.setUsername(username);
		  
		  String status=c.serviceStatus();
		  session.setAttribute("serviceStatus", status);

		  
		  if(status==null) {
			  response.sendRedirect("/car-service-project/ServiceStatusFailure.jsp");
		  }
		  else {
			 
			  response.sendRedirect("/car-service-project/ServiceStatusSuccess.jsp");
		  }
	}
}
