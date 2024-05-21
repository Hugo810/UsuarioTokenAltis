package com.br.controladores;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.br.modelos.Produto;
import com.br.servicos.ProdutoService;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @PostMapping
    public Produto criarProduto(@RequestBody Produto produto) {
        return produtoService.save(produto);
    }

    @GetMapping
    public List<Produto> listarProdutos() {
        return produtoService.findAll();
    }
}

