package Assignmenttudent;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Student {
public static void main(String[] args) throws SQLException {
	Connection con=DriverManager.getConnection( "jdbc:mysql: //localhost:3306/university", "root", "PHW#84#jeor");
	Statement st=con.createStatement();
	//st.execute("create table student(id int(2) ,name varchar(20),age int(2) )");
	//insertOrder(st);
	//updation(st);
	//fetchdata(st);
	//deletedata(st);
	fetchalldata(st);
	
	System.out.println("executed");
}
private static void fetchalldata(Statement st) throws SQLException {
	// TODO Auto-generated method stub
	ResultSet rs=st.executeQuery("select * from student");
	while(rs.next()) {
		System.out.println(rs.getInt(1));
		System.out.println(rs.getString(2));
		System.out.println(rs.getInt(3));
		System.out.println("-----------------");
}
}
private static void deletedata(Statement st) throws SQLException {
	// TODO Auto-generated method stub
	st.execute("delete from student where id=4");
}


private static void fetchdata(Statement st) throws SQLException {
	// TODO Auto-generated method stub
	ResultSet rs=st.executeQuery("select * from student where id =1");
	rs.next();
	System.out.println(rs.getInt(1));
	System.out.println(rs.getString(2));
	System.out.println(rs.getInt(3));
}


public static void updation(Statement st) throws SQLException {
	// TODO Auto-generated method stub
	st.execute("update student set name='kamu' where id=2");
	
}


public static void insertOrder(Statement st) throws SQLException {
	//st.execute("insert into student(id,name,age)values(1,'harshini',22)");
	st.execute("insert into student(id,name,age)values(2,'harsh',20)");
	st.execute("insert into student(id,name,age)values(3,'sara',2)");
	st.execute("insert into student(id,name,age)values(4,'saravanan',49)");
}
}
