package com.jcro.radiojcro.principal;


import com.jcro.radiojcro.modelos.MisFavs;
import com.jcro.radiojcro.modelos.Pc;
import com.jcro.radiojcro.modelos.Songs;

public class Principal {
    public static void main(String[] args) {
        Songs songs = new Songs();
        songs.setTitulo("Querer querernos");
        songs.setCantante("Canserbero");

        Pc pc = new Pc();
        pc.setTitulo("Terrores nocturnos");
        pc.setDescripcion("Donde hablamos de cosas de terror");
        pc.setPresentador("Vasco Nunez de Balboa");

        for (int i = 0; i < 100; i++) {
            songs.like();
        }

        for (int i = 0; i < 5000; i++) {
            songs.reprod();
        }

        for (int i = 0; i < 100; i++) {
            pc.like();
        }

        for (int i = 0; i < 5000; i++) {
            pc.reprod();
        }

        System.out.println("Total de reproducciones son: " + songs.getTotalreprod()+ " veces");
        System.out.println("Total de likes son " + songs.getTotallikes() + " likes");

        MisFavs favs = new MisFavs();
        favs.adicion(pc);
        favs.adicion(songs);


    }
}
