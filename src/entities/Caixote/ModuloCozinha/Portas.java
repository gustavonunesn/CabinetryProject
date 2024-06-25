package entities.Caixote.ModuloCozinha;

import entities.Caixote.Modulo;

public class Portas {

    private Double altura;
    private Double largura;
    private Double espessura;
    @SuppressWarnings("unused")
    private Modulo modulo;
    
    public Portas(Modulo modulo) {
        this.modulo = modulo;
        this.altura = modulo.getAltura(); // Exemplo de como definir a altura da porta com base no módulo
        this.largura = modulo.getLargura(); // Exemplo de como definir a largura da porta com base no módulo
        this.espessura = modulo.getEspessura();
    }

    public Double getAltura(){
        return this.altura;
    }

    public double getLargura(){
        return this.largura;
    }
    
    public double getEspessura(){
        return this.espessura;
    }
    
    public String imprimeMedidasUmaPorta() {
        return String.format("Altura: %.2f, Largura: %.2f, Espessura: %.2f", altura - 10, largura - 10, espessura);
    }
    
}
