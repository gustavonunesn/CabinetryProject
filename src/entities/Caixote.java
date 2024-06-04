package entities;

import java.text.DecimalFormat;

public class Caixote {
	private Double altura;
	private Double largura;
	private Double profundidadeModulo;
	private Integer espessura;
	private Integer espessuraFundo;
	private Integer larguraBase;
	private Integer larguraPorta;
	
	private static final DecimalFormat df = new DecimalFormat("#");
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

	public String formatarDimensoes(String prefixo, Double dim1, Double dim2, Integer dim3){
		return new StringBuilder()
		.append(prefixo)
		.append(df.format(dim1))
		.append(" * ")
		.append(df.format(dim2))
		.append(" * ")
		.append(df.format(dim3))
		.toString();
	}

	public String baseCaixote() { 
		return formatarDimensoes("2x ", largura - larguraBase, profundidadeModulo, espessura) + " base";
	}
	
	public String lateralCaixote() {
		return formatarDimensoes("2x ", altura, profundidadeModulo, espessura) + " lateral";
	}
	public String portaTempeiro() {
		StringBuilder sb = new StringBuilder();
		sb.append("Lateral Caixa: 2x "+ altura + " * " + profundidadeModulo + " * " + espessura + " (1+/1-)\n");
		sb.append("Base Caixa: 1x " + (largura - larguraBase) + " * " + profundidadeModulo + " * " + espessura + " (1+)\n");
		sb.append("Batenta caixa: 1x " + (largura - larguraBase) + " * " + "60" + espessura + " (2+)\n");
		sb.append("Frente caixa: 1x " + (altura - 45) + " * " + (largura - larguraPorta) + " * " + espessura + " (4L)\n");
		sb.append("Maior lateral interna: 1x " + (altura - 105) + " * " + (profundidadeModulo - 50) + " * " + espessura + " (1+/1-)\n");
		sb.append("Menor lateral interna: 2x 85" + " * " + (profundidadeModulo - 50) + " * " + espessura + " (1+/1-)\n");
		sb.append("Frente verso interno: 4x 85 * " + (largura - 89) + " * " + espessura + " (1+)\n");
		sb.append("Fundo tempeiro: 2x " + (profundidadeModulo - 50) + " * " + (largura - 89 + 15) + " * " + espessuraFundo + " (2+)\n");
		return sb.toString();
		
	}

}
