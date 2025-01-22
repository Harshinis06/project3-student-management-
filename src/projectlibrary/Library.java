package projectlibrary;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Library {
public static void main(String[] args) throws SQLException {
	Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","PHW#84#jeor");
    Statement st=c.createStatement();
    st.execute("create table admin(id,name,email,password)values()");
    System.out.println("admin table");
}
}
