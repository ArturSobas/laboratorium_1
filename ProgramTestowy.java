package lab1;

public class ProgramTestowy {

	public static void main(String[] args) {
		//stworzenie obiektu klasy punktMaterialny za pomoca konstruktora domyslnego
		PunktMaterialny pm1 = new PunktMaterialny();
		
		//stworzenie obiektu klasy punktMaterialny za pomoca konstruktora z parametrami
		PunktMaterialny pm2 = new PunktMaterialny(3.57);
		
		System.out.println("Informacje o stworzonych obiektach: ");
		
		//wyswietlenie informacji na temat pierwszego obiektu
		System.out.println(pm1.opis() + ", GMB: " + pm1.GMB() + ", GMB wzg innej osi " + pm1.GMB(3));
		
		//wyswietlenie informacji na temat drugiego obiektu
		System.out.println(pm2.opis() + ", GMB: " + pm2.GMB() + ", GMB wzg innej osi " + pm2.GMB(3) + "\n");
		
		//zmiana masy pierwszego obiektu
		pm1.setMasa(7);
		
		//wyswietlenie informacji na temat pierwszego obiektu
		System.out.println("Informacje na temat pierwszego obiektu po  zmianie jego masy:");
		System.out.println(pm1.opis() + ", GMB: " + pm1.GMB() + ", GMB wzg innej osi " + pm1.GMB(3) + "\n"); 
	
		//stworzenie tablicy obiektow klasy punktMaterialny oraz inicjalizacja ich
		PunktMaterialny[] punktyMaterialne = new PunktMaterialny[5];
		for (int i = 0;i < punktyMaterialne.length;i++){
			punktyMaterialne[i] = new PunktMaterialny(i + 3);
		}
		
		//wyswietlenie informacji na temat obiektow klasy punktMaterialny znajdujacych sie w tablicy arr
		System.out.println("Informacje o obiektach przechowywanych w tablicy");
		for (int i = 0;i < punktyMaterialne.length;i++){
			System.out.println(punktyMaterialne[i].opis() + ", GMB: " + punktyMaterialne[i].GMB() + 
			", GMB wzg innej osi " + punktyMaterialne[i].GMB(3)); 
		}
	}
}
