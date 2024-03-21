package in;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class ConnectionJDBC {
public static void main(String[] args) {
	try
	{
	 Class.forName("com.mysql.cj.jdbc.Driver");
	 Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/movie","root","root");
	 Statement s=c.createStatement();
	 s.executeUpdate("insert into movie values(1,'joe','5.5','rio')");
	 System.out.println("Done");
	}
	catch(SQLException | ClassNotFoundException e)

	{
		e.printStackTrace();
	}
} 
}
