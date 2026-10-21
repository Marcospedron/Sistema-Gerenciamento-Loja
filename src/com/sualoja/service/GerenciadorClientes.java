package com.sualoja.service;
import com.sualoja.model.Cliente;
import com.sualoja.model.Produto;

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

    public boolean buscarCliente(String busca) {
        boolean achou = false;
        if(busca.matches("\\d+")) {
            int c = Integer.parseInt(busca);
            for(Cliente cl : clientes) {
                if(cl.getCodigo() == c) {
                    System.out.println(cl);
                     achou = true;
                }
            }
            } else {
            for(Cliente cl : clientes) {
                if(cl.getNome().toLowerCase().replaceAll("\\s+", "").equals(busca.toLowerCase().replaceAll("\\s+", ""))) {
                    System.out.println(cl);
                     achou = true;
                }
            }
        }
        return achou;
    }

    public Cliente buscarClientePorCodigo(int codigo) {
        for (Cliente cl : clientes) {
            if (cl.getCodigo() == codigo) {
                return cl;
            }
        }
        return null;
    }

    public boolean removerCliente(int codigo) {
        for (Cliente cl : clientes) {
            if (cl.getCodigo() == codigo) {
                clientes.remove(cl);
                return true;
            }
        }
        return false;
    }
}
