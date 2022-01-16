package ejercicios;

import java.util.ArrayList;

import clases.Estudio;
import clases.Pelicula;

public class Ejer2 {
	
	public Ejer2() {
		ArrayList<Pelicula> listaPeliculas = new ArrayList<Pelicula>();
		
		ArrayList<Estudio> listaEstudios = new ArrayList<Estudio>();
		
		Pelicula pelicula1 = new Pelicula("Titanic", 1998, 100.0, 60, "Romantica");
		
		Estudio universal = new Estudio("Universal", "San Francisco", "Palo alto", "www.universal.com", "8/5/1960", "United States of America", 6631521);
		
		Estudio fox = new Estudio("Fox", "Utah", "Hurricane", "www.fox.com", "2/5/1990", "United States of America", 6631521);
		
		Estudio another = new Estudio("Another", "San Francisco", "Pa", "www.another.com", "19/2/1990", "United States of America", 6631521);
		
		listaEstudios.add(another);
		
		listaEstudios.add(fox);
		
		listaEstudios.add(universal);
		
		pelicula1.setEstudios(universal);
		
		universal.setPeliculas(pelicula1);
		
		listaPeliculas.add(pelicula1);
		
		Pelicula pelicula2 = new Pelicula("Jurassic Park", 1993, 200.50, 50, "Ficcion");
		
		pelicula2.setEstudios(universal);
		
		pelicula2.setEstudios(fox);
		
		universal.setPeliculas(pelicula2);
		
		fox.setPeliculas(pelicula2);
		
		listaPeliculas.add(pelicula2);
		
		Pelicula pelicula3 = new Pelicula("Back to the future", 1992, 70.2, 120, "Ficcion");
		
		pelicula3.setEstudios(another);
		
		another.setPeliculas(pelicula3);
		
		listaPeliculas.add(pelicula3);
		
		Pelicula pelicula4 = new Pelicula("The walking dead", 2010, 130.67, 60, "Terror");
		
		pelicula4.setEstudios(fox);
		
		fox.setPeliculas(pelicula4);
		
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
			System.out.println("Estudio o estudios con la pelicula más larga: " + estudio.getNombre());
		}
		
		int mayorPeliculas = 0;
	
		Estudio estudioConMasPelis = null;
		
		for(Estudio estudio : listaEstudios) {
			if (mayorPeliculas < estudio.getPeliculas().size()) {
				mayorPeliculas = estudio.getPeliculas().size();
				estudioConMasPelis = estudio;
			}			
		}
		
		System.out.println("Con mayor peliculas: " + estudioConMasPelis.getNombre());
		
	}
	
}