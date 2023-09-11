package com.uniesp.ApiProjetoLivraria.entity;

import com.uniesp.ApiProjetoLivraria.dto.DadosAtualizacaoLivro;
import com.uniesp.ApiProjetoLivraria.dto.DadosCadastroLivro;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity(name = "Livro")
@Table(name = "livros")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@EqualsAndHashCode(of = "id")
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String autor;
    private String ano;
    private String descricao;
    private boolean disponibilidade;

    @Enumerated(EnumType.STRING)
    private Genero genero;

    public Livro(DadosCadastroLivro dados) {
        this.titulo = dados.titulo();
        this.autor = dados.autor();
        this.ano = dados.ano();
        this.descricao = dados.descricao();
        this.genero = dados.genero();
        this.disponibilidade = true;

    }

    public void atualizar(DadosAtualizacaoLivro dados) {
        if (dados.titulo() != null) {
            this.titulo = dados.titulo();
        }
        if (dados.autor() != null) {
            this.autor = dados.autor();
        }
        if (dados.ano() != null) {
            this.ano = dados.ano();
        }
        if (dados.descricao() != null) {
            this.descricao = dados.descricao();
        }
        if (dados.genero() != null) {
            this.genero = dados.genero();
        }

    }

    public void excluir() {
        this.disponibilidade = false;

    }
}