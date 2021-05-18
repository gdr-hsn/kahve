
public class NeroCustomerManager extends BaseCustomerManager{
	private ICustomerCheckService customerCheckService;

	public NeroCustomerManager(ICustomerCheckService customerCheckService) {
		this.customerCheckService=customerCheckService;
		
	}
@Override
public void save(Customer customer) {
	if(customerCheckService.CheckIfRealPerson(customer)) {
		super.save(customer);

	}
	else {
	Exception e=new Exception();
	System.out.println("Person not a valid "+e.getMessage());
	}
}
}
