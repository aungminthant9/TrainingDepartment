package com.db;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.model.Register;

public class RegisterCRUD {
	public void insertRegistrationData(Register r) throws ClassNotFoundException, SQLException {
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
		ps.setString(1, r.getName());
		ps.setString(2, r.getEmail());
		ps.setString(3, r.getSelected_course());
		ps.setString(4, r.getDateofBirth());
		ps.executeUpdate();
		dbm.connector().close();
	}
}
