package entities.Caixote.ModuloCozinha;

import entities.Caixote.Modulo;

public class Prateleiras {
    protected Integer largura;
    protected Integer larguraAux;
    protected Integer profundidade;
    protected Integer profundidadeAux;
    protected Integer espessura;
    protected Modulo modulo;

    public Prateleiras(Modulo modulo) {
        this.modulo = modulo;
        this.largura = modulo.getLargura();
        this.larguraAux = 30;
        this.profundidade = modulo.getProfundidade();
        this.profundidadeAux = 50;
        this.espessura = modulo.getEspessura();
    }

    public Integer getLargura(){
        return this.largura;
    }

    public void setLargura(Integer largura) {
        this.largura = largura;
    }
    
    public Integer getProfundidade(){
        return this.profundidade;
    }

    public void setProfundidade(Integer profundidade){
        this.profundidade = profundidade;
    }

    public Integer getEspessura(){
        return this.espessura;
    }

    public void setEspessura(Integer espessura){
        this.espessura = espessura;
    }

    public String imprimeMedidasPrateleira() {
        return String.format("1x %d * %d * %d - Prateleira", largura - larguraAux, profundidade - profundidadeAux, espessura);

    }

}
