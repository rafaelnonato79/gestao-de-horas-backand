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

    @PutMapping("{id}")
    public void editar(@PathVariable Integer id, @RequestBody Usuario usuarioEditado){
        Usuario usuario = service.listarPorId(id);
        usuario.setMatricula(usuarioEditado.getMatricula());
        usuario.setNome(usuarioEditado.getNome());
        usuario.setFone(usuarioEditado.getFone());
        usuario.setEmail(usuarioEditado.getEmail());
        usuario.setNivel(usuarioEditado.getNivel());
        usuario.setSenha(usuarioEditado.getSenha());
        service.salvar(usuario);
    }

    @DeleteMapping("{id}")
    public void excluir(@PathVariable Integer id){
        service.excluir(id);
    }

}
