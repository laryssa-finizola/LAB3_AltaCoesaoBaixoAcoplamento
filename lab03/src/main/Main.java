package main;

public class Main {
	public static void main(String[] args) {

		FigurasGeometricas figuras = new FigurasGeometricas();
		
		//tratamento de erros
		try {
			figuras.adicionarForma(new Circulo(2.5));
			figuras.adicionarForma(new Retangulo(5, 8));
			figuras.adicionarForma(new Quadrado(5));
			
			figuras.adicionarForma(new Circulo(-4)); // exemplo pro tratamento de erro

			
		} catch(IllegalArgumentException e){
			System.err.println("Erro:" +e.getMessage()+"\n");
			
		}
	
		System.out.println(figuras.toString());
	}
}

