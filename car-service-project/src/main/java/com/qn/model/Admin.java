package com.qn.model;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;

	public class Admin {
		private String admin_username;
		private String admin_password;
		Connection con=null;
		
		public Admin() {
			super();
		}
		public Admin(String admin_username, String admin_password) {
			super();
			this.admin_username = admin_username;
			this.admin_password = admin_password;
		}
		public String getAdmin_username() {
			return admin_username;
		}
		public void setAdmin_username(String admin_username) {
			this.admin_username = admin_username;
		}
		public String getAdmin_password() {
			return admin_password;
		}
		public void setAdmin_password(String admin_password) {
			this.admin_password = admin_password;
		}
		@Override
		public String toString() {
			return "Admin [admin_username=" + admin_username + ", admin_password=" + admin_password + "]";
		}
		{
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/customer_details","root", "1234567890");	
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		}
		public int AdminLogin() {
			try {
				String s="select * from admin where admin_username=?";
				PreparedStatement pstmt = con.prepareStatement(s);
				pstmt.setString(1, admin_username);
				ResultSet res=pstmt.executeQuery();
				if(res.next()) {
					if(admin_password.equals(res.getString(2))) {
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



