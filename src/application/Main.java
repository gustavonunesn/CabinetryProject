package application;
import entities.Caixote;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Caixote c = new Caixote(1000.00,1000.00,500.00,15, 6);
		
		System.out.println(c.baseCaixote());
		
		c.setLarguraBase(5);
		
		System.out.println(c.baseCaixote());

		System.out.println(c.lateralCaixote());

		sc.close(); //teste do pull

	}

}
