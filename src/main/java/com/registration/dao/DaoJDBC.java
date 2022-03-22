package com.registration.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.registration.model.UserDetails;

public class DaoJDBC {
	// code for JDBC CONNECTIVITY

	private String db_url = "jdbc:mysql://localhost:3306/jdbc";
	private String db_uname = "root";
	private String db_password = "root";
	private String db_Driver = "com.mysql.cj.jdbc.Driver";

	// create a method to load driver

	public void loadDriver(String db_Driver) {
		try {
			Class.forName(db_Driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// create method for connection

	public Connection getConnection() {
		Connection con = null;
		try {
			con = DriverManager.getConnection(db_url, db_uname, db_password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;

	}

	// Insert method

	public String insert(UserDetails details) {
		// call the above methods
		String result = "Data inserted successfully!";
		loadDriver(db_Driver);
		Connection con = getConnection();

		String query = "INSERT INTO studentdetails VALUES(?,?,?,?,?,?)";

		PreparedStatement ps;
		try {
			ps = con.prepareStatement(query);

			ps.setString(1, details.getFname());
			ps.setString(2, details.getLname());
			ps.setString(3, details.getEmail());
			ps.setString(4, details.getPassword());

			ps.setString(5, details.getAge());
			ps.setString(6, details.getCourse());

			ps.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

			// create a string to store that the data is not inserted
			result = "Data not inserted!";

		}

		return result;
	}
}
