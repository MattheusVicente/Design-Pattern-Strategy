package com.company;

public class MediaArtm implements ICalcMedia, IMudaSituação{

    private double nota1;
    private double nota2;
    double media;

    public MediaArtm(double nota1, double nota2){
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    @Override
    public double CalculaMedia() {
        return (this.nota1 + this.nota2) / 2;
    }

    @Override
    public boolean MudaSituacao(double media) {
        this.media = media;
        if(media < 5)
            return false;
        else
            return true;
    }
}
