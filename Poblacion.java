package ar.edu.uno.poo1.modelo;

import java.util.ArrayList;

public class Poblacion {

	private static Clave clave;
	private ArrayList<Cromosoma> poblacion = new ArrayList<Cromosoma>();

	public Poblacion(Clave clave){
		this.setClave(clave);
	}


	public void agregarCromosoma(Cromosoma cromosoma){
		this.poblacion.add(cromosoma);
	}

	public void Torneo(){
		ArrayList<Cromosoma> poblacionauxiliar = new ArrayList<Cromosoma>();
		Cromosoma cromosomaaux1;
		Cromosoma cromosomaaux2;
		for(int i=0; i<poblacion.size();i++){
			cromosomaaux1 = this.poblacion.get((int) (Math.round((Math.random()*poblacion.size()))));
			cromosomaaux2 = this.poblacion.get((int) (Math.round((Math.random()*poblacion.size()))));
			
			if(cromosomaaux1.getFitness()>cromosomaaux2.getFitness())
				poblacionauxiliar.add(cromosomaaux1);
			else
				poblacionauxiliar.add(cromosomaaux2);
				
		}
		this.poblacion = poblacionauxiliar;
		
	}
	
	public String toString(){
		String lista = "";
		for(int i=0; i < poblacion.size(); i++){
			 lista += poblacion.get(i).toString()+"\n";
		}
		return lista;
	}
	//Getters y Setters

	public static Clave getClave() {
		return clave;
	}

	public void setClave(Clave clave) {
		Poblacion.clave = clave;
	}

	public ArrayList<Cromosoma> getPoblacion() {
		return poblacion;
	}

	public void setPoblacion(ArrayList<Cromosoma> cromosomas) {
		this.poblacion = cromosomas;
	}


}
