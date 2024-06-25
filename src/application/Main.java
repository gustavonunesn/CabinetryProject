package application;
import entities.Caixote.Modulo;
import entities.Caixote.ModuloCozinha.Portas;

public class Main {

	public static void main(String[] args) {
		
		Modulo modulo = new Modulo(1000.0, 500.0, 500.0, 15.0, 6.0);
		Portas p = new Portas(modulo);
		System.out.println(p.imprimeMedidasUmaPorta());
	}
}