package s1_06_n1_ex1_pablogarciabarros;

public class ClaseNoGenerica {
	
	private Object objeto1;
	private Object objeto2;
	private Object objeto3;
	
	public ClaseNoGenerica(Object objeto1, Object objeto2, Object objeto3) {
		this.objeto1 = objeto1;
		this.objeto2 = objeto2;
		this.objeto3 = objeto3;		
	}
	
	public Object getObjeto1() {
		return this.objeto1;
	}
	public Object getObjeto2() {
		return this.objeto2;
	}
	public Object getObjeto3() {
		return this.objeto3;
	}
	
	public void setObjeto1(Object objeto) {
		this.objeto1 = objeto;
	}
	public void setObjeto2(Object objeto) {
		this.objeto2 = objeto;
	}
	public void setObjeto3(Object objeto) {
		this.objeto3 = objeto;
	}
	

}
