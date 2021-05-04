package customerManagementSystem.concrete;

import customerManagementSystem.abstracts.BaseCustomerManager;
import customerManagementSystem.abstracts.CustomerCheckService;
import customerManagementSystem.entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
	CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}
	
	@Override
	public void save(Customer customer) throws Exception {
		if (customerCheckService.checkIfRealPerson(customer)) {
			super.save(customer);
		}else {
			throw new Exception("Not a valid person");
		}
		
	}
}
