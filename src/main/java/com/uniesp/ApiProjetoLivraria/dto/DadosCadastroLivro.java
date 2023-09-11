package com.uniesp.ApiProjetoLivraria.dto;

import com.uniesp.ApiProjetoLivraria.entity.Genero;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DadosCadastroLivro(

        @NotBlank
        String titulo,
        @NotBlank
        String autor,
        @NotBlank
        @Pattern(regexp = "\\d{4}")
        String ano,
        @NotBlank
        String descricao,
        @NotNull
        Genero genero

) {


}
