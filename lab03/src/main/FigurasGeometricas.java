package main;

public class FigurasGeometricas {
	private Quadrado quadrado;
	private Circulo circulo;
	private Retangulo retangulo;
	
	public FigurasGeometricas(int alturaRetangulo, int larguraRetangulo, int ladoQuadrado, int raio){
		this.quadrado = new Quadrado(ladoQuadrado);
		this.circulo = new Circulo(raio);
		this.retangulo = new Retangulo(larguraRetangulo, alturaRetangulo);
	}
	
	public Quadrado getQuadrado() {
		return quadrado;
	}

	public void setQuadrado(Quadrado quadrado) {
		this.quadrado = quadrado;
	}

	public Circulo getCirculo() {
		return circulo;
	}

	public void setCirculo(Circulo circulo) {
		this.circulo = circulo;
	}

	public Retangulo getRetangulo() {
		return retangulo;
	}

	public void setRetangulo(Retangulo retangulo) {
		this.retangulo = retangulo;
	}

}
