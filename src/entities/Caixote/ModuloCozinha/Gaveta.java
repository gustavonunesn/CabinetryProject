package entities.Caixote.ModuloCozinha;

import java.util.Scanner;

import entities.Caixote.Modulo;

public class Gaveta {
    protected Integer altura;
    protected Integer largura;
    protected Integer profundidade;
    protected Integer espessura;
    protected Modulo modulo;
    protected Integer qtdGavetas;

    public Gaveta(Modulo modulo, Integer qtdGavetas) {
        this.altura = modulo.getAltura();
        this.largura = modulo.getLargura();
        this.profundidade = modulo.getProfundidade();
        this.espessura = modulo.getEspessura(); 
        this.qtdGavetas = qtdGavetas;
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

    public String gavetaPuxadorERodape()
    {
        if(qtdGavetas == 1) {
            Integer subAltura = altura - 45; // 5mm de cima e de baixo, e 35 do puxador
            Integer fundoGaveta = largura - 57;

            return String.format("2x %d * %d * %d", altura, largura - 10, espessura);

            
        }
        
        return "teste";
    }

    public String gavetaPuxadorSemRodape()
    {
        return "teste";
    }

    public String gavetaSemPuxadorSemRodape()
    {
        return "teste";
    }

    public String gavetaSemPuxadorComRodape()
    {
        return "teste";
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
