package com.qn.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.qn.model.Car;

public class CarDetails extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String model = request.getParameter("model");
		String type = request.getParameter("type");
		String regno = request.getParameter("regno");
		
		HttpSession session = request.getSession();
		String username = (String)session.getAttribute("susername");
		
		
		Car c = new Car();
		c.setModel(model);
		c.setType(type);
		c.setRegno(regno);
		c.setUsername(username);
		c.setServiceRequest("NA");
		c.setServiceStatus("NA");
		
		int flag = c.addCarDetails();
		
		if(flag==0) {
			response.sendRedirect("/car-service-project/CarDetailsFail.jsp");
		}else {
			response.sendRedirect("/car-service-project/CarDetailsSuccess.jsp");
		}
		
	}
}
