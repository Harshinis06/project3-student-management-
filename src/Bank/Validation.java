package Bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Validation {

public static void main(String[] args) throws SQLException {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter account");
	long account=sc.nextLong();
	System.out.println("enter pincode");
	int pincode=sc.nextInt();
	
    Connection con=DriverManager.getConnection( "jdbc:mysql: //localhost:3306/bank", "root", "PHW#84#jeor");
    PreparedStatement ps=con.prepareStatement("select * from customer where account=? and pincode=?");
    ps.setLong(1,account);
    ps.setInt(2, pincode);
    ResultSet rs=ps.executeQuery();
    if(rs.next()) {
    	
    	System.out.println(rs.getDouble(7)); 
    }
    else {
    	System.out.println("invalid data");
    }
}
}