package inheritance;


public class CustomerManager {
	
	public void add(Customer customer) {
		System.out.println(customer.customerNumber + " kaydedildi");
	}
	
	public void addMultipler(Customer[] customers) {
		for(Customer customer : customers) {
			System.out.println(customer.customerNumber);
		}
	}
	
	}

//SOLID - Open Closed Principle (Yeni özellik geldiðinde hiçbir kodu deðiþtiremezsin)
