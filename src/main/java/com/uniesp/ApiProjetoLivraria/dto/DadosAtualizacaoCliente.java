package com.uniesp.ApiProjetoLivraria.dto;

public record DadosAtualizacaoCliente(

        Long id,
        String nome,
        String telefone,
        DadosCadastroEndereco endereco

) {
}
