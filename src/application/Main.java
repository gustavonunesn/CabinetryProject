package application;
import entities.Caixote.Modulo;
import entities.Caixote.ModuloCozinha.Batente;
import entities.Caixote.ModuloCozinha.Portas;
import entities.Caixote.ModuloCozinha.Prateleiras;

public class Main {

	public static void main(String[] args) {
		
		Modulo modulo = new Modulo(1000, 500, 500, 15, 6);
		Portas p = new Portas(modulo);
		Batente b = new Batente(modulo);
		Prateleiras p2 = new Prateleiras(modulo);
		System.out.println(modulo.imprimeMedidasBaseESuperior());
		System.out.println(b.imprimeMedidasBatente());
		System.out.println(p2.imprimeMedidasPrateleira());
		//System.out.println(p.imprimeMedidasUmaPortaComPuxador())
		System.out.println(p.imprimeMedidasDuasPortasComPuxador());
	
	}
}