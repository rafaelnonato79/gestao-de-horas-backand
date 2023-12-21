package com.gestaohoras.gestaohoras.restcontroller;

import com.gestaohoras.gestaohoras.model.Usuario;
import com.gestaohoras.gestaohoras.service.UsuarioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("usuarios")
public class UsuarioController {

    private final UsuarioService service;

    public UsuarioController(UsuarioService service) {
        this.service = service;
    }
    @GetMapping
    public List<Usuario>ListarTodos(){return service.listarTodos();}

    @PostMapping
    public void salvar(@RequestBody Usuario usuario){service.salvar(usuario);}
}
