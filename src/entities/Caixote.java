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
		.append(dim2)
		.append(" * ")
		.append(dim3)
		.toString();
	}


	public String baseCaixote() { 
		return formatarDimensoes("2x ", largura - larguraBase, altura, espessura);
	}
	public String lateralCaixote() {
		StringBuilder sb = new StringBuilder();
		sb.append("2x " + df.format(altura) + " * " + df.format(profundidadeModulo) + " * " + espessura);
		return sb.toString();
	}

	/* public String fundoCaixote(){
		StringBuilder sb = new StringBuilder();
		sb.append(0)
	} */
}
