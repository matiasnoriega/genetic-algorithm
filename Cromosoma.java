package ar.edu.uno.poo1.modelo;

public class Cromosoma {
	private String representacionBinaria;
	private String representacionHexadecimal;
	private Integer fitness;

	public Cromosoma(String representacionHexadecimal){
		this.setRepresentacionHexadecimal(representacionHexadecimal);
		this.setRepresentacionBinaria(convertirHexadecimalABinario(representacionHexadecimal));
		this.setFitness(calcularFitness());

	}

	public Cromosoma(String representacionHexadecimal, Integer fitness){
		this.setRepresentacionHexadecimal(representacionHexadecimal);
		this.setRepresentacionBinaria(convertirHexadecimalABinario(representacionHexadecimal));
		this.setFitness(fitness);
	}

	private String convertirHexadecimalABinario(String representacionHexa){
		Long numerohexadecimal = Long.parseLong(representacionHexa, 16);
		String binario = Long.toBinaryString(numerohexadecimal);
		return binario;
	}

	private Integer calcularFitness(){
		Integer f;
		return f = ((this.getCoincidenciasHexadecimales() + 1) * (int) Math.pow(this.getCoincidenciasBinarias(), 2));	


	}


	public Integer getCoincidenciasHexadecimales(){
		Integer h=0;
		for(int i=0; i< this.getRepresentacionHexadecimal().length(); i++){
			if(this.getRepresentacionHexadecimal().charAt(i)==Poblacion.getClave().getCromosoma().getRepresentacionHexadecimal().charAt(i)){
				h++;
			}
		}
		return h;
	}

	public Integer getCoincidenciasBinarias(){
		Integer b=0;
		for(int i=0; i<this.getRepresentacionBinaria().length()-1; i++){
			if(this.getRepresentacionBinaria().charAt(i)==Poblacion.getClave().getCromosoma().getRepresentacionBinaria().charAt(i))
				b++;
			
		}
		return b;
	}

	public void mutar(){

	}

	public String toString(){
		return this.representacionBinaria+" Fitness: "+this.getFitness();
	}
	//Getters y Setters
	public String getRepresentacionBinaria() {
		return representacionBinaria;
	}
	public void setRepresentacionBinaria(String representacionBinaria) {
		this.representacionBinaria = representacionBinaria;
	}
	public String getRepresentacionHexadecimal() {
		return representacionHexadecimal;
	}
	public void setRepresentacionHexadecimal(String representacionHexadecimal) {
		this.representacionHexadecimal = representacionHexadecimal;
	}
	public Integer getFitness() {
		return fitness;
	}
	public void setFitness(Integer fitness) {
		this.fitness = fitness;
	}


}
