package com.company;

public class Disciplina {

    private String nome;
    private double p1;
    private double p2;
    private double media;

    public void mediaDisciplina(ICalcMedia med){
        media = med.CalculaMedia();
    }

    public boolean Situacao(IMudaSituação situacao){
        return situacao.MudaSituacao(media);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setP1(double p1){
        this.p1 = p1;
    }

    public void setP2(double p2) {
        this.p2 = p2;
    }

    public String getNome() {
        return nome;
    }

    public double getP1() {
        return p1;
    }

    public double getP2() {
        return p2;
    }

    public double getMedia() {
        return media;
    }

}
