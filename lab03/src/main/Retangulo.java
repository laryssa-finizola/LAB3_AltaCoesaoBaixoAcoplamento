package main;

public class Retangulo implements Forma {
	
    private double largura;
    private double altura;
    private String nome;
    
    public Retangulo(double largura, double altura) {
    	
    	// tratamento de erro p medidas <= 0
    	if(largura <= 0 || altura <= 0) {
    		throw new IllegalArgumentException("A largura e altura do retangulo nao podem ser menores ou iguais a 0!!");
    	}
    	
    	//tratamento de erro p medidas iguais
    	if(largura == altura) {
    		throw new IllegalArgumentException("A figura geométrica deve ser um quadrado!! Retangulo nao possui lados iguais.");
    	}
    	
        this.largura = largura;
        this.altura = altura;
        this.setNome("Retangulo");
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

    @Override
    public double calcularArea() {
        return largura * altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (largura + altura);
    }
    
    @Override
    public String toString() {
        return String.format("Figura geométrica: %s \n [largura = %.2f; altura = %.2f; área = %.2f; perímetro = %.2f] \n", nome, largura, altura, calcularArea(), calcularPerimetro());
    }

    
}