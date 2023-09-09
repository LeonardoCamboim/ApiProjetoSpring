package com.uniesp.ApiProjetoLivraria.controller;

import com.uniesp.ApiProjetoLivraria.dto.DadosCadastroCliente;
import com.uniesp.ApiProjetoLivraria.entity.Cliente;
import com.uniesp.ApiProjetoLivraria.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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


}