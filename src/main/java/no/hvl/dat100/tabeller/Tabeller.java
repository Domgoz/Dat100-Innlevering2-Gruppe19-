package no.hvl.dat100.tabeller;


public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {
		for (int i = 0; i < tabell.length; i++) {
			System.out.print(tabell[i] + " ");
		 }
	 }
	

	// b)
	public static String tilStreng(int[] tabell) {
		if (tabell.length == 0) {return "[]";};
		String s = "[";
		for (int i = 0; i < (tabell.length - 1); i ++) {
			s = s + "" + tabell[i] + ",";
		}
	    return s + tabell[tabell.length-1] + "]";
	}

	// c)
	public static int summer(int[] tabell) {
		int sum = 0;
		for (int eger: tabell) {
			sum += eger;
		}
		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		for (int eger: tabell) {
			if (eger == tall) {
				return true;
			}
		}
		return false;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		int i = 0;
		for (int t: tabell) {
			if (t == tall) {
				return i;
			}
			i ++;
		}
		return -1;
	}

	// f)
	public static int[] reverser(int[] tabell) {
		int[] nytab = new int[tabell.length];
		for (int i = 0; i < tabell.length; i++) {
			nytab[i] = tabell[tabell.length - 1 - i];
			nytab[i] = tabell[tabell.length-1 - i];
		}
		return nytab;
		
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		for (int j = 1; j < tabell.length; j++) {
		if (!(tabell[j-1] <= tabell[j])) {
			return false;
		}
		}
		return true;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		int[] nytab = new int[tabell1.length + tabell2.length];
		int[][] tabeller = {tabell1, tabell2}; 
		// ovenfor kunne 
		// metoden vært modifisert for å sette
		// sammen flere tabeller
		int sist = 0;
		for (int[] tab: tabeller) {
			for (int i = sist; i < sist + tab.length; i ++) {
				nytab[i] = tab[i - sist];
			}
			sist = sist + tab.length;
		}
		return nytab;
		}
}
















