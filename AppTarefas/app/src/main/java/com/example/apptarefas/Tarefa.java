package com.example.apptarefas;

import java.util.ArrayList;
import java.util.List;

public class Tarefa {

    private String titulo;

    public Tarefa(String titulo){
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public static List<Tarefa> criarListaTarefas(int numTarefas){
        List<Tarefa> lista = new ArrayList<>();
        for (int i = 0; i < numTarefas; i++) {
            lista.add(new Tarefa("Tarefa " + (i+1)));
        }
        return lista;
    }

}
