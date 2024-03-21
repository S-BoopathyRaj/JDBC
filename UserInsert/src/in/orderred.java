package in;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class orderred {
public static void main(String[] args) {
	try {
		Scanner sc=new Scanner(System.in);
		System.out.println("Starting id");
		int id=sc.nextInt();
		System.out.println("enter the ending id");
		int id1=sc.nextInt();
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/movie","root","root");
		PreparedStatement ps=c.prepareStatement("select * from movie where id between ? and ?");
		ps.setInt(1,id);
		ps.setInt(2,id1);
		
		ResultSet rs=ps.executeQuery();
		if(rs.next())
		{
			System.out.println(rs.getString(id));
			System.out.println(rs.getString(id1));
			
		}
	     ps.executeUpdate();
	     System.out.println("Done");
		
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
