package entities;

public class Cliente {
	private String name;
	private Double orcamento;
	
	public Cliente(String name, Double orcamento) {
		this.name = name;
		this.orcamento = orcamento;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getOrcamento() {
		return orcamento;
	}
	public void setOrcamento(Double orcamento) {
		this.orcamento = orcamento;
	}
}
