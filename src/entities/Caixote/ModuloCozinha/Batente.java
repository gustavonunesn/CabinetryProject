package entities.Caixote.ModuloCozinha;

import entities.Caixote.Modulo;

public class Batente {
    protected Integer largura;
    protected Integer larguraAuxiliar;
    protected Integer profundidade;
    protected Integer profundidadeAuxiliar;
    protected Integer espessura;
    protected Modulo modulo;

    public Batente(Modulo modulo) { // FEITO
        this.largura = modulo.getLargura();
        this.larguraAuxiliar = 30;
        this.profundidade = modulo.getProfundidade();
        this.profundidadeAuxiliar = 60;
        this.espessura = modulo.getEspessura();
    }

    public String imprimeMedidasBatente() {
        return String.format("1x %d * %d * %d - Batente", largura - larguraAuxiliar, profundidadeAuxiliar, espessura);
    }
}
