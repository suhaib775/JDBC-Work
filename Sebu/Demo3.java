import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.ResultSetMetaData;


public class Demo3 {

	public static void main(String[] args) throws Exception {
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		System.out.println("Driver loaded succesfully");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student_db", "root", "1234567890");
		System.out.println("Connection Established");
		String s="insert into student value(?,?,?,?,?)";
		PreparedStatement pstmt=con.prepareStatement(s);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id");
		int id=sc.nextInt();
		System.out.println("Enter the name");
		String name=sc.next();
		System.out.println("Enter the mark1");
		int marks1=sc.nextInt();
		System.out.println("Enter the marks2");
		int marks2=sc.nextInt();
		System.out.println("Enter the marks3");
		int marks3=sc.nextInt();
		pstmt.setInt(1, id);
		pstmt.setString(2, name);
		pstmt.setInt(3, marks1);
		pstmt.setInt(4, marks2);
		pstmt.setInt(5, marks3);
		pstmt.executeUpdate();
		System.out.println("one rows is affected");
		

	}

}
