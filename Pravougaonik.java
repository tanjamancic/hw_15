package domaci;

public class Pravougaonik {
	private double a;
	private double b;
	private String ime;
	
	public Pravougaonik (String ime, double a, double b) {
		this.ime = ime;
		this.a = a;
		this.b = b;
	}
	
	public Pravougaonik (String ime, double a) {
		this.ime = ime;
		this.a = a;
		b = a;
	}
	
	public double getA () {
		return a;
	}
	
	public double getB () {
		return b;
	}
	
	public String getIme () {
		return ime;
	}
	
	public double getObim () {
		double obim = 2 * ( a + b);
		return obim;
	}
	
	public double getPovrsina () {
		double povrsina = a * b;
		return povrsina;
	}
	
	public String ispisPravouganika () {
		return "Pravouganik: " + ime +
				"\nDuzina prve stranice: " + a +
				"\nDuzina druge stranice: " + b +
				"\nPovrsina pravougaonika: " + getPovrsina() +
				"\nObim pravouganika: " + getObim();
	}
}






