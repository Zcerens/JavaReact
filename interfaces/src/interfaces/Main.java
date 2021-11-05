package interfaces;

public class Main {

	public static void main(String[] args) {
		
		Logger[] loggers = {new SmsLogger(), new EmailLogger()};
		
		CustomerManager customerManager = new CustomerManager(loggers) ;
		
		Customer ceren = new Customer(1, "Ceren", "�AH�N");
		
		customerManager.add(ceren);

	}

}
