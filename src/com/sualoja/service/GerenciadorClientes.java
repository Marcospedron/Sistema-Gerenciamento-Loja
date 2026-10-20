package com.sualoja.service;
import com.sualoja.model.Cliente;
import java.util.ArrayList;

public class GerenciadorClientes {
    private ArrayList<Cliente> clientes = new ArrayList<>();


    public void addList (Cliente c) {
        this.clientes.add(c);

    }

    public void listarClientes() {
        if(clientes.size() == 0) {
            System.out.println("Nenhum cliente cadastrado");
        }
        for(Cliente cl: clientes) {
            System.out.println(cl);
        }
    }
}
