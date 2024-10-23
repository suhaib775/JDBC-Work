import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
public class Demo5 {
	public static void main(String args[]) throws Exception {
		 DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		 System.out.println("Driver loaded succesfully");
		 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student_db", "root", "1234567890");
		 System.out.println("Connection Established Succesfully");
		 String s="update student set name=? where id=?";
		 PreparedStatement pstmt=con.prepareStatement(s);
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the name");
		 String name=sc.next();
		 System.out.println("Enter the id");
		 int id=sc.nextInt();
		 pstmt.setString(1, name);
		 pstmt.setInt(2, id);
		 pstmt.executeUpdate();
		 System.out.println("One row is Updated");
	}
	
	

}
