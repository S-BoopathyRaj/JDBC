package in;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Update {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the wic");
	int twic=sc.nextInt();
	System.out.println("enter the name");
	String name =sc.next();
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/cricket","root","root");
		PreparedStatement ps=c.prepareStatement("update cricketer set twic=? where name=?");
		ps.setInt(1,twic);
		ps.setString(2,name);
		ps.executeUpdate();
		System.out.println("done");
	} catch (ClassNotFoundException |SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
