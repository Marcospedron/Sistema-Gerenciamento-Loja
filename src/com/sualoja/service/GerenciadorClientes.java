package com.sualoja.service;
import com.sualoja.model.Cliente;
import java.util.ArrayList;

public class GerenciadorClientes {
    private ArrayList<Cliente> clientes = new ArrayList<>();


    public void addList (Cliente c) {
        this.clientes.add(c);

    }
}
