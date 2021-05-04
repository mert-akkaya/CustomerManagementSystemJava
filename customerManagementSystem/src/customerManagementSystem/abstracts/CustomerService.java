package customerManagementSystem.abstracts;

import customerManagementSystem.entities.Customer;

public interface CustomerService {
	void save(Customer customer) throws Exception;
}
