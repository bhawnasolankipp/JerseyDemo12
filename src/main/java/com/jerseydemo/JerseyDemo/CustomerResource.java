package com.jerseydemo.JerseyDemo;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("customers")
public class CustomerResource {
	CustomerRepository repo=new CustomerRepository();
@GET
@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
public List<Customer> getCustomer()
{
	System.out.println("get method call....");
	
return  repo.getCustomer();
}
@GET
@Path("customer/{cusid}")
@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
public Customer getCustomer1(@PathParam("cusid")int cusid)
{
	System.out.println("get method call....");
	
return  repo.getCustomer(cusid);
}
@POST
@Path("customer")
@Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	/* @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML}) */
	
public Customer createCustomer(Customer cust)
{
	System.out.println("post method call....");
	repo.create(cust);
	return cust;
}
@PUT
@Path("customer")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)

	public Customer updateCustomer(Customer cust)
	{
	if(repo.getCustomer(cust.getCusId()).getCusId()==0)
	{
		
		repo.create(cust);
	}
	else {
	repo.update(cust);
	System.out.println("put method call...."); 
	}
		return cust;
	 }
	}


