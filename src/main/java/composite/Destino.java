package composite;

public abstract class Destino {
    private String local;

    public Destino(String local){
        this.local = local;
    }

    public String getLocal(){
        return local;
    }

    public void setLocal(String local){
        this.local = local;
    }

    public abstract String getDestino();
}
