package com.sualoja.model;

public class ItemVenda {

    private static int proximoCodigo = 1;

        private int codigo;
        private int quantidade;
        private Produto produto;
        private double valorVenda;

        public ItemVenda(int quantidade, Produto produto) {
            this.codigo = proximoCodigo++;
            this.quantidade = quantidade;
            this.produto = produto;
            this.valorVenda = this.quantidade * this.produto.getPreco();
        }

        public int getCodigo() {
            return this.codigo;
        }

        public double getValorVenda() {
            return valorVenda;
        }

    @Override
    public String toString() {
        return String.format("Codigo: %d // Produto %s //Quantidade: %d // Valor: %.2f%n", this.codigo, produto.getNome(), this.quantidade, this.valorVenda);
    }


}
