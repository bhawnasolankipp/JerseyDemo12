package com.jerseydemo.JerseyDemo;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository {
List<Customer> customers;
public CustomerRepository()
{
	customers=new ArrayList<>();
	Customer cust= new Customer();
	cust.setCusId(101);
	cust.setCusName("arihant");
	cust.setCusCity("Indore");
	
	Customer cust1= new Customer();
	cust1.setCusId(102);
	cust1.setCusName("Alian");
	cust1.setCusCity("Pune");
	customers.add(cust);
	customers.add(cust1);
   }
public List<Customer> getCustomer()
{
	return customers;
}
public Customer getCustomer(int cusid)
{
	for(Customer cs: customers)
		{ 
		if(cs.getCusId()==cusid)
			
		return cs;
	}
      return (Customer) customers;
}
public void create(Customer cust) {
	// TODO Auto-generated method stub
	customers.add(cust);
}
public void update(Customer cust) {
	// TODO Auto-generated method stub
	((CustomerRepository) customers).update(cust);
}


}