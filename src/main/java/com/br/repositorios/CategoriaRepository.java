package com.br.repositorios;

import java.util.List;

import com.br.modelos.Categoria;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.br.modelos.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
    // Se precisar de métodos adicionais, declare-os aqui
}

