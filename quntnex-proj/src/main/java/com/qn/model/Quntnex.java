package com.qn.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Quntnex {
	 String name;
     String username;
     String password;
     String email;
     String qualification;
     String cgpa;
     Connection con;
     
	public Quntnex() {
		super();
	}
	public Quntnex(String name, String username, String email, String password, String qualification, String cgpa) {
		super();
		this.name = name;
		this.username = username;
		this.email = email;
		this.password = password;
		this.qualification = qualification;
		this.cgpa = cgpa;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getCgpa() {
		return cgpa;
	}
	public void setCgpa(String cgpa) {
		this.cgpa = cgpa;
	}
	
	{
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/quntnex","root","1234567890");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public int register() {
		try {
			
			String query = "insert into Student values(?,?,?,?,?,?)";
			PreparedStatement psmt = con.prepareStatement(query);
			psmt.setString(1, name);
			psmt.setString(2, username);
			psmt.setString(3, email);
			psmt.setString(4, password);
			psmt.setString(5, qualification);
			psmt.setString(6, cgpa);
			
			return psmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	
	public int login() {
		try {
			String query = "select * from Student where username =?";
			PreparedStatement psmt = con.prepareStatement(query);
			psmt.setString(1, username);
			ResultSet res = psmt.executeQuery();
			
			
			if(res.next()) {
				
				if(res.getString(4).equals(password)) {
					name = res.getString(1);
					return 1;
				}else {
					return 0;
				}
			}else {
				return -1;
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	
}
