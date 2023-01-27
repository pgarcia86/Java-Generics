package s1_06_n2_ex2_pablogarciabarros;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona persona = new Persona("Pablo", "Garcia", 36);
		
		MetodosGenericos metodoGenerico = new MetodosGenericos();
		
		metodoGenerico.imprimirPantalla(persona.getDatosPersona());
		
	}

}
