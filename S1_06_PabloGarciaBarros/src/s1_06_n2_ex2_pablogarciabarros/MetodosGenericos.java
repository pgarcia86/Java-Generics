package s1_06_n2_ex2_pablogarciabarros;

import java.util.ArrayList;

public class MetodosGenericos <T>{
	
	public MetodosGenericos() {
		
	}
	
	public void imprimirPantalla(ArrayList<T> datosPersona) {
		System.out.println(datosPersona.get(0) + " " + datosPersona.get(1) + " " + datosPersona.get(2));
	}

}
