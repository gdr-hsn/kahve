

public class StarbucksCustomerManager extends BaseCustomerManager{
	
	private ICustomerCheckService customerCheckService;
	
	public  StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
		
		this.customerCheckService=customerCheckService;
		// TODO Auto-generated constructor stub
	}

@Override
public void save(Customer customer) {
	// TODO Auto-generated method stub
	if(customerCheckService.CheckIfRealPerson(customer)) {
		super.save(customer);

	}
	else {
	Exception e=new Exception();
	System.out.println("Person not a valid "+e.getMessage());
	}
}
}
