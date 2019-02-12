package com.henrique.dayplanner.model;

import java.util.ArrayList;

public class Service {

    private ArrayList<Lembrete> lembretes = new ArrayList<>();

    /* LembreteService */
    public void criarLembrete(String titulo, String descricao, String data, Categoria categoria){

        Lembrete lembrete = new Lembrete(titulo, descricao, data, categoria);
        lembretes.add(lembrete);
    }

    public void apagarLembrete(String lembreteEscolhido){

        for (Lembrete lembrete : lembretes) {
            if (lembrete.getTitulo().equals(lembreteEscolhido))
                lembretes.remove(lembrete);
        }
    }

    public String listarLembretes(){

        String listaDeLembretes = "";

        if (lembretes.isEmpty())
            listaDeLembretes = "Você não possui lembretes no momento";
        else {

            for (int i = 0; i < lembretes.size(); i++) {
                listaDeLembretes += (i+1) + " - " + lembretes.get(i).getTitulo() + "\n";
            }
        }
        return listaDeLembretes;
    }



}
