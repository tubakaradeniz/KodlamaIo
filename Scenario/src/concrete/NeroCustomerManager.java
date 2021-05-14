package concrete;

import java.rmi.RemoteException;

import abstracts.BaseCustomerManager;
import abstracts.CustomerCheckService;
import entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager {
	
	private CustomerCheckService customerCheckService;
	
	public NeroCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService= customerCheckService;
	}
	
	@Override
	public void save(Customer customer)  {
		
		if(customerCheckService.checkIfRealPerson(customer)) {
			
		super.save(customer); // veri taban�na kaydedilen kod
}
		else
			System.out.println("Not a valid person ");
	}

}
