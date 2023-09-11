package com.uniesp.ApiProjetoLivraria.dto;

import jakarta.validation.constraints.NotBlank;

public record DadosCadastroEndereco(

        @NotBlank
        String logradouro,
        @NotBlank
        String bairro,
        @NotBlank
        String cep,
        @NotBlank
        String numero,
        String complemento,
        @NotBlank
        String cidade,
        @NotBlank
        String uf
) {
}

