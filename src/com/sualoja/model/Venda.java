package com.sualoja.model;

import java.util.ArrayList;

public class Venda {
    ArrayList<ItemVenda> itensVenda = new ArrayList<ItemVenda>();
    private Cliente cliente;

    public Venda(Cliente cliente) {
        this.cliente = cliente;
    }

    public void addListIV (ItemVenda iv) {
        this.itensVenda.add(iv);

    }

    public void mostrarVendas(){
        for(ItemVenda i: itensVenda) {
            System.out.println(i);
        }
    }



}
