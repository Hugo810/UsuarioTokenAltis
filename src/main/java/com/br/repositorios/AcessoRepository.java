package com.br.repositorios;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.modelos.Acesso;

@Repository
public interface AcessoRepository extends JpaRepository<Acesso, Long> {
    // Métodos adicionais podem ser declarados aqui, se necessário
}
