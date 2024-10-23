import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;


public class Demo4 {

	public static void main(String[] args) throws Exception {
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the choice");
		System.out.println("1. New User\n 2. Existing user");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:register();
		break;
		case 2:login();
		break;
		default:System.out.println("Invalid choice");
		}
		
	}
	
	private static void login() throws Exception {
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student_db","root","1234567890");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter username");
		String username=sc.next();
		String s="select * from user where username=?";
		PreparedStatement pstmt=con.prepareStatement(s);
		pstmt.setString(1, username);
		ResultSet res=pstmt.executeQuery();
		if(res.next()) {
			if(username.equals(res.getString(2))) {
				System.out.println("");
			}
			else {
				System.out.println("Invalid passowrd");
			}
		}
		else {
			System.out.println("Invalid username");
		}
		System.out.println("Enter password");
		String password=sc.next();
		if(res.next()) {
			if(password.equals(res.getString(3))) {
				System.out.println("Login Succesfull");
			}
			else {
				System.out.println("Invalid passowrd");
			}
		}
		else {
			System.out.println("Invalid username");
		}
		
		
	}

	static void register() throws Exception{
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student_db", "root", "1234567890");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name");
		String name=sc.next();
		System.out.println("Enter the username");
		String username=sc.next();
		while(true) {
			String s="select * from user where username=?";
			PreparedStatement pstmt=con.prepareStatement(s);
			pstmt.setString(1, username);
			ResultSet res=pstmt.executeQuery();
			if(res.next()) {
				System.out.println("Username is exist.Pls enter another username");
				username=sc.next();
			}
			else {
				break;
			}
		}
		 String password;
		 String confirmpassword;
		 
		do {
		   System.out.println("Enter the password");
		   password=sc.next();
		   System.out.println("Enter the confirmpassword");
		   confirmpassword=sc.next();
		}while(!password.equals(confirmpassword)) ;
		
	    System.out.println("Enter the email");
	    String email=sc.next();
	    
		String s1="insert into user values(?,?,?,?)";
		
		PreparedStatement pstmt=con.prepareStatement(s1);
		
		pstmt.setString(1, name);
		pstmt.setString(2, username);
		pstmt.setString(3, password);
		pstmt.setString(4, email);
		pstmt.executeUpdate();
		System.out.println("Inserted");
	}

	}

