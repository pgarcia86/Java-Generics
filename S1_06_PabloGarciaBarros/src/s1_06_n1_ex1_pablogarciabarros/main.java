package s1_06_n1_ex1_pablogarciabarros;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClaseNoGenerica claseNoGenerica = new ClaseNoGenerica("Perro", 2.5, 44);
		ClaseNoGenerica claseNoGenerica2 = new ClaseNoGenerica(7.25, "Gato", "Animal");
		
		System.out.println("Clase 1 - Objeto 1: " + claseNoGenerica.getObjeto1());
		System.out.println("Clase 1 - Objeto 2: " + claseNoGenerica.getObjeto2());
		System.out.println("Clase 1 - Objeto 3: " + claseNoGenerica.getObjeto3());
		System.out.println("\nClase 2 - Objeto 1: " + claseNoGenerica2.getObjeto1());
		System.out.println("Clase 2 - Objeto 2: " + claseNoGenerica2.getObjeto2());
		System.out.println("Clase 2 - Objeto 3: " + claseNoGenerica2.getObjeto3());

		claseNoGenerica.setObjeto1(5.67);
		claseNoGenerica2.setObjeto2(65);
		System.out.println("\nClase 1 - Objeto 1: " + claseNoGenerica.getObjeto1());
		System.out.println("\nClase 2 - Objeto 2: " + claseNoGenerica2.getObjeto2());
		
	}

}
