package com.uniesp.ApiProjetoLivraria.dto;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoCliente(

        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosCadastroEndereco endereco

) {
}
