package com.qn.controller;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.qn.model.Quntnex;

public class QuntnexRegister extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       String name=  request.getParameter("name");
       String username=  request.getParameter("username");
       String password=  request.getParameter("password");
       String confirmPassword=  request.getParameter("confirm_password");
       String email=  request.getParameter("email");
       String qualification=  request.getParameter("qualification");
       String cgpa=  request.getParameter("cgpa");
       
       if(password.equals(confirmPassword)) {
    	   Quntnex q=new Quntnex(name,username,email,password,qualification,cgpa);
    	   int rows=q.register();
    	   
    	   if(rows==0) {
    		   response.sendRedirect("/quntnex-proj/quntnexRegisterFailure.jsp");
    	   }
    	   else {
    		   response.sendRedirect("/quntnex-proj/quntnexRegisterSuccess.jsp");
    	   }
       }
       else {
    	   response.sendRedirect("/quntnex-proj/passwordMissmatch.jsp");
       }
       }
	}