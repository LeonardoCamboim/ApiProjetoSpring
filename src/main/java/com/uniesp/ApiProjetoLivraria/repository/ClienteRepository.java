package com.uniesp.ApiProjetoLivraria.repository;

import com.uniesp.ApiProjetoLivraria.entity.Cliente;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    Page<Cliente> findAllByAtivoTrue(Pageable page);
    Page<Cliente> findByNome(String nome, Pageable pageable);
    Page<Cliente> findByCpf(String cpf, Pageable pageable);


}
