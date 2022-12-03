package bingo;

import java.io.IOException;

public class Bingo75 extends Bingo {

	public Bingo75() {
		super(75);
		
	}

	@Override
	protected void jugar() {
		getTablero().inicializar();
	
		for (int i = 1; i <= 75; i++) {
			System.out.println("Pulse enter para sacar bola..");
			Bola bola = new Bola();
			try {
				System.in.read();
				bola = sacarBola();
			} catch (IOException e) {
				e.printStackTrace();
			}
			getTablero().imprimirTablero(bola);
		}

	}
	
}


