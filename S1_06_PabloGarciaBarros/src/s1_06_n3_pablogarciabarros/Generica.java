package s1_06_n3_pablogarciabarros;

public class Generica <T extends Smartphone>{
	
	public Generica() {
		
	}
	
	public void metodoGenerico(T Telefono) {
		//System.out.println(Telefono.hacerFoto);
		System.out.println(Telefono.llamar());
	}

	public void metodoGenerico2(T Smartphone) {
		System.out.println(Smartphone.hacerFoto());
		System.out.println(Smartphone.llamar());
	}
	
}

