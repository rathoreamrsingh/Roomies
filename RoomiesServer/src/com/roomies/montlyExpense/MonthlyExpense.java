/**
 * 
 */
package com.roomies.montlyExpense;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author amar
 *
 */
@XmlRootElement(name = "Monthly_Expense_Data")
public class MonthlyExpense {
	private int expenseId;
	private String userId;
	private String groupId;
	private String itemName;
	private String itemDescription;
	private int totalAmount;
	private Date purchaseDate;
	private Date dateEntryAdded;
	private Date lastModificationDate;

	public MonthlyExpense() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MonthlyExpense(int expenseId, String userId, String groupId, String itemName, String itemDescription,
			int totalAmount, Date purchaseDate, Date dateEntryAdded, Date lastModificationDate) {
		super();
		this.expenseId = expenseId;
		this.userId = userId;
		this.groupId = groupId;
		this.itemName = itemName;
		this.itemDescription = itemDescription;
		this.totalAmount = totalAmount;
		this.purchaseDate = purchaseDate;
		this.dateEntryAdded = dateEntryAdded;
		this.lastModificationDate = lastModificationDate;
	}

	public int getExpenseId() {
		return expenseId;
	}

	public void setExpenseId(int expenseId) {
		this.expenseId = expenseId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemDescription() {
		return itemDescription;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	public int getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Date getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public Date getDateEntryAdded() {
		return dateEntryAdded;
	}

	public void setDateEntryAdded(Date dateEntryAdded) {
		this.dateEntryAdded = dateEntryAdded;
	}

	public Date getLastModificationDate() {
		return lastModificationDate;
	}

	public void setLastModificationDate(Date lastModificationDate) {
		this.lastModificationDate = lastModificationDate;
	}

}
