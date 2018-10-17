package novipaackage;

public class Kalkulator {
	int broj1;
	int broj2;

	public Kalkulator(int broj1, int broj2) {
		this.broj1 = broj1;
		this.broj2 = broj2;
	}

	public int sabiranje(int broj1, int broj2) {
		return broj1 + broj2;
		
	}

	public int mnozenje(int broj1, int broj2) {
		return broj1 * broj2;
	}

	
	public int oduzimanje(int broj1, int broj2) {
		return broj1 - broj2;
	}
	
	public double KvadratnoKorjenovanje(int broj1, int broj2) {
		return Math.sqrt(broj1);
	}
	
	

}
