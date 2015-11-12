package ar.edu.uno.poo1.modelo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeerArchivo {

	public static void main(String[] args) {
		FileReader fileReader = null;
		BufferedReader bufferedReader = null;
		String linea = null;
		Poblacion poblacion = null;
		//Clave clave = null;
		try {
			fileReader = new FileReader("/home/apollo/workspace/Trabajo Practico 2/src/ar/edu/uno/poo1/resources/in/Lotedeprueba1.in");
			bufferedReader = new BufferedReader(fileReader);
			poblacion = new Poblacion(new Clave(linea = bufferedReader.readLine()));			
			while ((linea = bufferedReader.readLine()) != null) {
				poblacion.agregarCromosoma(new Cromosoma(linea));
			}
		} catch (IOException ioException) {
			ioException.printStackTrace();
		}
		try {
			if (bufferedReader != null)
				bufferedReader.close();
		} catch (IOException ioException) {
			ioException.printStackTrace();
		}
		//for (Cromosoma c : poblacion.getPoblacion())
		//	System.out.println(c);
		//System.out.println(poblacion.mutar());
		
		
		System.out.println(poblacion.toString());
		
		poblacion.Torneo();
		
		System.out.println(poblacion.toString());
		}
	}


