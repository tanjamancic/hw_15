package domaci;

public class Main {

	public static void main(String[] args) {
		Pravougaonik p = new Pravougaonik("pravougaonik", 2, 3);
		Pravougaonik k = new Pravougaonik("kvadrat", 2);
		
		System.out.println(p.getA());
		System.out.println(p.getB());
		System.out.println();
		System.out.println(k.getA());
		System.out.println(k.getB());
		System.out.println();
		System.out.println(p.ispisPravouganika());
		System.out.println();
		System.out.println(k.ispisPravouganika());
		
	}

}
