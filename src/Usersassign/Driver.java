package Usersassign;

import java.sql.SQLException;
import java.util.Scanner;

public class Driver {
public static void main(String[] args) throws SQLException {
	Scanner sc = new Scanner(System.in);
		System.out.println("enter id");
		int id=sc.nextInt();
		System.out.println("enter name");
		String name=sc.next();
		System.out.println("enter email");
		String email=sc.next();
		System.out.println("enter password");
		String password=sc.next();
		
		//Validation.validation(email,password);
		UserDao.saveUser(id,name,email,password);
	
}
}
