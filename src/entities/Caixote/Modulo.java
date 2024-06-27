package entities.Caixote;

public class Modulo {
    protected Integer altura;
    protected Integer largura;
    protected Integer larguraBase;
    protected Integer profundidade;
    protected Integer espessura;
    protected Integer espessuraFundo;

    public Modulo(Integer altura, Integer largura, Integer profundidade, Integer espessura, Integer espessuraFundo) {
        this.altura = altura;
        this.largura = largura;
        this.larguraBase = 30;
        this.profundidade = profundidade;
        this.espessura = espessura;
        this.espessuraFundo = espessuraFundo;
    }

    public Modulo(Integer altura, Integer largura, Integer espessura) {
        this.altura = altura;
        this.largura = largura;
        this.espessura = espessura;
    }

    public Integer getAltura() {
        return altura;
    }

    public void setAltura(Integer altura) {
        this.altura = altura;
    }

    public Integer getLargura() {
        return largura;
    }

    public void setLargura(Integer largura) {
        this.largura = largura;
    }

    public Integer getProfundidade() {
        return profundidade;
    }

    public void setProfundidade(Integer profundidade) {
        this.profundidade = profundidade;
    }

    public Integer getEspessura() {
        return espessura;
    }

    public void setEspessura(Integer espessura) {
        this.espessura = espessura;
    }

    public Integer getEspessuraFundo() {
        return espessuraFundo;
    }

    public void setEspessuraFundo(Integer espessuraFundo) {
        this.espessuraFundo = espessuraFundo;
    }

    @Override
    public String toString() {
        return "";
    }

    public String imprimeMedidasBaseESuperior(){
      return String.format("1x %d * %d * %d - Base e Superior", largura - larguraBase, profundidade, espessura); 
    }

}
