package com.gestaohoras.gestaohoras.repository;

import com.gestaohoras.gestaohoras.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepositoy extends JpaRepository<Usuario, Integer> {

}
