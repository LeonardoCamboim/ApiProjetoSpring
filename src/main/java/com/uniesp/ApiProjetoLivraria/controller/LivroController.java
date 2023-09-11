package com.uniesp.ApiProjetoLivraria.controller;


import com.uniesp.ApiProjetoLivraria.dto.*;
import com.uniesp.ApiProjetoLivraria.entity.Livro;
import com.uniesp.ApiProjetoLivraria.repository.LivroRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("livros")
public class LivroController {

    @Autowired
    private LivroRepository livroRepository;


    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroLivro dados) {
        livroRepository.save(new Livro(dados));
    }

    @GetMapping
    public Page<Livro> listar(@PageableDefault(size = 10, sort = {"titulo"}) Pageable pageable) {
        return livroRepository.findAllByDisponibilidadeTrue(pageable);
    }

    @PutMapping
    @Transactional
    public void atualizar(@RequestBody @Valid DadosAtualizacaoLivro dados) {
        var livro = livroRepository.getReferenceById(dados.id());
        livro.atualizar(dados);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void excluir(@PathVariable Long id) {
        var livro = livroRepository.getReferenceById(id);
        livro.excluir();
    }









}
