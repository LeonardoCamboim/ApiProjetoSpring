package com.uniesp.ApiProjetoLivraria.dto;

import com.uniesp.ApiProjetoLivraria.entity.Genero;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoLivro(

        @NotNull
        Long id,
        String titulo,
        String autor,
        String ano,
        String descricao,
        Genero genero
) {
}
