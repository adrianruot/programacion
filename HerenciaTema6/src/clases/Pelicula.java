package clases;

import java.util.*;

public class Pelicula {

	private ArrayList<Estudio> estudios = new ArrayList<Estudio>();
	
	private String titulo = null;
	
	private int anio = 0;
	
	private double duracion = 0.0;
	
	private int minutos = 0;
	
	private String tipo = null;
	
	public Pelicula() {
		
	}

	public Pelicula(String titulo, int anio, double duracion, int minutos, String tipo) {
		super();
		this.titulo = titulo;
		this.anio = anio;
		this.duracion = duracion;
		this.minutos = minutos;
		this.tipo = tipo;
	}
	
	public void setEstudios(Estudio estudio) {
		estudios.add(estudio);
	}
	
	public ArrayList<Estudio> getEstudios() {
		return this.estudios;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public double getDuracion() {
		return duracion;
	}

	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}

	public int getMinutos() {
		return minutos;
	}

	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	
}
