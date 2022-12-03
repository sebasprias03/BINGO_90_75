package bingo;

public class Bola {

	private int position;
	private String valor;
	private boolean activo;

	public Bola() {
		this.activo = false;
	}

	public Bola(int position, String valor, boolean activo) {
		super();
		this.position = position;
		this.valor = valor;
		this.activo = activo;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	@Override
	public String toString() {
		// String retorno = "Bola [Valor: " + valor + ", Activo: " + activo + "]";
		return valor;

	}

}
