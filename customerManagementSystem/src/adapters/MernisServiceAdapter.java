package adapters;

import java.rmi.RemoteException;

import customerManagementSystem.abstracts.CustomerCheckService;
import customerManagementSystem.entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) throws NumberFormatException, RemoteException {
		
		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();
		
		boolean result = kpsPublicSoapProxy.TCKimlikNoDogrula(
				Long.parseLong(customer.getNationalIndentity()), 
				customer.getFirstName(), customer.getLastName(), 
				customer.getDateOfBirth().getYear());
		return result;
		
	}

}
