package com.gestaohoras.gestaohoras.service;

import com.gestaohoras.gestaohoras.model.Fone;
import com.gestaohoras.gestaohoras.repository.FoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoneService {

    @Autowired
    private final FoneRepository repository;

    public FoneService(FoneRepository repository){ this.repository = repository;}

    public void salvar(Fone fone) { repository.save(fone);}

    public List<Fone> listarTodos() { return repository.findAll();}

    public void excluir(Integer id){repository.deleteById(id);}
}
