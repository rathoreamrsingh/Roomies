/**
 * 
 */
package com.roomies.montlyExpense;

import java.util.Date;
import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

/**
 * @author amar
 *
 */
@Produces({ "application/xml", "application/json" })
public interface MontlyExpenseService {

	@POST
	@Path("/monthly_expense/")
	public Response addExpense(MonthlyExpense me);

	@PUT
	@Path("/monthly_expense/")
	public Response updateExpense(MonthlyExpense me);

	@GET
	@Path("/monthly_expense/{id}/")
	public MonthlyExpense getMontlyExpenseWithId(@PathParam("id") String id);

	@POST
	@Path("/monthly_expense/all/")
	public List<MonthlyExpense> getAllExpenseBetweenDate(@FormParam("start_date") Date startDate,
			@FormParam("end_date") Date endDate);

	@DELETE
	@Path("/monthly_expense/{id}/")
	public Response deleteExpense(@PathParam("id") String id);
}
