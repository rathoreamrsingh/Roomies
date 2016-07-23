/**
 * 
 */
package com.roomies.databaseHelper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author amar
 *
 */
public class DatabaseHelper {

	private String DB_DRIVER = null;
	private String DB_CONNECTION = null;
	private String DB_USER = null;
	private String DB_PASSWORD = null;
	private Connection connection = null;

	public DatabaseHelper() {
		DB_DRIVER = "org.postgresql.Driver";
		DB_CONNECTION = "jdbc:postgresql://localhost:5432/roomies";
		DB_USER = "roomies";
		DB_PASSWORD = "roomies";
		// createConnection();
	}

	public DatabaseHelper getInstance() {
		return new DatabaseHelper();
	}

	public void createConnection() throws SQLException, ClassNotFoundException {
		Class.forName(DB_DRIVER);
		connection = DriverManager.getConnection(DB_CONNECTION, DB_USER, DB_PASSWORD);
	}

	public Connection getConnection() {
		return connection;
	}

	public void closeConnection() throws SQLException {
		if (connection != null) {
			connection.close();
		}
	}
}
