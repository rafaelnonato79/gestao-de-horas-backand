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

    @JoinColumn(name = "USU_FON_ID")
    @ManyToOne(cascade = CascadeType.ALL)
    private Fone fone;

    @Column(name = "USU_EMAIL")
    private String email;

    @Column(name = "USU_NIVEL")
    private String nivel;

    @Column(name = "USU_SENHA")
    private String senha;

}
