package com.diogo.appnotesz.dao;

/**
 * Created by android on 04/09/2018.
 */

public class Anotacoes {

    private String nome;
    private String Titulo;

    public Anotacoes() {
    }

    public Anotacoes(String nome, String titulo) {
        this.nome = nome;
        Titulo = titulo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;

    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;



        }
    }
