package com.gestaohoras.gestaohoras.service;

import com.gestaohoras.gestaohoras.model.Atividade;
import com.gestaohoras.gestaohoras.repository.AtividadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AtividadeService {

    @Autowired
    private AtividadeRepository repository;

    public void salvar(Atividade atividade) {repository.save(atividade);}

    public List<Atividade> listarTodos(){return repository.findAll();}
}
