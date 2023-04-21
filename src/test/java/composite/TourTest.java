package composite;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TourTest {

        @Test
        void deveRetornarViagensTour(){
                Viagem viagem1 = new Viagem("Flight to Alaska");
                Viagem viagem2 = new Viagem("Flight to Arizona");

                PontoTuristico pontoTuristico21 = new PontoTuristico("Grand Canyon", true);
                viagem2.addDestino(pontoTuristico21);

                Viagem viagem3 = new Viagem("Flight to New York");
                PontoTuristico pontoTuristico31 = new PontoTuristico("Statue of Liberty", false);
                PontoTuristico pontoTuristico32 = new PontoTuristico("White House", false);
                viagem3.addDestino(pontoTuristico31);
                viagem3.addDestino(pontoTuristico32);

                Viagem passeio = new Viagem("Trip for USA");
                passeio.addDestino(viagem1);
                passeio.addDestino(viagem2);
                passeio.addDestino(viagem3);
                
                Tour tour1 = new Tour();
                tour1.setNomeDestino(passeio);
                System.out.println(tour1.getNomeDestino());
                assertEquals("Viagem: Trip for USA\n" +
                        "Viagem: Flight to Alaska\n" +
                        "Viagem: Flight to Arizona\n" +
                        "Ponto Turístico: Grand Canyon - Beleza Natural: Sim\n" +
                        "Viagem: Flight to New York\n" +
                        "Ponto Turístico: Statue of Liberty - Beleza Natural: Não\n" +
                        "Ponto Turístico: White House - Beleza Natural: Não\n", tour1.getNomeDestino());
        }
}