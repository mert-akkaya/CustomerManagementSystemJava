package customerManagementSystem;

import java.sql.Date;

import customerManagementSystem.abstracts.BaseCustomerManager;
import customerManagementSystem.adapters.MernisServiceAdapter;
import customerManagementSystem.concrete.NeroCustomerManager;
import customerManagementSystem.concrete.StarbucksCustomerManager;
import customerManagementSystem.entities.Customer;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Customer realCustomer = new Customer();
		realCustomer.setId(1);
		realCustomer.setFirstName("Mert");
		realCustomer.setLastName("Akkaya");
		realCustomer.setDateOfBirth(new Date(2000,11,21));
		realCustomer.setNationalIndentity("10061591058");
		
		BaseCustomerManager baseCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		baseCustomerManager.save(realCustomer);
		
	}

}
