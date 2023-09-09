package com.uniesp.ApiProjetoLivraria.repository;

import com.uniesp.ApiProjetoLivraria.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
