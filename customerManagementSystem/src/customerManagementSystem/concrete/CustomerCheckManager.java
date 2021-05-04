package customerManagementSystem.concrete;

import customerManagementSystem.abstracts.CustomerCheckService;
import customerManagementSystem.entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		return true;
	}

}
