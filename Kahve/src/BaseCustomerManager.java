
public class BaseCustomerManager implements IcustomerService {

	@Override
	public void save(Customer customer) {
		System.out.println("Saved to db : "+customer.getFirstName());
		
	}

}
