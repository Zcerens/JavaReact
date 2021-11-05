package intro;

public class Main {

	public static void main(String[] args) {

		String internetSubeButonu = "Ýnternet Þubeye Gir";
		double dolarDun = 8.10;
		double dolarBugun = 8.10;
		int vade = 36;
		boolean dustuMu = false;

		System.out.println(internetSubeButonu);

		if (dolarBugun < dolarDun) {
			System.out.println("Dolar deðer kaybetti image");
		} else if (dolarBugun == dolarDun) {
			System.out.println("Dolar deðer deðiþtirmedi image");
		} else {
			System.out.println("Dolar deðer kazandý image");
		}

		String[] krediler = { "Hýzlý kredi", "Mutlu emekli kredisi", "Konut kredisi", "Çiftçi kredisi", "Meb kredisi" };

		// foreach
		for (String kredi : krediler) {
			System.out.println(kredi);
		}

		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}

	}
}
