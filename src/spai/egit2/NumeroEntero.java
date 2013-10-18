package spai.egit2;

public class NumeroEntero {
	private int valor;

	public NumeroEntero(int valor) {
		this.valor = valor;
	}

	public NumeroEntero() {
		this(0);
	}

	public int getValor() {
		return valor;
	}

	private void setValor(int valor) {
		this.valor = valor;
	}

	public void incrementar() {
		this.setValor(this.valor + 1);
	}

	public void doblar() {
		this.setValor(this.valor * 2);
	}

	public void decrementar() {
		this.valor--;
	}

	public boolean esPrimo(int numero) {

		if(numero==1) // el 1 no se considera primo
			return false;
		int aux;
		for (int cont = 2; cont < numero; cont++) {
			aux = numero % cont;
			if (aux == 0)
				return false;
		}
		return true;

	}
}
