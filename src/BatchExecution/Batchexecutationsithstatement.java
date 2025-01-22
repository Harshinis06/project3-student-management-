package BatchExecution;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Batchexecutationsithstatement {
public static void main(String[] args) throws SQLException, ClassNotFoundException {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "root", "PHW#84#jeor");
	Statement st =con.createStatement();
	 
	st.addBatch("insert into patients(id,name,cause)values(2,'c','maleriya')");
	st.addBatch("insert into patients(id,name,cause)values(4,'d','dengu')");
	st.addBatch("insert into patients(id,name,cause)values(5,'e','viral')");
	st.addBatch("insert into patients(id,name,cause)values(6,'f','jeo')");
	
	st.executeBatch();
	
}
}
