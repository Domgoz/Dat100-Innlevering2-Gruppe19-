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

		// TODO
		throw new UnsupportedOperationException("Metoden posisjonTall ikke implementert");
	}

	// f)
	public static int[] reverser(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("Metoden reverser ikke implementert");
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("Metoden erSortert ikke implementert");
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		// TODO
		throw new UnsupportedOperationException("Metoden settSammen ikke implementert");

	}
}
