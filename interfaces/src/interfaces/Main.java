package interfaces;

public class Main {

	public static void main(String[] args) {
		
		Logger[] loggers = {new SmsLogger(), new EmailLogger()};
		
		CustomerManager customerManager = new CustomerManager(loggers) ;
		
		Customer ceren = new Customer(1, "Ceren", "ÞAHÝN");
		
		customerManager.add(ceren);

	}

}
