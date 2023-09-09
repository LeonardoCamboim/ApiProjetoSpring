package com.uniesp.ApiProjetoLivraria.dto;

public record DadosCadastroEndereco(

        String logradouro,
        String bairro,
        String cep,
        String numero,
        String complemento,
        String cidade,
        String uf
) {
}

