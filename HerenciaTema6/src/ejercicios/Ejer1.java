package ejercicios;

import java.util.*;

import clases.*;

public class Ejer1 {

	public Ejer1() {
		ArrayList<Pelicula> listaPeliculas = new ArrayList<Pelicula>();
		
		Pelicula pelicula1 = new Pelicula("Titanic", 1998, 100.0, 60, "Romantica");
		
		pelicula1.setEstudios(new Estudio("Universal", "San Francisco", "Palo alto", "www.universal.com", "8/5/1960", "United States of America", 6631521));
		
		listaPeliculas.add(pelicula1);
		
		Pelicula pelicula2 = new Pelicula("Jurassic Park", 1993, 200.50, 50, "Ficcion");
		
		pelicula2.setEstudios(new Estudio("Universal", "San Francisco", "Palo alto", "www.universal.com", "20/8/1970", "United States of America", 6631521));
		
		pelicula2.setEstudios(new Estudio("Fox", "Utah", "Hurricane", "www.fox.com", "2/5/1990", "United States of America", 6631521));
		
		listaPeliculas.add(pelicula2);
		
		Pelicula pelicula3 = new Pelicula("Back to the future", 1992, 70.2, 120, "Ficcion");
		
		pelicula3.setEstudios(new Estudio("Another", "San Francisco", "Pa", "www.another.com", "19/2/1990", "United States of America", 6631521));
		
		listaPeliculas.add(pelicula3);
		
		Pelicula pelicula4 = new Pelicula("The walking dead", 2010, 130.67, 60, "Terror");
		
		pelicula4.setEstudios(new Estudio("Fox", "Utah", "Hurricane", "www.fox.com", "2/5/1990", "United States of America", 6631521));
		
		listaPeliculas.add(pelicula4);
		
		double i = 0;
		
		Pelicula peliculaFinal = null;
		
		for(Pelicula pelicula : listaPeliculas) {
			
			if(pelicula.getDuracion() > i) {
				peliculaFinal = pelicula;
				i = pelicula.getDuracion();
			}
			
		}
		
		ArrayList<Estudio> estudios = peliculaFinal.getEstudios();
		
		for(Estudio estudio : estudios) {
			System.out.println(estudio.getNombre());
		}
		
		
	}
	
}
