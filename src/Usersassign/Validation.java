package Usersassign;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Validation {
	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter email");
		String email=sc.next();
		System.out.println("enter password");
		String password=sc.next();
    Connection con=DriverManager.getConnection( "jdbc:mysql: //localhost:3306/Library", "root", "PHW#84#jeor");
    PreparedStatement ps=con.prepareStatement("select * from user where email=? and password=?");
    ps.setString(1, email);
    ps.setString(2, password);
    ResultSet rs=ps.executeQuery();
    if(rs.next()) {
    	System.out.println(rs.getInt(1));
    	System.out.println(rs.getString(2));
    	System.out.println(rs.getString(3));
    	System.out.println(rs.getString(4)); 	
    	System.out.println("welcome");
    }
    else {
    	System.out.println("invalid data");
    }
   }
}

