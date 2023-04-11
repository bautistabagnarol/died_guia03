package died.guia03.ejercicio01;

public class Recta {
	public Punto p1;
	public Punto p2;

	public Recta(Punto p1, Punto p2) {
		this.p1 = p1;
		this.p2 = p2;
	}

	public Recta() {
		this.p1 = new Punto(0, 0);
		this.p2 = new Punto(1, 1);
	}

	public float pendiente() {
		return ((this.p2.getY() - this.p1.getY()) / (this.p2.getX() - this.p1.getX()));
	}

	public boolean paralelas(Recta otraRecta) {
		return this.pendiente() == otraRecta.pendiente();
	}

	public boolean equals(Object otraRecta) {
		if (this == otraRecta)
			return true;
		if (otraRecta == null)
			return false;
		if (getClass() != otraRecta.getClass())
			return false;
		Recta other = (Recta) otraRecta;
		if (other.p1 == this.p1 && other.p2 == this.p2)
			return true;
		Punto aux1 = this.p1;
		Punto aux2 = other.p2;
		Recta aux = new Recta(aux1, aux2);
		return this.pendiente() == aux.pendiente() && other.pendiente() == aux.pendiente();
	}

}
