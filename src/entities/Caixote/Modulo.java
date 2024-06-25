package entities.Caixote;

public class Modulo {
    protected Double altura;
    protected Double largura;
    protected Double profundidade;
    protected Double espessura;
    protected Double espessuraFundo;

    public Modulo(Double altura, Double largura, Double profundidade, Double espessura, Double espessuraFundo) {
        this.altura = altura;
        this.largura = largura;
        this.profundidade = profundidade;
        this.espessura = espessura;
        this.espessuraFundo = espessuraFundo;
    }

    public Modulo(Double altura, Double largura, Double espessura) {
        this.altura = altura;
        this.largura = largura;
        this.espessura = espessura;
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

    @Override
    public String toString() {
        return "";
    }

}
