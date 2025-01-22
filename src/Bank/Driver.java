package Bank;

import java.sql.SQLException;
import java.util.Scanner;

public class Driver {
public static void main(String[] args) throws SQLException {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter id");
	int id=sc.nextInt();
	System.out.println("enter name");
	 String name=sc.next();
	System.out.println("enter age");
	int age=sc.nextInt();
	System.out.println("enter account");
	long account=sc.nextLong();
	System.out.println("enter pincode");
	int pincode=sc.nextInt();
	System.out.println("enter IFSCcode");
	String ifsc=sc.next();
	System.out.println("enter balance");
	double balance=sc.nextDouble();
	
	UserDao.saveUser(id,name,age,account,pincode,ifsc,balance);
}
}
