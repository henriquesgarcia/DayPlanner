package com.example.henrique.dayplanner.model;

import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;
import io.objectbox.relation.ToMany;

@Entity
public enum Categoria {

    ANIVERSARIO("Aniversário"),
    LIGACAO("Ligação"),
    SHOPPING("Shopping"),
    TODO("To-Do");

    @Id
    private long id;
    private String descricao;
    private ToMany<Lembrete> lembretes;

    Categoria(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao(){
        return descricao;
    }

    public ToMany<Lembrete> getLembretes() {
        return lembretes;
    }

    public void setLembretes(ToMany<Lembrete> lembretes) {
        this.lembretes = lembretes;
    }
}
