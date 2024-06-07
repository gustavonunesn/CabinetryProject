package entities.Caixote;

public class Modulo {
    private Double altura;
    private Double largura;
    private Double profundidade;
    private Double espessura;
    private Double espessuraFundo;

    public Modulo(Double altura, Double largura, Double profundidade, Double espessura, Double espessuraFundo) {
        this.altura = altura;
        this.largura = largura;
        this.profundidade = profundidade;
        this.espessura = espessura;
        this.espessuraFundo = espessuraFundo;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getLargura() {
        return largura;
    }

    public void setLargura(Double largura) {
        this.largura = largura;
    }

    public Double getProfundidade() {
        return profundidade;
    }

    public void setProfundidade(Double profundidade) {
        this.profundidade = profundidade;
    }

    public Double getEspessura() {
        return espessura;
    }

    public void setEspessura(Double espessura) {
        this.espessura = espessura;
    }

    public Double getEspessuraFundo() {
        return espessuraFundo;
    }

    public void setEspessuraFundo(Double espessuraFundo) {
        this.espessuraFundo = espessuraFundo;
    }

}
