package entities;

public class Gaveteiro extends Modulo{ //Implementar lógica

	public Gaveteiro(double baseSuperior, double baseInferior, double duasLaterais) {
		super(baseSuperior, baseInferior, duasLaterais);
		
	}
	public double semPuxadorSemRodapé() {
		return 0;
	}
	public double comPuxadorSemRodapé() {
		return 0;
	}
	public double comPuxadorComRodapé() {
		return 0;
	}
	public double semPuxadorComRodapé() {
		return 0;
	}

}
