package com.br.servicos;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.modelos.Acesso;
import com.br.repositorios.AcessoRepository;

@Service
public class AcessoService {
    @Autowired
    private AcessoRepository acessoRepository;

    public Acesso save(Acesso acesso) {
        return acessoRepository.save(acesso);
    }

    public List<Acesso> findAll() {
        return acessoRepository.findAll();
    }
}
