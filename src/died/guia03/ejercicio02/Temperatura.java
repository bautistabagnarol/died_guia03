package died.guia03.ejercicio02;

public class Temperatura {

	private Double grados;
	private Escala escala;

	public Temperatura() {
		this.grados = 0.0;
		this.escala = Escala.CELCIUS;
	}

	public Temperatura(Double unGrado, Escala unaEscala) {
		this.grados = unGrado;
		this.escala = unaEscala;
	}

	@Override
	public String toString() {
		if (this.escala == Escala.CELCIUS)
			return "" + this.grados + "C";
		return "" + this.grados + "F";
	}

	public Double asCelcius() {
		if (this.escala == Escala.CELCIUS)
			return this.grados;
		return ((this.grados - 32) * 5 / 9);
	}

	public Double asFahrenheit() {
		if (this.escala == Escala.FAHRENHEIT)
			return this.grados;
		return (this.grados * 9 / 5 + 32);
	}

	public void aumentar(Temperatura temperatura) {
		if (temperatura.grados == 0.0)return;
		if (temperatura.escala == this.escala) {
			this.grados += temperatura.grados;
		return;
		}
		Double temp = (temperatura.escala == Escala.CELCIUS) ? (temperatura.grados * 9 / 5) + 32
				: (temperatura.grados - 32) * 5 / 9;
		this.grados += temp;
	}
	
	public void disminuir(Temperatura temperatura) {
		Temperatura aux = new Temperatura(-temperatura.grados,temperatura.escala);
		aumentar(aux);
	}
	
}
