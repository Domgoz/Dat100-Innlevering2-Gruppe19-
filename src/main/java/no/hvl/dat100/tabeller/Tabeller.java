package no.hvl.dat100.tabeller;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {
		for (int i = 0; i < tabell.length; i++) {
			System.out.print(tabell[i] + " ");
		 }
	 }
	

	// b)
	public static String tilStreng(int[] tabell) {
		return Arrays.toString(tabell).replace(" ", "");
	}

	// c)
	public static int summer(int[] tabell) {
		int sum = IntStream.of(tabell).sum();
		System.out.println("Summen er " + sum);
		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		return Arrays.stream(tabell).anyMatch(n -> n == tall);
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
		for (int i = tabell.length - 1; i >= 0; i++) {
			nytab[i] = tabell[i];
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
		// sammen flere liste
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
















