package com.gestaohoras.gestaohoras.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Integer id;

    @Column(name = "USU_MATRICULA")
    private String matricula;

    @Column(name = "USU_NOME")
    private String nome;

    @Column(name = "USU_FONE",length = 12)
    private String fone;

    @Column(name = "USU_EMAIL")
    private String email;

    @Column(name = "USU_NIVEL")
    private String nivel;

    @Column(name = "USU_SENHA")
    private String senha;


}
