import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
BaseCustomerManager baseCustomerManager=new NeroCustomerManager(new MernisServiceAdaptor());


baseCustomerManager.save(new Customer(1, "Hasan", "G�der",LocalDate.of(1994, 8, 7), "0123456789"));
	
	

	}

}
