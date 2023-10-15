package db;
import java.sql.Connection;
import java.sql.DriverManager;
public class connection {
	private static final String username = "root";
	private static final String password = "";
	private static final String dataconn = "jdbc:mysql://localhost:3306/student_management";
	private static Connection con = null;
	
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(dataconn,username,password);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.print(e.getMessage());
		}
		return con;
	}
}
