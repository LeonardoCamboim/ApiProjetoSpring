package com.uniesp.ApiProjetoLivraria.entity;

import com.uniesp.ApiProjetoLivraria.dto.DadosAtualizacaoCliente;
import com.uniesp.ApiProjetoLivraria.dto.DadosCadastroCliente;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.ObjectUtils;

@Entity(name = "Cliente")
@Table(name = "Clientes")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@EqualsAndHashCode(of = "id")
public class Cliente implements Comparable<Cliente>{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String cpf;

    private String email;

    private String telefone;

    private Boolean ativo;
    @Embedded
    private Endereco endereco;


    public Cliente(DadosCadastroCliente dados) {
        this.ativo = true;
        this.nome = dados.nome();
        this.cpf = dados.cpf();
        this.email = dados.email();
        this.telefone = dados.telefone();
        this.endereco = new Endereco(dados.endereco());
    }

    public void atualizarInformacoes(DadosAtualizacaoCliente dados) {
        if ( dados.nome() != null ) {
            this.nome = dados.nome();
        }
        if (dados.telefone() != null) {
            this.telefone = dados.telefone();
        }
        if (dados.endereco() != null) {
            this.endereco.atualizarInformacoes(dados.endereco());
        }

    }

    public void excluir() {
        this.ativo = false;
    }


    @Override
    public int compareTo(Cliente o) {
        return this.nome.compareTo(o.getNome());
    }
}
