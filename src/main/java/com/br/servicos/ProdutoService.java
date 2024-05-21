package com.br.servicos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.modelos.Produto;
import com.br.repositorios.ProdutoRepository;

@Service
public class ProdutoService {
	
	
	    @Autowired
	    private ProdutoRepository produtoRepository;

	    public Produto save1(Produto produto) {
	        return produtoRepository.save(produto);
	    }

	    public List<Produto> findAll() {
	        return produtoRepository.findAll();
	    }

		public Produto save(Produto produto) {
			// TODO Auto-generated method stub
			return null;
		}
	}
