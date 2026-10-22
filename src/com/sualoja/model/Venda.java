
package com.sualoja.model;

import java.util.ArrayList;

public class Venda {

    private static int proximoCodigo = 1;

    private ArrayList<ItemVenda> itensVenda = new ArrayList<>();
    private Cliente cliente;
    private int codigo;

    public Venda(Cliente cliente) {
        this.codigo = proximoCodigo++;
        this.cliente = cliente;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public void addListIV(ItemVenda iv) {
        this.itensVenda.add(iv);
    }

    public void mostrarVendas() {
        System.out.println("========================================");
        System.out.println("Venda codigo: " + this.codigo);
        System.out.println("Cliente: " + this.cliente.getNome());
        System.out.println("Itens da venda:");

        for (ItemVenda i : itensVenda) {
            System.out.println(i);
        }

        System.out.printf("Valor total: R$ %.2f%n", valorTotalVenda());
        System.out.println("========================================");
    }

    public double valorTotalVenda() {
        double v = 0;

        for (ItemVenda iv : itensVenda) {
            v += iv.getValorVenda();
        }

        return v;
    }
}
