package no.hvl.dat100.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		// for tabell i matrise
		for (int[] tab: matrise) {
			// print startsymbol
			System.out.print("|");
			// for tall i tabell
			for (int t: tab) {
				// print tall + komma
				System.out.print(" " + t + " ");
			}
			System.out.println("|");
			// print sluttsymbol + newline
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		String s = "";
		// for tabell i matrise
		for (int[] tab: matrise) {
			for (int t: tab) {
				s = s + t + " ";
			}
			s += "\n";
			//  sluttsymbol + newline
		}
		return s;
		}
		
	
	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		int n = matrise.length;
		int[][] nytab = new int[matrise.length][];
		for (int i = 0; i < n; i ++) {
			nytab[i] = new int[matrise[i].length];
			for (int j = 0; j < matrise[i].length; j ++) {
				nytab[i][j] = matrise[i][j]*tall;
			}
		}
		return nytab;
	}
	

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		int l = a.length;
		if (l != b.length) return false;
		for (int i = 0; i < l; i++) {
			int tl = a[i].length;
			if (tl != b[i].length) return false;
			for (int j = 0; j < tl; j++) {
				if (a[i][j] != b[i][j]) return false;
			}
		}
		return true;	
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {
		int n = matrise.length;
		int[][] nym = new int[n][n];
		for (int i = 0; i < matrise.length; i ++) {
			for (int j = 0; j < matrise[i].length; j ++) {
				nym[i][j] = matrise[j][i];
			}
		}
		return nym;
	}
}








