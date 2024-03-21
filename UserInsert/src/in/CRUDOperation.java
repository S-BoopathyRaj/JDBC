package in;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import javax.imageio.plugins.tiff.ExifGPSTagSet;

public class CRUDOperation {
	 static Scanner sc = new Scanner(System.in);
	 boolean a=true;
    public static void main(String[] args) {
      
        System.out.println("Choose the option");
        System.out.println("1. Insert\n2. Update\n3. Delete\n4.exit");
        int choose = sc.nextInt();
     
        switch (choose) {
            case 1:
                insertRecord();
                break;
            case 2:
            {
                updateRecord();
                break;
            }
            case 3:
            {
            	 delete();
            }  
           
        

        }
    
    }

    public static void insertRecord() {
        String name;
        int totalScore, totalWic, tfour,jersyno;

        System.out.println("Enter the name");
        name = sc.next();
        System.out.println("Enter the totalScore");
        totalScore = sc.nextInt();
        System.out.println("Enter the totalWic");
        totalWic = sc.nextInt();
        System.out.println("Enter the jersyno");
        jersyno = sc.nextInt();
        System.out.println("Enter the tfour");
        tfour = sc.nextInt();
        

        try {
               Class.forName("com.mysql.cj.jdbc.Driver");
        	   Connection c = DriverManager.getConnection("jdbc:mysql://localhost:/cricket","root", "root");
               PreparedStatement ps = c.prepareStatement("insert into cricketer values(?, ?, ?, ?,?)");

            ps.setString(1, name);
            ps.setInt(2, totalScore);
            ps.setInt(3, totalWic);
            ps.setInt(4,jersyno);
            ps.setInt(5,tfour);

            ps.executeUpdate();
            System.out.println("Data Inserted"); 

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    private static void updateRecord() {
        String name;
        int totalWic;

        System.out.println("Enter the name");
        name = sc.next();
        System.out.println("Enter the updated totalWic");
        totalWic = sc.nextInt();

        try 
        {
    		Class.forName("com.mysql.cj.jdbc.Driver");
    		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/cricket","root","root");
    		PreparedStatement ps=c.prepareStatement("update cricketer set twic=? where name=?");
    		ps.setInt(1,totalWic);
    		ps.setString(2,name);
    		ps.executeUpdate();
    		System.out.println("done");

        } catch ( ClassNotFoundException |SQLException e) {
            e.printStackTrace();
        }
    }
    public static void delete()
    {
    	System.out.println("enter the name");
    	String name=sc.next();
    	try
    	{
    	
   		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/cricket","root","root");
		PreparedStatement ps=c.prepareStatement("delete from cricketer where name=?");
		ps.setString(1,name);
		ps.executeUpdate();
		System.out.println("done");
    	}
    	catch (Exception e) {
			e.printStackTrace();
		}
    }

}
