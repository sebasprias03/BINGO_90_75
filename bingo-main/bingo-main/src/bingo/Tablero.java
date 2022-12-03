package bingo;

import java.util.Scanner;
import java.util.ArrayList;

public class Tablero {

	private ArrayList<Bola> tablero;
	int x;
	boolean band = true;
	public Tablero() {
		this.tablero = new ArrayList<Bola>();
	}

	
	public void inicializar() {
		Scanner sc = new Scanner(System.in);
		System.out.print(":::....Ingrese La opcion del bingo que desee...::: \n 1: Bingo de 75 \n 2: Bingo de 90 \n Ingrese la opcion que eligio: ");
		x = sc.nextInt();
		
		System.out.println("Inicializando bingo de " + x + "PELOTAS");
		int valorBola = 1;
		

		if (x == 2) {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 10; j++) {
				tablero.add(new Bola(valorBola - 1, valorBola + "", false));
				System.out.print(getBola(valorBola - 1) + "\t");
				valorBola++;
				}	
				System.out.println("\n");
			}
		} 
		else if (x == 1){
			for (int i = 0; i < 15; i++) {
				for (int j = 0; j < 5; j++) {
					tablero.add(new Bola(valorBola - 1, valorBola + "", false));
					System.out.print(getBola(valorBola - 1) + "\t");
					valorBola++;
					}	
				System.out.println("\n");
				}
			} 
		else {
			System.out.println("Opcion Incorrecta, intente de nuevo ");
		}
}		

	
	
	public void imprimirTablero(Bola bola) {
		
		bola.setValor("[" + bola.getValor() + "]");
		tablero.set(bola.getPosition(), bola);
		int valorBola = 1;
		
		
		if(x == 2) {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(getBola(valorBola - 1) + "\t");
				valorBola++;
			}
			System.out.println("\n");
		}
		System.out.println("Último numero sorteada: " + bola);
	}
		else if(x == 1) {
			for (int i = 0; i < 15; i++) {
				for (int j = 0; j < 5; j++) {
					System.out.print(getBola(valorBola - 1) + "\t");
					valorBola++;
				}
				System.out.println("\n");
			}
			System.out.println("Último numero sorteada: " + bola);
		}
		}
	


	public Bola getBola(int position) {
		return tablero.get(position);
	}

	public ArrayList<Bola> getTablero() {
		return tablero;
	}

	public void setTablero(ArrayList<Bola> tablero) {
		this.tablero = tablero;
	}

	
	
}
