

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Jdbcstatement {
	public static void main(String[] args) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/ns","root","ns@11");
		Statement st=con.createStatement();
//		st.executeUpdate("insert into emp values (111,'ns',2000)");
//		st.executeUpdate("insert into emp values (222,'as',5000)");
//		st.executeUpdate("insert into emp values (333,'ss',3000)");
//		System.out.println("inserted");
		ResultSet rs=st.executeQuery("select * from emp");
		while (rs.next()) {
			System.out.println(rs.getInt("eno")+" "+rs.getString("ename")+" "+rs.getInt("esalary"));
		}
		con.close();
	}catch (Exception e) {
		System.out.println(e);
	}
}

}
