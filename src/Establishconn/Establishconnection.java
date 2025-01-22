package Establishconn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Establishconnection {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver");
	 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/?user=root", "root", "PHW#84#jeor");
	System.out.println("connect");
	
}
}
