package ejercicio1;

// Tema 5 Ejercicio 1

import java.util.*;

//import javax.swing.*;

import static javax.swing.JOptionPane.*;

public class Ejercicio1 {
	
	public Ejercicio1() {
		ArrayList<Double> datos = new ArrayList<Double>();
		
		boolean error = false;
		
		do { // Este do para lo que sirve es para indicar al usuario cuantas veces desea guardar datos en el ArrayList
			
			do { // Este otro do sirve para comprobar de que no existan errores en el programa
				
				try {
					
					datos.add(Double.parseDouble(showInputDialog(null, "Escribe un dato numerico.", "Escribe", INFORMATION_MESSAGE)));				
					
					error = false;
					
				} catch(NumberFormatException e) {
					
					error = true;
					
					showMessageDialog(null, "No se admiten caracteres en los datos o un dato vacio.", "Error", ERROR_MESSAGE);
					
				} catch(NullPointerException e) {
					
					if(showConfirmDialog(null, "Desea cerrar el programa ?", "Cerrar ?", INFORMATION_MESSAGE, YES_NO_OPTION) == 0) {
						System.exit(0);
					}	
					
					error = true;
					
				} catch(Exception e) {
					
					error = true;
					
					showMessageDialog(null, "A ocurrido un error con el siguiente mensaje: " + e.getMessage(), "Error", ERROR_MESSAGE);
					
				}
				
			} while(error);
			
			
		} while(showConfirmDialog(null, "Desea seguir ?", "Seguir ?", INFORMATION_MESSAGE, YES_NO_OPTION) == 0);
		
		int resul = -1;
		
		do {
			
		//System.out.println(System.getProperty("os.name"));
		
		if(System.getProperty("os.name").toLowerCase().contains("mac os")) {
			String[] cadena = {"10", "9", "8", "7", "6", "5", "4", "3", "2", "1"};
			
			resul = showOptionDialog(null, "1. Maximo y Minimo\n2. Solicitar y buscar numero\n3. Solicitar numero y borrarlo\n4. Convertir arraylist en array\n5. Mostrar numero de elementos\n6. Insertar nuevo elemento al final\n7. Insertar nuevo elemento en la posicion que desees\n8. Borrar elemento en una posicion\n9. Calcular suma y media aritmetica\n10. Finalizar", "Escoge", DEFAULT_OPTION, QUESTION_MESSAGE, null, cadena, cadena[9]);			
		
			resul = resul - 9;
			
			if(resul < 0) { // Comprueba el valor si es negativo y en caso en que sea negativo lo cambia a positivo.
				resul = -(resul);
			}
			
			/*
			 
			 Todo ese rollazo del string con lo de mac os es porque mac os ordena los botones de manera reversa y para que quede 
			 más bonito he añadido todo ese codigo que permite dejar los botones de la manera ordenada en la que quiero.
			 
			 */
		} else {
			String[] cadena = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
			
			resul = showOptionDialog(null, "1. Maximo y Minimo\n2. Solicitar y buscar numero\n3. Solicitar numero y borrarlo\n4. Convertir arraylist en array\n5. Mostrar numero de elementos\n6. Insertar nuevo elemento al final\n7. Insertar nuevo elemento en la posicion que desees\n8. Borrar elemento en una posicion\n9. Calcular suma y media aritmetica\n10. Finalizar", "Escoge", DEFAULT_OPTION, QUESTION_MESSAGE, null, cadena, cadena[0]);
		}
		
		//System.out.println(resul);
		
		switch(resul) {
		case 0: {
			maxYmin(datos);
			
			break;
		}
		case 1: {
			solicitarYbuscar(datos);
			
			break;
		}
		case 2: {
			solicitarYborrar(datos);
			
			break;
		}
		case 3: {
			convertListToArray(datos);
			
			break;
		}
		case 4: {
			mostrarDatos(datos);
		}
		}
		
		} while(resul != 9);
		
		System.exit(0);
		
	}
	
	private void maxYmin(ArrayList<Double> myArray) {
		if(myArray.isEmpty()) {
			showMessageDialog(null, "Los datos estan vacios, no se puede calcular.", "Error", ERROR_MESSAGE);
			return;
		}
		
		double min;
		
		double max;
		
		min = myArray.get(0);
		
		max = myArray.get(0);
		
		for(Double valor : myArray) {
			if(valor < min) {
				min = valor;
			}
		}
		
		for(Double valor : myArray) {
			if(valor > max) {
				max = valor;
			}
		}
		
		showMessageDialog(null, "El valor maximo es: " + max + " y el valor minimo es: " + min);
	}
	
	private void solicitarYbuscar(ArrayList<Double> myArray) {
		Iterator<Double> iterator = myArray.iterator();
		
		double valor = 0;
		
		boolean error = false;

		do { // Este otro do sirve para comprobar de que no existan errores en el programa
			
			try {
				
				valor = Double.parseDouble(showInputDialog(null, "Escribe un dato numerico.", "Escribe", INFORMATION_MESSAGE));				
				
				error = false;
				
			} catch(NumberFormatException e) {
				
				error = true;
				
				showMessageDialog(null, "No se admiten caracteres en los datos o un dato vacio.", "Error", ERROR_MESSAGE);
				
			} catch(NullPointerException e) {
				
				if(showConfirmDialog(null, "Desea cerrar el programa ?", "Cerrar ?", INFORMATION_MESSAGE, YES_NO_OPTION) == 0) {
					System.exit(0);
				}	
				
				error = true;
				
			} catch(Exception e) {
				
				error = true;
				
				showMessageDialog(null, "A ocurrido un error con el siguiente mensaje: " + e.getMessage(), "Error", ERROR_MESSAGE);
				
			}
			
		} while(error);
		
		while(iterator.hasNext()) {
			if(iterator.next().equals(valor)) {
				showMessageDialog(null, "Existe el valor: " + valor, "Existe", INFORMATION_MESSAGE);
				
				return;
			}
		}
		
		showMessageDialog(null, "No existe el valor: " + valor, "No existe", INFORMATION_MESSAGE);
		
	}
	
	private void solicitarYborrar(ArrayList<Double> myArray) {
		Iterator<Double> iterator = myArray.iterator();
		
		double valor = 0;
		
		boolean error = false;

		do { // Este otro do sirve para comprobar de que no existan errores en el programa
			
			try {
				
				valor = Double.parseDouble(showInputDialog(null, "Escribe un dato numerico.", "Escribe", INFORMATION_MESSAGE));				
				
				error = false;
				
			} catch(NumberFormatException e) {
				
				error = true;
				
				showMessageDialog(null, "No se admiten caracteres en los datos o un dato vacio.", "Error", ERROR_MESSAGE);
				
			} catch(NullPointerException e) {
				
				if(showConfirmDialog(null, "Desea cerrar el programa ?", "Cerrar ?", INFORMATION_MESSAGE, YES_NO_OPTION) == 0) {
					System.exit(0);
				}	
				
				error = true;
				
			} catch(Exception e) {
				
				error = true;
				
				showMessageDialog(null, "A ocurrido un error con el siguiente mensaje: " + e.getMessage(), "Error", ERROR_MESSAGE);
				
			}
			
		} while(error);
		
		while(iterator.hasNext()) {
			if(iterator.next().equals(valor)) {
				iterator.remove();
				
				showMessageDialog(null, "Valor: " + valor + " esta borrado.", "Borrado", INFORMATION_MESSAGE);
				
				showMessageDialog(null, "Resultado del array actual: ", "Actual Array", INFORMATION_MESSAGE);
				
				for(Double actual : myArray) {
					showMessageDialog(null, actual, "Un valor del array", INFORMATION_MESSAGE);
				}

				return;
			}
		}
		
		showMessageDialog(null, "No se a encontrado el valor que se desea eliminar", "Error", ERROR_MESSAGE);

	}
	
	private void convertListToArray(ArrayList<Double> myArray) {
		Double[] datosEnArray = new Double[myArray.size()];		
		
		myArray.toArray(datosEnArray);		
	}
	
	private void mostrarDatos(ArrayList<Double> myArray) {
		if(myArray.isEmpty()) {
			showMessageDialog(null, "Los datos estan vacios, no se puede calcular.", "Error", ERROR_MESSAGE);
			return;
		}
		
		for(Double actual : myArray) {
			showMessageDialog(null, actual, "Un valor del array", INFORMATION_MESSAGE);
		}
	}

}