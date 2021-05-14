package adapters;

import java.time.*;
import abstracts.CustomerCheckService;
import entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {
	

	@Override
	public boolean checkIfRealPerson(Customer customer)  {

		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		boolean result =false;
		
		try {
			result = client.TCKimlikNoDogrula(Long.parseLong(customer.getNationality()),customer.getFirstName().toUpperCase(),customer.getLastName().toUpperCase(), customer.getDateOfBirth().getYear());		

		} catch (Exception e) {
			System.out.println("Hata : mernis service adapter");
		}
		return result;
		
	}

}
