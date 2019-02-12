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

        try {
            for (Lembrete lembrete : lembretes) {
                if (lembrete.getTitulo().equals(lembreteEscolhido))
                    lembretes.remove(lembrete);
            }
        } catch (NullPointerException e){
            System.out.println("O lembrete " + lembreteEscolhido + " não existe.");
        }
    }

    public String listarLembretes(){

        String listaDeLembretes = "";

        try {
            for (int i = 0; i < lembretes.size(); i++) {
                listaDeLembretes += (i+1) + " - " + lembretes.get(i).getTitulo() + "\n";
            }
        } catch (NullPointerException e){
            listaDeLembretes = "Você não possui lembretes no momento";
        }

        return listaDeLembretes;
    }



}
