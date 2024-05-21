package com.br.servicos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.modelos.AcessoUsuario;
import com.br.repositorios.AcessoUsuarioRepository;

@Service
public class AcessoUsuarioService {

	 @Autowired
	    private AcessoUsuarioRepository acessoUsuarioRepository;

	    public AcessoUsuario save(AcessoUsuario acessoUsuario) {
	        return acessoUsuarioRepository.save(acessoUsuario);
	    }

	    public List<AcessoUsuario> findAll() {
	        return acessoUsuarioRepository.findAll();
	    }
	}
