package main;

public class Circulo implements Forma {
	
	private double raio;
	private String nome;
	
	public Circulo(double raio) {
		
		if(raio<= 0) {
			throw new IllegalArgumentException("O raio do círculo nao pode ser negativo ou 0!!"); // tratamento de erro, o raio n pode ser <= 0
		}
		
		this.raio=raio;
        this.nome = "Circulo";
        }

    public double getRaio() {
        return raio;
    }
    
    public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
    
    @Override
    public double calcularArea() {
        return Math.PI * raio * raio; // pi * 2raio
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * raio; //2*pi*raio
    }
    
    @Override
    public String toString() { // saida com 2 casas decimais
        return String.format("Figura geométrica: %s \n [raio = %.2f; área = %.2f; perímetro = %.2f] \n", nome, raio, calcularArea(), calcularPerimetro());
    }

    
}
