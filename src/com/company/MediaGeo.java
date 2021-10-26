package com.company;

public class MediaGeo implements  ICalcMedia, IMudaSituação{

    private double nota1;
    private double nota2;
    double media;

    public MediaGeo(double nota1, double nota2){
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    @Override
    public double CalculaMedia() {
        return Math.sqrt(this.nota1 * this.nota2);
    }

    @Override
    public boolean MudaSituacao(double media) {
        this.media = media;
        if(media < 7)
            return false;
        else
            return true;
    }
}
