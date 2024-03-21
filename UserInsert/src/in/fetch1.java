package in;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;;
public class fetch1 {
	 public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the id");
			int id=sc.nextInt();
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/movie","root","root");
				PreparedStatement s= c.prepareStatement("select heroname,name  from movie where id=?");
				s.setInt(1,id);
				ResultSet rs=s.executeQuery();
				if(rs.next())
				{
				System.out.println("heroname:"+rs.getString(1));
				System.out.println("moviename:"+rs.getString(2));	
				}
				else
				{
					System.out.println("Data Notfound");
				}	
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			} 
				
			}
		}




