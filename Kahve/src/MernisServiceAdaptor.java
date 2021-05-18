import java.rmi.RemoteException;
import java.util.function.LongPredicate;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;



public class MernisServiceAdaptor implements ICustomerCheckService{
	
	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		
		boolean result;
		KPSPublicSoapProxy client = new KPSPublicSoapProxy(); 
		
		try { 
			result = client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),customer.getFirstName().toUpperCase(),customer.getLastName().toUpperCase(),customer.getDateOfBirth().getYear()); 
		}
	    catch (RemoteException e) { 
			result = false; 
			e.printStackTrace(); 
		}
		
		return result;


	}

}
