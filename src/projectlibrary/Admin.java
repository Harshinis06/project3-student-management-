package projectlibrary;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class Admin {
public static void main(String[] args) throws SQLException {
	Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","PHW#84#jeor");
	Scanner s=new Scanner(System.in);
	String user=s.next();
}
}
