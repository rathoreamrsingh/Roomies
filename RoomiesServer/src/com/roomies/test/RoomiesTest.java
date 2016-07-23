package com.roomies.test;

import java.util.Date;

import javax.ws.rs.core.Response;

import com.roomies.montlyExpense.MonthlyExpense;
import com.roomies.montlyExpense.MonthlyExpenseImpl;
import com.roomies.montlyExpense.MontlyExpenseService;

public class RoomiesTest {
	public static void main(String[] args) {
		/**
		 * Testing Insert
		 */
		/*MonthlyExpense monthlyExpense = new MonthlyExpense();
		monthlyExpense.setUserId("amars");
		monthlyExpense.setGroupId("as");
		monthlyExpense.setItemName("aalu");
		monthlyExpense.setItemDescription("just for testing");
		monthlyExpense.setPurchaseDate(new Date(10, 10, 2012));
		monthlyExpense.setTotalAmount(1000);
		monthlyExpense.setDateEntryAdded(new Date());
		
		MontlyExpenseService mes = new MonthlyExpenseImpl();
		Response expense = mes.addExpense(monthlyExpense);
		System.out.println(expense.getEntity());*/
		
		/**
		 * Testing update
		 */
		
		MonthlyExpense monthlyExpense = new MonthlyExpense();
		monthlyExpense.setItemName("aalu - pyaz");
		monthlyExpense.setItemDescription("just for testinger");
		monthlyExpense.setPurchaseDate(new Date(2015, 10, 10));
		monthlyExpense.setTotalAmount(10004);
		monthlyExpense.setExpenseId(2);
		MontlyExpenseService mes = new MonthlyExpenseImpl();
		Response expense = mes.updateExpense(monthlyExpense);
		System.out.println(expense.getEntity());
		
		
	}
}
