import prPunto.Punto;

public class mainPunto {
	public static void main(String[] args){
		
		//Completar el programa
		Punto punto = new Punto(0.0,3.0);
		Punto puntoCopia = punto.copiar();
		System.out.println("Número de puntos creados: "+Punto.numPuntos());
	}
}
