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

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getCodigo() {
        return this.codigo;
    }

    @Override
    public String toString() {
        return String.format("Codigo: %d // Nome: %s // Preco: %.2f // Quantidade: %d%n", this.codigo, this.nome, this.preco, this.quantidade);
    }

    public void adicionarUnidadesEstoque(int quantidade) {
        this.quantidade += quantidade;
    }
}
