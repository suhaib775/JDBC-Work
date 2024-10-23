package com.qn.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Customer {
	Connection con;
	private String name;
	private String username;
	private String password;
	private String email;

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
	public Customer() {
		super();
	}
	public Customer( String name, String username, String password, String email) {
		super();
		this.name = name;
		this.username = username;
		this.password = password;
		this.email = email;
	}
	
	{
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/customer_details","root","1234567890");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public int login() {
		try {
			String query = "select * from Customer where username =?";
			PreparedStatement psmt = con.prepareStatement(query);
			psmt.setString(1, username);
			ResultSet res = psmt.executeQuery();
			
			
			if(res.next()) {
				
				if(res.getString(3).equals(password)) {
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
	
	
	public int register() {
		try {
			
			
			
			String query = "insert into Customer values(?,?,?,?)";
			PreparedStatement psmt1  = con.prepareStatement(query);
			psmt1.setString(1, name);
			psmt1.setString(2, username);
			psmt1.setString(3, password);
			psmt1.setString(4, email);
		
			psmt1.executeUpdate();
			return 1;
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
}

	


