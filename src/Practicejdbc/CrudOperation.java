package Practicejdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.jsp.Helper.Helper;

public class CrudOperation {
public static void main(String[] args) throws SQLException {
	Connection con=Helper.getConnection();
	Statement st=con.createStatement();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter which operation");
	String operation=sc.next();
	switch(operation) {
	case "insert":
		st.execute("insert into patients(id,name,cause)values(3,'a','fever')");
		System.out.println("inserted");
		break;
	case "update":
		st.execute("update patients set name='"
				+ "b' where id=1");
		System.out.println("updated");
		break;
	case "delete":
		st.execute("delete from patients where id=1");
		System.out.println("value deleted");
		break;
	}
}
}
