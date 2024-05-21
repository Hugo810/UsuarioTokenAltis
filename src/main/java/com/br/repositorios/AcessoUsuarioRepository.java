package com.br.repositorios;




import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.modelos.AcessoUsuario;
public interface AcessoUsuarioRepository extends JpaRepository<AcessoUsuario, Long> {
}