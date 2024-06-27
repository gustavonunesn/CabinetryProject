package entities.Caixote.ModuloCozinha;

import entities.Caixote.Modulo;

public class Portas {

    private Integer altura;
    private Integer largura;
    private Integer espessura;
    private Modulo modulo;
    
    public Portas(Modulo modulo) {
        this.modulo = modulo;
        this.altura = modulo.getAltura(); // Exemplo de como definir a altura da porta com base no módulo
        this.largura = modulo.getLargura(); // Exemplo de como definir a largura da porta com base no módulo
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

    public void setLargura(Integer largura){
        this.largura = largura;
    }
    
    public Integer getEspessura(){
        return this.espessura;
    }

    public void setEspessura(Integer Espessura){}

    public Modulo getModulo(){
        return this.modulo;
    }
    
    public String imprimeMedidasUmaPortaComPuxador() {
        return String.format("1x %d * %d * %d - Porta", altura - 45, largura - 10, espessura);
    }

    public String imprimeMedidasDuasPortasComPuxador(){
        return String.format("2x %d * %d * %d - Portas", altura - 45, (largura / 2) - 5, espessura);
    }
    

}
