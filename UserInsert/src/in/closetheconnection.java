package in;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class closetheconnection {

public static void main(String[] args) {
	Connection c=null
}
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/movie","root","root");
		Statement s=c.createStatement();
		s.executeUpdate("insert into movie values (11,anamial,6.5,tarik)");
		System.out.println("Done");
			try {
				if(c!=null)
				{
					c.close();
				}
				
			} catch (Exception e) {
				// TODO: handle exception
			
		}
			finally {
				
			}
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
