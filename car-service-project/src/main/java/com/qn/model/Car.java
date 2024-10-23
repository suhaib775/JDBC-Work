package com.qn.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Car {
	private String username;
	private String model;
	private String type;
	private String regno;
	private String serviceRequest;
	private String serviceStatus;
	Connection con;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getRegno() {
		return regno;
	}
	public void setRegno(String regno) {
		this.regno = regno;
	}
	public String getServiceRequest() {
		return serviceRequest;
	}
	public void setServiceRequest(String serviceRequest) {
		this.serviceRequest = serviceRequest;
	}
	public String getServiceStatus() {
		return serviceStatus;
	}
	public void setServiceStatus(String serviceStatus) {
		this.serviceStatus = serviceStatus;
	}
	public Car(String username, String model, String type, String regno, String serviceRequest, String serviceStatus) {
		super();
		this.username = username;
		this.model = model;
		this.type = type;
		this.regno = regno;
		this.serviceRequest = serviceRequest;
		this.serviceStatus = serviceStatus;
	}
	public Car() {
		super();
	}
	
	{
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/customer_details","root","1234567890");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public int addCarDetails() {
		try {
			String query = "insert into car values(?,?,?,?,?,?)";
			PreparedStatement psmt = con.prepareStatement(query);
			psmt.setString(1, username);
			psmt.setString(2, model);
			psmt.setString(3, type);
			psmt.setString(4, regno);
			psmt.setString(5, serviceRequest);
			psmt.setString(6, serviceStatus);
			return psmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	public int serviceRequest() {
		try {
			String query = "update car set service_requested=?,service_status=? where username=? and car_regno=?";
			PreparedStatement psmt = con.prepareStatement(query);
			psmt.setString(1, serviceRequest);
			psmt.setString(2, "Pending");
			psmt.setString(3, username);
			psmt.setString(4, regno);
			return psmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	

	public String serviceStatus() {
		try {
			String s="select * from car where car_regno =? and username=?";
			PreparedStatement pstmt=con.prepareStatement(s);
			pstmt.setString(1,regno);
			pstmt.setString(2,username);
		    ResultSet res=	pstmt.executeQuery();

		
			if(res.next()) {
				serviceStatus=res.getString(6);
				return serviceStatus;
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
			return null;
			
		}
		return null;	
	}

     public ArrayList<Car> viewCustomers(){
     try {
    	 
    	   String s="select * from car";
    	   PreparedStatement pstmt=con.prepareStatement(s);
		   ResultSet res=pstmt.executeQuery();
		   ArrayList<Car> carDetails=new ArrayList<>();
     
           while(res.next()) {
    	   username=res.getString(1);
    	   model=res.getString(2);
    	   type=res.getString(3);
    	   regno=res.getString(4);
    	   serviceRequest=res.getString(5);
    	   serviceStatus=res.getString(6);
    	 
    	   carDetails.add(new Car(username,model,type,regno,serviceRequest,serviceStatus));
           }
           return carDetails;
     }
     catch(Exception e) {
    	 e.printStackTrace();
     }
	return null;
    	
    	 
     }
	@Override
	public String toString() {
		return "Car [username=" + username + ", model=" + model + ", type=" + type + ", regno=" + regno
				+ ", serviceRequest=" + serviceRequest + ", serviceStatus=" + serviceStatus + "]";
	}
} 