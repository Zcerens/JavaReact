package intro;

public class Main {

	public static void main(String[] args) {

		String internetSubeButonu = "�nternet �ubeye Gir";
		double dolarDun = 8.10;
		double dolarBugun = 8.10;
		int vade = 36;
		boolean dustuMu = false;

		System.out.println(internetSubeButonu);

		if (dolarBugun < dolarDun) {
			System.out.println("Dolar de�er kaybetti image");
		} else if (dolarBugun == dolarDun) {
			System.out.println("Dolar de�er de�i�tirmedi image");
		} else {
			System.out.println("Dolar de�er kazand� image");
		}

		String[] krediler = { "H�zl� kredi", "Mutlu emekli kredisi", "Konut kredisi", "�ift�i kredisi", "Meb kredisi" };

		// foreach
		for (String kredi : krediler) {
			System.out.println(kredi);
		}

		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}

	}
}
