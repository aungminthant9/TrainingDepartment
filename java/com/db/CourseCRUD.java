package com.db;
import com.model.*;
import java.sql.*;
import java.util.*;

public class CourseCRUD {
	public void insertDietData(Register r) throws ClassNotFoundException, SQLException {
		DBManager dbm = new DBManager();
		dbm.connector();
		String sql="INSERT INTO `training_department`.`register`\r\n"
				+ "(`user_name`,\r\n"
				+ "`email`,\r\n"
				+ "`selected_course`,\r\n"
				+ "`d_of_birth`)\r\n"
				+ "VALUES\r\n"
				+ "(?,?,?,?);\r\n";
		PreparedStatement ps = dbm.connector().prepareCall(sql);
		ps.setString(1,r.getName());
		ps.setString(2,r.getEmail());
		ps.setString(3,r.getSelected_course());
		ps.setString(4,r.getDateofBirth());
		ps.executeUpdate();
		dbm.connector().close();
	}

	 public ArrayList<Register> selectall() throws ClassNotFoundException, SQLException{
		 ArrayList<Register> courseList = new ArrayList<Register>();
		 Register r;
		 DBManager dbm = new DBManager();
		 dbm.connector();
		 String sql ="SELECT `register`.`id`,\r\n"
		 		+ "    `register`.`user_name`,\r\n"
		 		+ "    `register`.`email`,\r\n"
		 		+ "    `register`.`selected_course`,\r\n"
		 		+ "    `register`.`d_of_birth`\r\n"
		 		+ "FROM `training_department`.`register`;";
		 PreparedStatement ps = dbm.connector().prepareStatement(sql);
		 ResultSet rs = ps.executeQuery();
		 while(rs.next()) {
			 r=new Register(rs.getInt("id"),rs.getString("user_name"),rs.getString("email"),rs.getString("selected_course"),rs.getString("d_of_birth"));
			 courseList.add(r);
		 }
		 dbm.connector().close();
		return courseList;
		 
	 }
	 public void update(Register r) throws ClassNotFoundException, SQLException {
		 DBManager dbm = new DBManager();
		 dbm.connector();
		 String sql="UPDATE `training_department`.`register`\r\n"
		 		+ "SET\r\n"
		 		+ "`user_name` = ?,\r\n"
		 		+ "`email` = ?,\r\n"
		 		+ "`selected_course` = ?,\r\n"
		 		+ "`d_of_birth` = ?\r\n"
		 		+ "WHERE `id` = ?;";
		 PreparedStatement ps = dbm.connector().prepareStatement(sql);
		 ps.setString(1,r.getName());
		 ps.setString(2,r.getEmail());
		 ps.setString(3,r.getSelected_course());
		 ps.setString(4,r.getDateofBirth());
		 ps.setInt(5,r.getId());
		 ps.executeUpdate();
	     dbm.connector().close();	 
	 }
	 
	 public void delete(int id) throws ClassNotFoundException, SQLException {
		 DBManager dbm = new DBManager();
		 dbm.connector();
		 String sql ="DELETE FROM `training_department`.`register`\r\n"
		 		+ "WHERE `id`=?;\r\n";
		 
		 PreparedStatement ps = dbm.connector().prepareStatement(sql);
		 ps.setInt(1,id);
		 ps.executeUpdate();
	 }
	 public static void main(String[]args) throws ClassNotFoundException, SQLException {
		 CourseCRUD dc = new CourseCRUD();
		 ArrayList<Register> courseList = dc.selectall();
		 for(Register data:courseList) {
			 System.out.println("ID:"+ data.getId());
			 System.out.println("User Name:"+data.getEmail());
			 System.out.println("Email:"+data.getEmail());
		 }
	 }
}
