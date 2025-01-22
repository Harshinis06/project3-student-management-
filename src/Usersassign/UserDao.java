package Usersassign;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDao {
 public static void saveUser(int id,String name,String email,String password) throws SQLException {
     Connection con=DriverManager.getConnection( "jdbc:mysql: //localhost:3306/Library", "root", "PHW#84#jeor"); 
	 PreparedStatement ps1=con.prepareStatement("insert into user(id,name,email,password)values(?,?,?,?)");
	 ps1.setInt(1, id);
	 ps1.setString(2, name);
	 ps1.setString(3,email);
	 ps1.setString(4, password);
	 ps1.execute();
	 
	 System.out.println("data inserted");
 }
}
