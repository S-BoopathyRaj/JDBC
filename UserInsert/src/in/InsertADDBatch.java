package in;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertADDBatch {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the count");
	int count =sc.nextInt();
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/movie","root","root");
		PreparedStatement ps=c.prepareStatement("insert into movie values(?,?,?,?)");
		for(int i=1;i<=count;i++)
		{
			System.out.println("enter the id:");
			int id=sc.nextInt();
			System.out.println("enter the name:");
			String name=sc.next();
			System.out.println("enter the Rating:");
			String rating=sc.next();
			System.out.println("enter the heroName:");
			String heroname=sc.next();
			
			ps.setInt(1, id);
			ps.setString(2,name);
			ps.setString(3,rating);
			ps.setString(4,heroname);
			
			
			ps.addBatch();
			
			
		}
		ps.executeUpdate();
		System.out.println("Done"); 
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
