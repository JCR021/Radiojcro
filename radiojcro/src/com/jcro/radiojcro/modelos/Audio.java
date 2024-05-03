package com.jcro.radiojcro.modelos;

public class Audio {
    private  String titulo;
    private int totalreprod;
    private int totallikes;
    private int clasific;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getClasific() {
        return clasific;
    }

    public void setClasific(int clasific) {
        this.clasific = clasific;
    }

    public int getTotallikes() {
        return totallikes;
    }

    public void setTotallikes(int totallikes) {
        this.totallikes = totallikes;
    }

    public int getTotalreprod() {
        return totalreprod;
    }

    public void setTotalreprod(int totalreprod) {
        this.totalreprod = totalreprod;
    }

    public void like(){
        this.totallikes++;
    }

    public void reprod(){
        this.totalreprod++;
    }


}








