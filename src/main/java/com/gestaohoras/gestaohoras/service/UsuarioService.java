package com.gestaohoras.gestaohoras.service;

import com.gestaohoras.gestaohoras.model.Usuario;
import com.gestaohoras.gestaohoras.repository.UsuarioRepositoy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    private final UsuarioRepositoy repositoy;

    public UsuarioService(UsuarioRepositoy repositoy) {
        this.repositoy = repositoy;
    }

    public List<Usuario> listarTodos(){return repositoy.findAll();}


    public void salvar(Usuario usuario) {repositoy.save(usuario);
    }
}
