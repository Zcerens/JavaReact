package inheritance;

public class Main {

	public static void main(String[] args) {
		
		IndividualCustomer ceren = new IndividualCustomer();
		ceren.customerNumber = "1234";
		
		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.customerNumber = "5678";
		
		SendikaCustomer abc = new SendikaCustomer();
		abc.customerNumber = "9999";
		
		CustomerManager customerManager =new CustomerManager();
		
		Customer[] customers = {ceren, hepsiBurada, abc};
		
		customerManager.addMultipler(customers);
		
		
	}

}
