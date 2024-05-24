package entities;

public class Caixote {
	private Double altura;
	private Double largura;
	private Double profundidadeModulo;
	private Integer espessura;
	private Integer espessuraFundo;
	private Integer larguraBase;
	private Integer larguraPorta;
	
	public Caixote(Double altura, Double largura, Double profundidadeModulo, Integer espessura, Integer espessuraFundo) {
		this.altura = altura;
		this.largura = largura;
		this.profundidadeModulo = profundidadeModulo;
		this.espessura = espessura;
		this.espessuraFundo = espessuraFundo;
		this.larguraBase = 30;
		this.larguraPorta = 10;
	}
	
	public void setLarguraBase(Integer larguraBase) {
		this.larguraBase = larguraBase;
	}
	public void setLarguraPorta(Integer larguraPorta) {
		this.larguraPorta = larguraPorta;
	}
	public String baseCaixote() {
		StringBuilder sb = new StringBuilder();
		sb.append("2x {" + (largura - larguraBase) + "} " + "{" + profundidadeModulo + "} " + "{" + espessura + "}" );
		return sb.toString();
	}
	public String lateralCaixote() {
		StringBuilder sb = new StringBuilder();
		sb.append("2x {" + altura + "}" + " {" + profundidadeModulo + "}" + "{" + espessura + "}" );
		return sb.toString();
	}
}
