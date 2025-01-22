package Bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDao {
	public static void saveUser(int id,String name,int age,long account,int pincode,String ifsccode,double balance) throws SQLException {
    Connection con=DriverManager.getConnection( "jdbc:mysql: //localhost:3306/bank", "root", "PHW#84#jeor");
    PreparedStatement ps1=con.prepareStatement("insert into customer(id,name,age,account,pincode,ifsccode,balance)values(?,?,?,?,?,?,?)");
	 ps1.setInt(1, id);
	 ps1.setString(2, name);
	 ps1.setInt(3,age);
	 ps1.setLong(4, account);
	 ps1.setInt(5, pincode);
	 ps1.setString(6, ifsccode);
	 ps1.setDouble(7, balance);
	 ps1.execute();
	}
}
