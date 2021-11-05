package inheritance2;

public class CustomerManager {
	public void add(Logger logger) {
		//müþteri ekleme kodlarý
		System.out.println("Müþteri eklendi.");
		
		logger.log();
	}

}

//Somut sýnýflar newlenemez, sürdürülebilirliði yok.(EmailLogger, DatabaseLogger, FileLogger)
