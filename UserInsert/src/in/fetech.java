package in;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class fetech {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/movie","root","root");
			Statement s= c.createStatement();
			ResultSet rs=s.executeQuery("select * from movie");
			while(rs.next())
			{
			System.out.println("mid"+rs.getInt(1));
			System.out.println("hero"+rs.getString(2));
			System.out.println("villan"+rs.getString(3));
			System.out.println("rs.getString(4)");
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} 
			
		}
	}

