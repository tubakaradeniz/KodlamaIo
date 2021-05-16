package adapters;

import java.rmi.RemoteException;

import abstracts.CustomerCheckService;
import entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		KPSPublicSoapProxy client=new KPSPublicSoapProxy();
		boolean result=false;
		try {
			result= client.TCKimlikNoDogrula
					(Long.parseLong(customer.getNationality()),
				     customer.getFirstName().toUpperCase(),
					 customer.getLastName().toUpperCase(),
					 customer.getDateOfBirth());
					
		}
		catch (RemoteException e) {
			e.printStackTrace();
		
		
		
	}
		return result;
	}
}
