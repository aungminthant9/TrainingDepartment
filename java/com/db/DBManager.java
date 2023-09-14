package com.db;
import java.sql.*;
public class DBManager {
  public Connection connector() throws ClassNotFoundException, SQLException {
	  Connection c = null;
	  Class.forName("com.mysql.cj.jdbc.Driver");
	  String url = "jdbc:mysql://localhost:3306/training_department";
	  String user = "root";
	  String pass = "12345";
	  c = DriverManager.getConnection(url,user,pass);
	  return c;
  }
  public static void main(String[]args) throws ClassNotFoundException, SQLException {
	  DBManager dbm = new DBManager();
	  try {
		  dbm.connector();
		  System.out.println("Successfully Connected");
	  }
	  catch(ClassNotFoundException|SQLException e) {
		  e.printStackTrace();
	  }
  }
}