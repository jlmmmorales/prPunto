package prPunto;

public class Punto {
	private double x, y;
	private static int numPuntos = 0;

	public Punto() {
		x = y = 0;
		numPuntos++;
	}
	public Punto(double a, double b) { 
		x = a; 
		y = b;
		numPuntos++;
	}
	
	public static int numPuntos(){
		return numPuntos;
	}
	
	public Punto copiar(){
		Punto puntoResult = new Punto(this.x, this.y);
		return puntoResult;
	}

	public double getX() { return x; }
	public double getY() { return y; }
	public void setX(double a){ x = a; }
	public void setY(double b){ y = b; }
	public void trasladar(double a, double b) {    x += a; y += b;  }
	public double distancia(Punto pto) {
//		System.out.print("Punto receptor " + x); System.out.println(" " + y);
//		System.out.print("Punto this " + this.x);System.out.println(" " + this.y);
//		System.out.print("Punto pto " + pto.x);System.out.println(" " + pto.y);
		
		return Math.sqrt(Math.pow(x - pto.x, 2) +  Math.pow(y - pto.y, 2)); 
	}
	
	@Override
	public String toString(){
		return "(" + x + "," + y + ")";
	}
	
}
