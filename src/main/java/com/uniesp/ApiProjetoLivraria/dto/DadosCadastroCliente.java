package com.uniesp.ApiProjetoLivraria.dto;

public record DadosCadastroCliente(

        String nome,
        String cpf,
        String email,
        String telefone,
        DadosCadastroEndereco endereco


) {
}