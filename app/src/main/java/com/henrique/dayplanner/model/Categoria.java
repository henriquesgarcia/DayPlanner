package com.henrique.dayplanner.model;

import com.example.henrique.dayplanner.model.Lembrete;

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
    protected long id;
    private String descricao;
    protected ToMany<Lembrete> lembretes;

    Categoria(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao(){
        return descricao;
    }
}
