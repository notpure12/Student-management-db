package student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

import db.connection;
public class student {
	Connection con = connection.getConnection();
	PreparedStatement ps;
	
	public int getLim() {
		int Id =1;
		Statement st;
		try {
			st = con.createStatement();
			ResultSet rs = st.executeQuery("select max(id)form student");
			while (rs.next()) {
				Id = rs.getInt(1);
			}
		}catch(SQLException ex) {
			Logger.getLogger(student.class.getName()).log(Level.SEVERE,null,ex);
		}
		return Id + 1;
		
	}
	
	public void insert(String id,String name,String dob,String email,String tel,String address) {
		String sql = "insert into student values(?,?,?,?,?,?)";
		try { 
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
			ps.setString(2, name);
			ps.setString(3, dob);
			ps.setString(4, email);
			ps.setString(5, tel);
			ps.setString(6, address);
			
			if(ps.executeUpdate()>0) {
				JOptionPane.showMessageDialog(null, "New student added");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
