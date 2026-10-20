package com.sualoja.model;

public class Cliente {

    private static int proximoCodigo = 1;

    private int codigo;
    private String nome;
    private String contato;


    public Cliente(String nome, String contato) {
        this.codigo = proximoCodigo++;
        this.nome = nome;
        this.contato = contato;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome (String nome) {
        this.nome = nome;
    }

    public String getContato () {
        return this.contato ;
    }

    public void setContato (String contato) {
        this.contato = contato;
    }

    @Override
    public String toString() {
        return String.format("Codigo: %d // Nome: %s // Contato: %s%n", this.codigo, this.nome, this.contato);
    }
}
