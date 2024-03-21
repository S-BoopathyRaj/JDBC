package in;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class CRUD {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the name");
	String name=sc.next();
	System.out.println("enter the totalScore");
	int totalScore =sc.nextInt();
	System.out.println("enter the totalWic");
	int totalWic =sc.nextInt();
	System.out.println("enter the jersyno");
	int jersyno =sc.nextInt();
	System.out.println("enter the tfour");
	int totalfour =sc.nextInt();
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/cricket","root","root");
		PreparedStatement ps=c.prepareStatement("insert into cricketer values(?,?,?,?,?)");
		ps.setString(1,name);
		ps.setInt(2,totalScore);
		ps.setInt(3,totalWic);
		ps.setInt(4,jersyno);
        ps.setInt(5,totalfour);
		ps.executeUpdate();
		System.out.println("done");
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
