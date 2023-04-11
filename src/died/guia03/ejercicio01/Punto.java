package died.guia03.ejercicio01;

public class Punto {

	private float x;
	private float y;
	
	public Punto(float x,float y) {
	this.x=x;
	this.y=y;
	}
	
	
	public float getX() {
		return x;
	}
	
	public float getY() {
		return y;
	}
	public void setX(float x) {
		this.x = x;
	}
	public void setY(float y) {
		this.y = y;
	}
	
	
	@Override
	public boolean equals(Object otroPunto) {
		if (this == otroPunto)
			return true;
		if (otroPunto == null)
			return false;
		if (getClass() != otroPunto.getClass())
			return false;
		Punto other = (Punto) otroPunto;	
		return Float.floatToIntBits(x) == Float.floatToIntBits(other.x)
				&& Float.floatToIntBits(y) == Float.floatToIntBits(other.y);
		//SERIA LO MISMO HACER ESTO?
		//return this.getX()==other.getX()
			//	&& this.getY()==other.getY();
	}
}
