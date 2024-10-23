package com.qn.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.qn.model.Quntnex;


public class QuntnexLogin extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("username");
		String password =request.getParameter("password");
		
		Quntnex q=new Quntnex();
		q.setUsername(username);
		q.setPassword(password);
		int status=q.login();
		
		HttpSession session = request.getSession();
		session.setAttribute("susername", username);
		session.setAttribute("sname", q.getName());
		
		if(status == 1) {
			response.sendRedirect("/quntnex-proj/quntnexLoginSuccess.jsp");
		}
		else if(status == -1) {
			response.sendRedirect("/quntnex-proj/invalidQuntnexUserName.jsp");
		}
		else {
			response.sendRedirect("/quntnex-proj/invalidQuntnexPassword.jsp");
		}
		}
	}