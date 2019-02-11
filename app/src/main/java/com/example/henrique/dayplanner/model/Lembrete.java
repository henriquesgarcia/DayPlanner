package com.example.henrique.dayplanner.model;

import java.util.Date;

import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;
import io.objectbox.relation.ToOne;

@Entity
public class Lembrete {

    @Id
    public long id;
    private String titulo;
    private String descricao;
    private String data;
    private ToOne<Lembrete> lembrete;
    private ToOne<Categoria> categoria;

    public Lembrete() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public ToOne<Lembrete> getLembrete() {
        return lembrete;
    }

    public void setLembrete(ToOne<Lembrete> lembrete) {
        this.lembrete = lembrete;
    }

    public ToOne<Categoria> getCategoria() {
        return categoria;
    }

    public void setCategoria(ToOne<Categoria> categoria) {
        this.categoria = categoria;
    }
}
