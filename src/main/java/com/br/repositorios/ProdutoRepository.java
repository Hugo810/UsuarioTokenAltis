package com.br.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.br.modelos.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    // Se precisar de métodos adicionais, declare-os aqui
}

