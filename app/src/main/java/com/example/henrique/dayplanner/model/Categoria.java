package com.example.henrique.dayplanner.model;

import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;

@Entity
public enum Categoria {

    ANIVERSARIO("Aniversário"),
    LIGACAO("Ligação"),
    SHOPPING("Shopping"),
    TODO("To-Do");

    @Id
    private long id;
    private String descricao;

    Categoria(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao(){
        return descricao;
    }

}
