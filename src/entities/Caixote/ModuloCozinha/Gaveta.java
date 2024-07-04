package entities.Caixote.ModuloCozinha;

import entities.Caixote.Modulo;

public class Gaveta {
    protected Integer altura;
    protected Integer largura;
    protected Integer profundidade;
    protected Integer espessura;
    protected Modulo modulo;

    public Gaveta(Modulo modulo) {
        this.altura = modulo.getAltura();
        this.largura = modulo.getLargura();
        this.profundidade = modulo.getProfundidade();
        this.espessura = modulo.getEspessura(); 
    }

    public Integer getAltura(){
        return this.altura;
    }

    public void setAltura(Integer altura) {
        this.altura = altura;
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

    public void setProfundidade(Integer profundidade) {
        this.profundidade = profundidade;
    }

    public Integer getEspessura(){
        return this.espessura;
    }

    public void setEspessura(Integer espessura) {
        this.espessura = espessura;
    }

    public Integer umaGaveta() {
        return null;
    }

    public Integer duasGavetas() {
        return null;
    }

    public Integer tresGavetas() {
        return null;
    }

    public Integer quatroGavetas() {
        return null;
    }

    public Integer gaveta2mais1() {
        return null;
    }

}
