package com.jcro.radiojcro.modelos;

public class Songs extends Audio{
    private String album;
    private String cantante;
    private String genero;

    @Override
    public int getClasific() {
        if (getTotallikes() > 400) {
            return 8;
        }else {
            return 4;
        }
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getCantante() {
        return cantante;
    }

    public void setCantante(String cantante) {
        this.cantante = cantante;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
