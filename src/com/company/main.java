package com.company;

import javax.swing.*;
import java.text.DecimalFormat;

public class main {
    private static Disciplina d = new Disciplina();
    private static ICalcMedia med;
    private static IMudaSituação sit;
    private static DecimalFormat f = new DecimalFormat("0.00");

    public static void main(String[] args) {

        d.setNome(JOptionPane.showInputDialog("Digite o nome do aluno: "));

        int metodo = Integer.parseInt(JOptionPane.showInputDialog("Digite o método:" + "\n" +
                "1 - Média Artimética" + "\n" +
                "2 - Média Geométrica"));

        d.setP1(Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota: ")));
        d.setP2(Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota: ")));



        if(metodo == 1){
            med = new MediaArtm(d.getP1(), d.getP2());
            sit = new MediaArtm(d.getP1(), d.getP2());
        }
        else if(metodo == 2){
            med = new MediaGeo(d.getP1(), d.getP2());
            sit = new MediaGeo(d.getP1(), d.getP2());
        }

        d.mediaDisciplina(med);

        System.out.println("Aluno: " + d.getNome());
        System.out.println("Média: " + f.format(d.getMedia()));
        if(d.Situacao(sit) == true)
            System.out.println("Situação: Aprovado!!");
        else
            System.out.println("Situação: Reprovado!!");
    }
}
