package inheritance2;

public class CustomerManager {
	public void add(Logger logger) {
		//m��teri ekleme kodlar�
		System.out.println("M��teri eklendi.");
		
		logger.log();
	}

}

//Somut s�n�flar newlenemez, s�rd�r�lebilirli�i yok.(EmailLogger, DatabaseLogger, FileLogger)
