package classes;

import interfaces.FigurasGeometricasInterface;

public class Quadrado implements FigurasGeometricasInterface{
	private float lado;

	public Quadrado(float lado) {
		setLado(lado);
	}
	public Quadrado(){
		
	}

	public float getLado() {
		return lado;
	}

	public void setLado(float lado) {
		this.lado = lado;
	}

	public String getNomeFigura() {
		return "Quadrado";
	}

	public float getAreaFigura() {
		float area = 0;
        area = lado * lado;
		return area;
	}
	
	public float getVolumeFigura() throws Exception {
		 throw new Exception("Impossivel calcular o volume de um quadrado");
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Nome da Figura: ");
		builder.append(getNomeFigura());
		builder.append("\nÁrea da Figura:");
		builder.append(getAreaFigura());
		return builder.toString();
	}

}
