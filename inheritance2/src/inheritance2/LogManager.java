package inheritance2;

public class LogManager {
	public void log(int logType) {
		if(logType == 2) {
			System.out.println("Dosyaya logland�");
		}
		else if (logType == 3) {
			System.out.println("Email logland�");
		}
		
	}
}

//1- Database
//2- File
//3- Email
