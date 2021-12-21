package ejercicio2;

import static javax.swing.JOptionPane.*;

import java.util.*;

public class Ejer2 {
	public Ejer2() {
		//Añadir Alumnos
		
		boolean error = false;
		
		ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
		
		do { // Este do para saber cuantos alumnos añadir
		
			do { // Este do por si hay algún fallo
				try {
					showMessageDialog(null, "Escriba los datos necesarios para crear un Alumno.", "Crear Alumno", INFORMATION_MESSAGE);
					
					Alumno alumno = new Alumno(Integer.parseInt(getDatos("Escribe el codigo del alumno", "Codigo")), getDatos("Escribe el nombre del alumno", "Nombre"), getDatos("Escribe el domicilio del alumno", "Alumno"), Integer.parseInt(getDatos("Escribe el telefono del alumno", "Telefono")));
				
					alumnos.add(alumno);
					
					error = false;
				} catch(NumberFormatException e) {
					showMessageDialog(null, "Error, no se admiten los caracteres introducidos.", "Error", ERROR_MESSAGE);
					
					error = true;
				} catch(NullPointerException e) {
					if(showConfirmDialog(null, "Desea cerrar el programa ?", "Cerrar", YES_NO_OPTION, INFORMATION_MESSAGE) == 0) {
						System.exit(0);
					}
					
					error = true;
				} catch(Exception e) {
					showMessageDialog(null, e.getMessage(), "Error", ERROR_MESSAGE);
					
					error = true;
				}
			} while(error);
			
		} while(showConfirmDialog(null, "Desea añadir más alumnos ?", "Pregunta", YES_NO_OPTION, INFORMATION_MESSAGE) == 0);
	
		
		error = false;
		
		int codAlumn = 0;
		
		boolean siAlumno = false;
		
		do {
		
			do { 
				try {
					siAlumno = false;
					
					codAlumn = Integer.parseInt(getDatos("Escribe el codigo del usuario para buscarlo en la agenda", "Codigo"));
					
					for(Alumno alumno : alumnos) {
						if(alumno.getCod() == codAlumn) {
							showMessageDialog(null, "Alumno con codigo: " + alumno.getCod() + "\nNombre: " + alumno.getNombre() + "\nDomicilio: " + alumno.getDomicilio() + "\nTelefono: " + alumno.getTelefono() + "\n");
							siAlumno = true;
						}
					}
					
					if(!siAlumno) {
						throw new Exception("Emmmm, vaya, no he encontrado ningún alumno, busque otra vez.");
					}
					
					error = false;
				} catch(NumberFormatException e) {
					showMessageDialog(null, "Error, no se admiten los caracteres introducidos.", "Error", ERROR_MESSAGE);
					
					error = true;
				} catch(NullPointerException e) {
					if(showConfirmDialog(null, "Desea cerrar el programa ?", "Cerrar", YES_NO_OPTION, INFORMATION_MESSAGE) == 0) {
						System.exit(0);
					}
					
					error = true;
				} catch(Exception e) {
					showMessageDialog(null, e.getMessage(), "Error", ERROR_MESSAGE);
					
					error = true;
				}
			} while(error);
	
		} while(showConfirmDialog(null, "Desea buscar más alumnos ?", "Pregunta", YES_NO_OPTION, INFORMATION_MESSAGE) == 0);
	}
	
	private String getDatos(String texto, String titulo) {
		return showInputDialog(null, texto, titulo, INFORMATION_MESSAGE).trim();
	}
}

class Alumno {
	private int cod;
	
	private String nombre;
	
	private String domicilio;
	
	private int telefono;
	
	public Alumno(int cod, String nombre, String domicilio, int telefono) {
		this.cod = cod;
		
		this.nombre = nombre;
		
		this.domicilio = domicilio;
		
		this.telefono = telefono;
	}
	
	public int getCod() {
		return this.cod;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getDomicilio() {
		return this.domicilio;
	}
	
	public int getTelefono() {
		return this.telefono;
	}
}
