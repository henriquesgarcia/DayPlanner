package com.henrique.dayplanner.model;

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
    private Categoria categoria;

    public Lembrete(){

    }

    public Lembrete(String titulo, String descricao, String data, Categoria categoria) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.data = data;
        this.categoria = categoria;
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

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
