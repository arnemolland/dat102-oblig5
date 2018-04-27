package no.hvl.dat102.oppg3;

public class Main {
	public static void main(String[] a) {

		clear();

		// Tester haugen ved å sortere verdier i en tabell
		int tab[] = { 300, 10, 30, 2, 100, 33, 1, 200, 18, 54 };

		TabellHaug<Integer> h1 = new TabellHaug<Integer>();

		for (int i = 0; i < tab.length; i++) {
			h1.leggTilElement(new Integer(tab[i]));
		}

		System.out.println("Verdiene i tabellen er nå:");
		h1.skrivTab();

		// Tar ut av haugen og skriver i sortert rekkefølge
		System.out.println("\nHaugen i sortert rekkefoelge:");

		while (!h1.erTom()) {
			Integer h = (Integer) h1.fjernMinste();
			System.out.print(h + "  ");
		}

		System.out.println();
	}

	private static void clear() {  
		System.out.print("\033[H\033[2J");  
		System.out.flush();  
	}  
}
