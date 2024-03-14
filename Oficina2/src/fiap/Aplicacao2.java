package fiap;
public class Aplicacao2 {
	
	public static void main(String[] args) {
		Carro cor = new Carro("Corolla", "Toyota", 2018, 2018, 10000);
		Carro gol = new Carro("Gol GTI", "Volkswagen", 2008, 2009, 180000);
		
		System.out.println(cor.getModelo() + " " + cor.getMontadora());
		System.out.println(gol.getModelo() + gol.getMontadora());
		
	}

}
