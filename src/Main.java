import abstracts.BaseCustomerManager;
import adapters.MernisServiceAdapter;
import concrete.StarbucksManager;
import entities.Customer;

public class Main {  //

	public static void main(String[] args) {
		
		BaseCustomerManager customerManager =new StarbucksManager(new MernisServiceAdapter());
		customerManager.save(new Customer(1,1991,"Tuba","Karadeniz","12345678901"));

	}

}
