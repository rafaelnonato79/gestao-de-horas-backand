package com.gestaohoras.gestaohoras.restcontroller;


import com.gestaohoras.gestaohoras.model.Fone;
import com.gestaohoras.gestaohoras.service.FoneService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("fones")
public class FoneController {

    private FoneService service;

    public FoneController(FoneService service){ this.service = service;}

    @GetMapping
    public List<Fone> listarTodos() {return service.listarTodos();}

     public void salvar(@RequestBody Fone fone){ service.salvar(fone);}
}
