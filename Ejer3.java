package ejercicio3;

import static javax.swing.JOptionPane.*;

import java.util.ArrayList;
import java.util.Calendar;

public class Ejer3 {
	
	private final int ANIO_ACTUAL = Calendar.getInstance().get(Calendar.YEAR);

	public static void main(String[] args) {
		new Ejer3();
	}
	
	public Ejer3() {
		
		ArrayList<Persona> personas = new ArrayList<Persona>();
		
		boolean seguir = false;
		
		do {
			
			try {
				showMessageDialog(null, "Vamos a configurar una persona", "Configurar", INFORMATION_MESSAGE);
				
				String nombre = showInputDialog(null, "Escribe el nombre de la persona: ", "Nombre de la persona", INFORMATION_MESSAGE);
				
				int diaNac = Integer.parseInt(showInputDialog(null, "Escribe el dia de nacimiento de la persona: ", "Dia de nacimiento de la persona", INFORMATION_MESSAGE));
				
				int mesNac = Integer.parseInt(showInputDialog(null, "Escribe el mes de nacimiento de la persona: ", "Mes de nacimiento de la persona", INFORMATION_MESSAGE));
				
				int anioNac = Integer.parseInt(showInputDialog(null, "Escribe el año de nacimiento de la persona: ", "Año de nacimiento de la persona", INFORMATION_MESSAGE));
				
				String direccion = showInputDialog(null, "Escribe la direccion de la persona: ", "Direccion de la persona", INFORMATION_MESSAGE);

				int codPostal = Integer.parseInt(showInputDialog(null, "Escribe el codigo postal de la persona: ", "Codigo postal de la persona", INFORMATION_MESSAGE));
				
				String ciudad = showInputDialog(null, "Escribe la ciudad de la persona: ", "Ciudad de la persona", INFORMATION_MESSAGE);
				
				Persona persona = new Persona(nombre, diaNac, mesNac, anioNac, direccion, codPostal, ciudad);
				
				personas.add(persona);
				
				seguir = false;
			} catch(NullPointerException e) {
				showMessageDialog(null, "No ha escrito ningún valor.", "Error", ERROR_MESSAGE);
				seguir = true;
			} catch(NumberFormatException e) {
				showMessageDialog(null, "Error a la hora de introducir los datos.", "Error", ERROR_MESSAGE);
				seguir = true;
			} catch(Exception e) {
				showMessageDialog(null, e.getMessage(), "Error", ERROR_MESSAGE);
				seguir = true;
			}
			
		} while(seguir || showConfirmDialog(null, "Desea continuar ?", "Continuar ?", YES_NO_OPTION, INFORMATION_MESSAGE) == 0);
		
		int max = ANIO_ACTUAL;
		
		for(Persona persona : personas) {
			if (persona.getAnioNac() < max) {
				max = persona.getAnioNac();
			}
		}
		
		for(Persona persona : personas) {
			if(persona.getAnioNac() == max) {
				showMessageDialog(null, "La persona mas mayor es " + persona.getNombre() + " del año " + persona.getAnioNac(), "Mayor de edad nombre", INFORMATION_MESSAGE);
			}
		}
		
		for(Persona persona : personas) {
			if(persona.getCiudad().equalsIgnoreCase("elche")) {
				showMessageDialog(null, "La persona " + persona.getNombre() + " vive en " + persona.getCiudad(), "Ciudad de la persona", INFORMATION_MESSAGE);
			}
		}
		
		int cont = 0;
		
		for(Persona persona : personas) {
			if ((ANIO_ACTUAL - persona.getAnioNac()) >= 18) {
				cont++;
			}
		}
		
		showMessageDialog(null, "El total de personas mayores de edad son: " + cont, "Total de mayores de edad", INFORMATION_MESSAGE);
	}
	
}

class Persona {
	
	private String nombre;
	
	private int diaNac;
	
	private int mesNac;
	
	private int anioNac;
	
	private String direccion;
	
	private int codPostal;
	
	private String ciudad;
	
	public Persona() {
		
	}
	
	public Persona(String nombre, int diaNac, int mesNac, int anioNac, String direccion, int codPostal, String ciudad) {
		this.nombre = nombre;
		
		this.diaNac = diaNac;
		
		this.mesNac = mesNac;
		
		this.anioNac = anioNac;
		
		this.direccion = direccion;
		
		this.codPostal = codPostal;
		
		this.ciudad = ciudad;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public int getDiaNac() {
		return this.diaNac;
	}
	
	public int getMesNac() {
		return this.mesNac;
	}
	
	public int getAnioNac() {
		return this.anioNac;
	}
	
	public String getDireccion() {
		return this.direccion;
	}
	
	public int getCodPostal() {
		return this.codPostal;
	}
	
	public String getCiudad() {
		return this.ciudad;
	}
	
}