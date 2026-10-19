package com.sualoja.model;

public class Produto {
    private static int proximoCodigo = 1;

    private int codigo;
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade){
        this.codigo = proximoCodigo++;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;

    }

    public Produto(String nome, double preco) {
        this.codigo = proximoCodigo++;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = 0;

    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco () {
        return this.preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return this.quantidade;

    }

}
