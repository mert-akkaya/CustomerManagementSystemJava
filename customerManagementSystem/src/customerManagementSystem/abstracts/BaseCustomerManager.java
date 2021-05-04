package customerManagementSystem.abstracts;

import customerManagementSystem.entities.Customer;

public abstract class BaseCustomerManager implements CustomerService {
	@Override
	public  void save(Customer customer) throws Exception {
		System.out.println("Added to db : "+ customer.getFirstName());
		
	}
}
