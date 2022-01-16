package clases;

import java.util.*;

public class Estudio {

	private ArrayList<Pelicula> peliculas = new ArrayList<Pelicula>();
	
	private String nombre = null;
	
	private String ciudad = null;
	
	private String direccion = null;
	
	private String direccionWeb = null;
	
	private String fechaFundacion = null;
	
	private String pais = null;
	
	private int telefono = 0;
	
	public Estudio() {
		
	}

	public Estudio(String nombre, String ciudad, String direccion, String direccionWeb, String fechaFundacion,
			String pais, int telefono) {
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.direccion = direccion;
		this.direccionWeb = direccionWeb;
		this.fechaFundacion = fechaFundacion;
		this.pais = pais;
		this.telefono = telefono;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getDireccionWeb() {
		return direccionWeb;
	}

	public void setDireccionWeb(String direccionWeb) {
		this.direccionWeb = direccionWeb;
	}

	public String getFechaFundacion() {
		return fechaFundacion;
	}

	public void setFechaFundacion(String fechaFundacion) {
		this.fechaFundacion = fechaFundacion;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
	public void setPeliculas(Pelicula pelicula) {
		peliculas.add(pelicula);
	}
	
	public ArrayList<Pelicula> getPeliculas() {
		return this.peliculas;
	}
	
}
