package com.jcro.radiojcro.modelos;

public class MisFavs {
    public void adicion(Audio audio){
        if(audio.getClasific() >= 8){
            System.out.println(audio.getTitulo() + "Esta pegado perro");
        }else{
            System.out.println(audio.getTitulo() + "Casi perro");
        }
    }
}
