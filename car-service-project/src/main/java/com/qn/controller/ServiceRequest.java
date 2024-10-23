package com.qn.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.qn.model.Car;



import com.qn.model.Car;
public class ServiceRequest extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String serviceRequest = request.getParameter("serviceRequest");
		String regno = request.getParameter("regno");
		HttpSession session = request.getSession();
		
		Car c = new Car();
		c.setServiceRequest(serviceRequest);
		c.setRegno(regno);
		c.setUsername((String)session.getAttribute("susername"));
		
		int flag = c.serviceRequest();
		
		if(flag == 0) {
			response.sendRedirect("/car-service-project/ServiceRequestFailure.jsp");
		}else {
			response.sendRedirect("/car-service-project/ServiceRequestSucess.jsp");
		}
		
		
	}
	
}
