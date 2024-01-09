package com.gestaohoras.gestaohoras.repository;

import com.gestaohoras.gestaohoras.model.Fone;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FoneRepository extends JpaRepository<Fone, Integer> {
    List<Fone> findByNumeroLike(String numero);
}
