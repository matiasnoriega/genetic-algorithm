package ar.edu.uno.poo1.modelo;

public class Clave {
	
	private Cromosoma cromosoma;
	
	public Clave(String representacionHexadecimal){
		this.setCromosoma(new Cromosoma(representacionHexadecimal, 0));
	}
	
	//Getters y Setters
	public Cromosoma getCromosoma() {
		return cromosoma;
	}
	public void setCromosoma(Cromosoma cromosoma) {
		this.cromosoma = cromosoma;
	}
	
	
}
