package Practicejdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.jsp.Helper.Helper;
import com.mysql.cj.protocol.x.SyncFlushDeflaterOutputStream;

public class DynamicCrud {
public static void main(String[] args) throws SQLException {
	Connection con=Helper.getConnection();
	Scanner sc=new Scanner(System.in);
	System.out.println("insert operation");
	String s=sc.next();
	switch(s) {
	case "insert":
		System.out.println("insert values");
		PreparedStatement ps=con.prepareStatement("insert into patients(id,name,cause)values(?,?,?)");
		int id=sc.nextInt();
		String name=sc.next();
		String cause=sc.next();
		ps.setInt(1,id);
		ps.setString(2, name);
		ps.setString(3, cause);
		ps.execute();
		System.out.println("value inserted");
		break;
		
	case "update":
		 PreparedStatement up=con.prepareStatement("update patients set id=? where id=?");
		 System.out.println("insert update values");
		 id=sc.nextInt();
		 up.setInt(1, id);
		 System.out.println("enter which i u want to update");
		 id=sc.nextInt();	 
		 up.setInt(2, id);
		 up.execute();
		 System.out.println("updated");
		 break;
		 
	case  "delete" :
		PreparedStatement del=con.prepareStatement("delete from patients where id=?");
		System.out.println("enter id to delete");
		id=sc.nextInt();
		del.setInt(1,id);
		del.execute();
		System.out.println("updated");
		break;
		
	case "fetch":
		PreparedStatement fet=con.prepareStatement("select *  from patients where id=?");
		System.out.println("enter id to fetch");
		id=sc.nextInt();
		fet.setInt(1, id);
	    ResultSet rs=fet.executeQuery();
	   if( rs.next()) {
	    System.out.println(rs.getInt(1));
	    System.out.println(rs.getString(2));
	    System.out.println(rs.getString(3));
	   }
	   else {
		   System.out.println("user not found");
	   }
	    break;
	    
	case "fetchAll":
		PreparedStatement fall=con.prepareStatement("select * from patients");
		ResultSet rsa=fall.executeQuery();
		while(rsa.next()) {
			System.out.println(rsa.getInt(1));
		    System.out.println(rsa.getString(2));
		    System.out.println(rsa.getString(3));
		}
		break;
	}
}
}
