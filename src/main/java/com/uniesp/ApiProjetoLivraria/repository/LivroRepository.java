package com.uniesp.ApiProjetoLivraria.repository;

import com.uniesp.ApiProjetoLivraria.entity.Livro;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro, Long> {


    Page<Livro> findAllByDisponibilidadeTrue(Pageable pageable);
}
