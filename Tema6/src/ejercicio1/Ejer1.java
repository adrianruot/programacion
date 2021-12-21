package ejercicio1;

import static javax.swing.JOptionPane.*;

public class Ejer1 {
	public Ejer1() {
		String[] calculos = {"Longitud", "Area", "Volumen"};
		
		boolean seguir = true;
		
		do {
			int resul = showOptionDialog(null, "Escoge el calculo de circunferencia que deseas hacer: ", "Escoge", DEFAULT_OPTION, INFORMATION_MESSAGE, null, calculos, calculos[0]);
			
			switch(resul) {
			
			case 0: {
				showMessageDialog(null, "Longitud de la Circunferencia: " + longCircun(), "Longitud", INFORMATION_MESSAGE);
				break;
			}
			
			case 1: {
				showMessageDialog(null, "Area de la Circunferencia: " + areaCircun(), "Area", INFORMATION_MESSAGE);
				break;
			}
			
			case 2: {
				showMessageDialog(null, "Volumen de la esfera: " + volumenEsfera(), "Volumen", INFORMATION_MESSAGE);
				break;
			}
			
			default:{
				seguir = false;
				break;
			}
			
			}
		} while(seguir);
	}
	
	private double longCircun() {
		boolean seguir = false;
		double radio1 = 0;
		do {
			try {
				radio1 = Double.parseDouble(showInputDialog(null, "Escribe el radio de la circunferencia", "Radio", INFORMATION_MESSAGE));
				seguir = false;
			} catch(NumberFormatException e) {
				showMessageDialog(null, "Error, no se admiten los caracteres introducidos.", "Error", ERROR_MESSAGE);
				seguir = true;
			} catch(NullPointerException e) {
				
				if(showConfirmDialog(null, "Desea cerrar el programa ?", "Cerrar", YES_NO_OPTION, INFORMATION_MESSAGE) == 0) {
					System.exit(0);
				}
				
				
				//showMessageDialog(null, "Error, no se admiten valores vacios.", "Error", ERROR_MESSAGE);
				
				seguir = true;
			}
		} while(seguir);
		
		return 2 * Math.PI * radio1;
	}
	
	private double areaCircun() {
		boolean seguir = false;
		double radio1 = 0;
		do {
			try {
				radio1 = Double.parseDouble(showInputDialog(null, "Escribe el radio de la circunferencia", "Radio", INFORMATION_MESSAGE));
				seguir = false;
			} catch(NumberFormatException e) {
				showMessageDialog(null, "Error, no se admiten los caracteres introducidos.", "Error", ERROR_MESSAGE);
				seguir = true;
			} catch(NullPointerException e) {
				
				if(showConfirmDialog(null, "Desea cerrar el programa ?", "Cerrar", YES_NO_OPTION, INFORMATION_MESSAGE) == 0) {
					System.exit(0);
				}
				
				
				//showMessageDialog(null, "Error, no se admiten valores vacios.", "Error", ERROR_MESSAGE);
				
				seguir = true;
			}
		} while(seguir);
		
		return Math.PI * radio1 * radio1;
	}
	
	private double volumenEsfera() {
		boolean seguir = false;
		double radio1 = 0;
		do {
			try {
				radio1 = Double.parseDouble(showInputDialog(null, "Escribe el radio de la esfera", "Radio", INFORMATION_MESSAGE));
				seguir = false;
			} catch(NumberFormatException e) {
				showMessageDialog(null, "Error, no se admiten los caracteres introducidos.", "Error", ERROR_MESSAGE);
				seguir = true;
			} catch(NullPointerException e) {
				
				if(showConfirmDialog(null, "Desea cerrar el programa ?", "Cerrar", YES_NO_OPTION, INFORMATION_MESSAGE) == 0) {
					System.exit(0);
				}
				
				
				//showMessageDialog(null, "Error, no se admiten valores vacios.", "Error", ERROR_MESSAGE);
				
				seguir = true;
			}
		} while(seguir);
		
		return 4 * Math.PI * radio1 * radio1 * radio1 / 3;
	}
}
