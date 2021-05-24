package classes;

import interfaces.FigurasGeometricasInterface;

public class Triangulo implements FigurasGeometricasInterface {
	private float base;
	private float altura;
	
	public Triangulo(float base, float altura) {
		setBase(base);
		setAltura(altura);
	}
	public Triangulo() {
		
	}
	
	public float getBase() {
		return base;
	}
	public void setBase(float base) {
		this.base = base;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	
	public String getNomeFigura() {
		return "Triangulo";
	}
	
	public float getAreaFigura() {
		float area = base * altura / 2;
		return area;
	}
	
	public float getVolumeFigura() throws Exception {
		throw new Exception("Impossivel calcular o volume de um triangulo");
	}
	
	
	
	
}
