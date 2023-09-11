package com.uniesp.ApiProjetoLivraria.dto;

import com.uniesp.ApiProjetoLivraria.entity.Cliente;

public record DadosListagemCliente(Long id, String nome, String cpf, String email) {

    public DadosListagemCliente(Cliente cliente) {
        this(cliente.getId(), cliente.getNome(), cliente.getCpf(), cliente.getEmail());

    }




}
