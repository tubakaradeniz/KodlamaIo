package concrete;

import abstracts.BaseCustomerManager;
import abstracts.CustomerCheckService;
import entities.Customer;

public class StarbucksManager extends BaseCustomerManager {
	
	private CustomerCheckService customerCheckService;
	
	public StarbucksManager(CustomerCheckService customerCheckService) {
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
