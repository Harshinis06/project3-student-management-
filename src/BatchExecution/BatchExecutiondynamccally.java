package BatchExecution;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchExecutiondynamccally {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.cj.jdbc.driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "root","PHW#84#jeor");
    Statement st=con.createStatement();
    st.addBatch("insert into patients(id,name,cause)values(?,?,?)");
}
}
