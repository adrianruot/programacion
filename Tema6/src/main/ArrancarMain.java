package main;

import static javax.swing.JOptionPane.*;

import ejercicio1.Ejer1;
import ejercicio2.Ejer2;
import ejercicio3.Ejer3;

public class ArrancarMain {

	public static void main(String[] args) {
		String[] ejercicios = {"Ejercicio 1", "Ejercicio 2", "Ejercicio 3"};
		
		int resul = showOptionDialog(null, "Escoge el ejericicio que deseas hacer: ", "Escoge", DEFAULT_OPTION, INFORMATION_MESSAGE, null, ejercicios, ejercicios[0]);
	
		switch(resul) {
		case 0: {
			new Ejer1();
			break;
		}
		case 1: {
			new Ejer2();
			break;
		}
		case 2: {
			new Ejer3();
			break;
		}
		default: {
			showMessageDialog(null, "Cerrando programa.", "Cerrando", INFORMATION_MESSAGE);
		}
		}
	}

}
