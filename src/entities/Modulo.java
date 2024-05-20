package entities;

public class Modulo {
	private double baseSuperior;
	private double baseInferior;
	private double duasLaterais;
	
	public Modulo(double baseSuperior, double baseInferior, double duasLaterais){
		this.baseSuperior = baseSuperior;
		this.baseInferior = baseInferior;
		this.duasLaterais = duasLaterais;
	}
	public double getBaseSuperior() {
		return baseSuperior;
	}
	public void setBaseSuperior(double baseSuperior) {
		this.baseSuperior = baseSuperior;
	}
	public double getBaseInferior() {
		return baseInferior;
	}
	public void setBaseInferior(double baseInferior) {
		this.baseInferior = baseInferior;
	}
	public double getDuasLaterais() {
		return duasLaterais;
	}
	public void setDuasLaterais(double duasLaterais) {
		this.duasLaterais = duasLaterais;
	}
	public double inferiorCozinha() { //implementar lógica
		return 0;
	}

}
