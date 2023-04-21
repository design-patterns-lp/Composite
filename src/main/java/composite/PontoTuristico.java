package composite;

public class PontoTuristico extends Destino{

    private Boolean isNatureza;
    private String belezaNatural = "Sim";

    public PontoTuristico(String local, Boolean isNatureza) {
        super(local);
        this.isNatureza = isNatureza;
    }

    public Boolean getIsNatureza() {
        return isNatureza;
    }

    public void setIsNatureza(Boolean isNatureza) {
        this.isNatureza = isNatureza;
    }

    public String getDestino() {
        if(!isNatureza){
            belezaNatural = "Não";
        }
        return "Ponto Turístico: " + this.getLocal() + " - Beleza Natural: " + this.belezaNatural + "\n";
    }
}
