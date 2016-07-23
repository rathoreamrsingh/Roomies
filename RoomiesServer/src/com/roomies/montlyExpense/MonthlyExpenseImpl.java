/**
 * 
 */
package com.roomies.montlyExpense;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import javax.ws.rs.core.Response;

import com.roomies.databaseHelper.DatabaseHelper;

/**
 * @author amar
 *
 */
public class MonthlyExpenseImpl implements MontlyExpenseService {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.roomies.montlyExpense.MontlyExpenseService#addExpense(com.roomies.
	 * montlyExpense.MonthlyExpense)
	 */

	private String insertData = "INSERT INTO montly_expense(userid, groupid, \"itemName\", \"itemDescription\", \"totalAmount\",\"purchaseDate\", \"lastModifiedDate\", \"dateEntryAdded\") VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

	private String updateData = "UPDATE montly_expense SET \"itemName\"=?, \"itemDescription\"=?, \"totalAmount\"=?, \"purchaseDate\"=?, \"lastModifiedDate\"=? WHERE expenseid=?";

	@Override
	public Response addExpense(MonthlyExpense me) {
		DatabaseHelper databaseHelper = new DatabaseHelper();
		Connection conn = null;

		PreparedStatement stmt = null;
		try {
			databaseHelper.createConnection();
			conn = databaseHelper.getConnection();
			stmt = conn.prepareStatement(insertData);

			stmt.setString(1, me.getUserId());
			stmt.setString(2, me.getGroupId());
			stmt.setString(3, me.getItemName());
			stmt.setString(4, me.getItemDescription());
			stmt.setInt(5, me.getTotalAmount());
			stmt.setDate(6, new java.sql.Date(me.getPurchaseDate().getTime()));
			stmt.setDate(7, new java.sql.Date(new Date().getTime()));
			stmt.setDate(8, new java.sql.Date(new Date().getTime()));

			return (Response.ok(stmt.executeUpdate()).build());

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return (Response.notModified().build());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return (Response.notModified().build());
		} finally {
			try {
				databaseHelper.closeConnection();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.roomies.montlyExpense.MontlyExpenseService#updateExpense(com.roomies.
	 * montlyExpense.MonthlyExpense)
	 */
	@Override
	public Response updateExpense(MonthlyExpense me) {
		// TODO Auto-generated method stub
		DatabaseHelper databaseHelper = new DatabaseHelper();
		Connection conn = null;
		PreparedStatement stmt = null;
		try {
			databaseHelper.createConnection();
			conn = databaseHelper.getConnection();
			stmt = conn.prepareStatement(updateData);
			stmt.setString(1, me.getItemName());
			stmt.setString(2, me.getItemDescription());
			stmt.setInt(3, me.getTotalAmount());
			stmt.setDate(4, new java.sql.Date(me.getPurchaseDate().getTime()));
			stmt.setDate(5, new java.sql.Date(new Date().getTime()));
			stmt.setInt(6, me.getExpenseId());
			return Response.ok(stmt.executeUpdate()).build();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return Response.notModified().build();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return Response.notModified().build();
		} finally {
			try {
				databaseHelper.closeConnection();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	/*
	 * (non-Javadoc)
	 * c
	 * @see
	 * com.roomies.montlyExpense.MontlyExpenseService#getMontlyExpenseWithId(
	 * java.lang.String)
	 */
	@Override
	public MonthlyExpense getMontlyExpenseWithId(String id) {
		int expenseid = Integer.parseInt(id);
						
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.roomies.montlyExpense.MontlyExpenseService#getAllExpenseBetweenDate(
	 * java.util.Date, java.util.Date)
	 */
	@Override
	public List<MonthlyExpense> getAllExpenseBetweenDate(Date startDate, Date endDate) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.roomies.montlyExpense.MontlyExpenseService#deleteExpense(java.lang.
	 * String)
	 */
	@Override
	public Response deleteExpense(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
