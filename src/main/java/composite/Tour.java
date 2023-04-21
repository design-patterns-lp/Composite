package composite;

public class Tour{
    private Destino nomeDestino;

    public void setNomeDestino(Destino nomeDestino){
        this.nomeDestino = nomeDestino;
    }

    public String getNomeDestino(){
        if(this.nomeDestino == null){
            throw new NullPointerException("Tour sem destino definido");
        }
        return this.nomeDestino.getDestino();
    }
}