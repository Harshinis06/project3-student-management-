package com.jsp.Helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Helper {
	public static Connection getConnection() throws SQLException {
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "root","PHW#84#jeor");
return con;
	}
}
