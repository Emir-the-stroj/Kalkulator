package novipaackage;

import java.util.Scanner;

public class TestKalkulator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite dva broja : ");

		int broj1 = input.nextInt();
		int broj2 = input.nextInt();
		Kalkulator kalkulator1 = new Kalkulator(broj1, broj2);

		System.out.println("Izaberite operacije koju zelite izvrsiti (1-sabiranje, 2-oduzimanje,"
				+ "3 -mnozenje, 4-dijeljenje, 5-kvadratno korjenovanje, 6-kvadriranje)");

		int korisnikovUnos = input.nextInt();
		switch (korisnikovUnos) {
		case 1:
			System.out.println("Sabiranje dva broja je " + kalkulator1.sabiranje(broj1, broj2));
			break;
		case 2:
			System.out.println("Oduzimanje dva broja je " + kalkulator1.oduzimanje(broj1, broj2));
			break;
		case 3:
			System.out.println("Mnozenje dva broja je " + kalkulator1.mnozenje(broj1, broj2));
			break;
		case 4:
			System.out.println("Dijeljenje dva broja je " + kalkulator1.dijeljenje(broj1, broj2));
			break;
		case 5:
			System.out.println("Kvadratni korijen " + broj1 + " broja je " + kalkulator1.KvadratnoKorjenovanje(broj1));
			break;
		case 6:
			System.out.println("Kvadrat broja " + broj1 + " je " + kalkulator1.Kvadriranje(broj1));
			break;
		default:
			System.out.println("Unesite  pozitivne broj od 1-6 za operaciju koju zelite da izvrsite.");

		}
		input.close();

	}

}
