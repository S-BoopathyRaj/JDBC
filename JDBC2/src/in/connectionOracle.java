package in;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class connectionOracle {
public static void main(String[] args) {
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection c=DriverManager.getConnection("jdbc:ORACLE.REGRESS.RDBMS.DEV.US.ORACLE.COM:\\localhost:3306","scott","tiger");
		Statement s=c.createStatement();
		s.executeUpdate("select * from emp");
		
		
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
