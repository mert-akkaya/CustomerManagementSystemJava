package customerManagementSystem.abstracts;

import java.rmi.RemoteException;

import customerManagementSystem.entities.Customer;

public interface CustomerCheckService {
	boolean checkIfRealPerson(Customer customer) throws NumberFormatException, RemoteException;
}
