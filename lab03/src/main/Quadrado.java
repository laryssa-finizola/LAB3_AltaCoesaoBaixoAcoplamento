package main;

public class Quadrado implements Forma {
    private double lado;
    private String nome;

    public Quadrado(double lado) {
    	if(lado <= 0) {
    		throw new IllegalArgumentException("O valor do lado do quadrado não pode ser negativo ou igual a 0!!"); // tratamento de erro
    	}
    	
    	this.lado=lado;
        this.setNome("Quadrado");
    }
    
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public double calcularPerimetro() {
        return 4 * lado;
    }
    
    @Override
    public String toString() {
        return String.format("Figura geométrica: %s \n [lado = %.2f; área = %.2f; perímetro = %.2f]\n", nome, lado, calcularArea(), calcularPerimetro());
    }

}