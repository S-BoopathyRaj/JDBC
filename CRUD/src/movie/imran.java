package movie;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class imran {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.driver");
			Connection=DriverManager.getConnection("jdbc:mysql://Localhost:movie","root","root");
		} catch (ClassNotFoundException |SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
