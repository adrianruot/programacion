package main;

import static javax.swing.JOptionPane.*;

import ejercicios.*;

public class ArrancarMain {

	public static void main(String[] args) {
		String[] ejercicios = {"Ejercicio 1", "Ejercicio 2"};
		
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
		default: {
			showMessageDialog(null, "Cerrando programa.", "Cerrando", INFORMATION_MESSAGE);
		}
		}
	}

}
