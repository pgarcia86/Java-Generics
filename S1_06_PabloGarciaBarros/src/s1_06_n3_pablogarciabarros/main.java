package s1_06_n3_pablogarciabarros;

public class main {

	public static <T> void main(String[] args) {
		// TODO Auto-generated method stub
		
		Generica<Smartphone> telefono = new Generica<Smartphone>();
		telefono.metodoGenerico(new Smartphone());
		telefono.metodoGenerico2(new Smartphone());
		
		//Generica<Smartphone> telefono2 = new Generica<Smartphone>(new Telefono());
		//telefono2.metodoGenerico2();
	}

}
