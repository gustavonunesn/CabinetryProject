package application;

import java.util.Scanner;

import entities.Caixote;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Caixote c = new Caixote(10.0,10.0,5.0,5,5);
		
		System.out.println(c.baseCaixote());
		
		c.setLarguraBase(5);
		
		System.out.println(c.baseCaixote());

	}

}
