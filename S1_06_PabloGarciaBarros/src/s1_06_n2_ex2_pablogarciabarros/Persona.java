package s1_06_n2_ex2_pablogarciabarros;

import java.util.ArrayList;

public class Persona<T> {

	private T nombre;
	private T apellido;
	private T edad;
	
	public Persona(T nombre, T apellido, T edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
	
	public ArrayList<T> getDatosPersona(){
		
		ArrayList<T> datosPersona = new ArrayList<T>();
		
		datosPersona.add(this.nombre);
		datosPersona.add(this.apellido);
		datosPersona.add(this.edad);
		
		return datosPersona;
	}
}
