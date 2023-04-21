package composite;

import java.util.ArrayList;
import java.util.List;

public class Viagem extends Destino{
    private List<Destino> destinos;

    public Viagem(String local){
        super(local);
        this.destinos = new ArrayList<Destino>();
    }

    public void addDestino(Destino destino){
        this.destinos.add(destino);
    }

    public String getDestino(){
        String output = "";
        output = "Viagem: " + this.getDestino() + "\n";
        for(Destino destino : destinos){
            output += destino.getDestino();
        }
        return output;
    }
}
