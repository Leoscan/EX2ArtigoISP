package main;

import classes.Cone;
import classes.Quadrado;
import classes.Trapezio;
import classes.Triangulo;

public class Main {

	public static void main(String[] args) throws Exception {
		Trapezio T = new Trapezio(8, 3, 5);
		System.out.println("Nome da figura: "+T.getNomeFigura());
		System.out.println("Área da figura: "+T.getAreaFigura());
		//System.out.println("Volume da figura: "+T.getVolumeFigura());
		
		Quadrado Q = new Quadrado(3);
		System.out.println("Nome da figura: "+Q.getNomeFigura());
		System.out.println("Área da figura: "+Q.getAreaFigura());
		//System.out.println("Volume da figura: "+Q.getVolumeFigura());

		Triangulo TAngulo = new Triangulo(10, 12);
		System.out.println("Nome da figura: "+TAngulo.getNomeFigura());
		System.out.println("Área da figura: "+TAngulo.getAreaFigura());
		//System.out.println("Volume da figura: "+TAngulo.getVolumeFigura());
		
		Cone C = new Cone(2, 5);
		System.out.println("Nome da figura: "+C.getNomeFigura());
		//System.out.println("Área da figura: "+C.getAreaFigura());
		System.out.println("Volume da figura: "+C.getVolumeFigura());
	}

}
