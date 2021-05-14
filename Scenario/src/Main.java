import java.time.LocalDate;
import adapters.MernisServiceAdapter;
import abstracts.BaseCustomerManager;
import concrete.NeroCustomerManager;
import concrete.StarbucksCustomerManager;
import entities.Customer;
import abstracts.CustomerCheckService;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager baseCustomerManager = new NeroCustomerManager(new MernisServiceAdapter());
		baseCustomerManager.save(new Customer(1, LocalDate.of(1991, 9, 14), "Tuba", "Karadeniz", "12345678901"));
		
	 
		

	}

}
