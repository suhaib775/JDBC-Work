import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.ResultSetMetaData;


public class Demo2 {

	public static void main(String[] args) throws Exception {
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		System.out.println("Driver loaded succesfully");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student_db", "root", "1234567890");
		System.out.println("Connection Established");
		String s="select * from student where id=?";
		PreparedStatement pstmt=con.prepareStatement(s);//Here prepared stmt is used for accessing individual marks for student
		System.out.println("Enter the id");
		Scanner sc=new Scanner(System.in);
		int id=sc.nextInt();
		pstmt.setInt(1, id);//here setINT is used to declare the id of which position
		ResultSet res=pstmt.executeQuery();
		if(res.next()) {
			id=res.getInt(1);
			String name=res.getString(2);
			int marks1=res.getInt(3);
			int marks2=res.getInt(4);
			int marks3=res.getInt(5);
			System.out.println(id+" "+name+" "+marks1+" "+marks2+" "+marks3+" ");
		}
		else {
			System.out.println("Invalid Id");
			
		}
		

	}

}
