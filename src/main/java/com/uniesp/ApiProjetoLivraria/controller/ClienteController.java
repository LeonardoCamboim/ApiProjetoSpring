package com.uniesp.ApiProjetoLivraria.controller;

import com.uniesp.ApiProjetoLivraria.dto.DadosAtualizacaoCliente;
import com.uniesp.ApiProjetoLivraria.dto.DadosCadastroCliente;
import com.uniesp.ApiProjetoLivraria.dto.DadosListagemCliente;
import com.uniesp.ApiProjetoLivraria.entity.Cliente;
import com.uniesp.ApiProjetoLivraria.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("clientes")
public class ClienteController {


    @Autowired
    private ClienteRepository clienteRepository;


    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody DadosCadastroCliente dados) {
        clienteRepository.save(new Cliente(dados));
    }


    @GetMapping
    public Page<DadosListagemCliente> listar(@PageableDefault(size = 10, sort = {"nome"}) Pageable page) {
        return clienteRepository.findAllByAtivoTrue(page)
                .map(DadosListagemCliente::new);

    }

    @PutMapping
    @Transactional
    public void atualizar(@RequestBody DadosAtualizacaoCliente dados) {
        var cliente = clienteRepository.getReferenceById(dados.id());
        cliente.atualizarInformacoes(dados);
    }





}