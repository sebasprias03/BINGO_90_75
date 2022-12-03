package bingo;

import java.io.IOException;

public class Bingo90 extends Bingo {

	public Bingo90() {
		super(90);
	}

	@Override
	protected void jugar() {
		getTablero().inicializar();
		
		for (int i = 1; i <= 90; i++) {
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
