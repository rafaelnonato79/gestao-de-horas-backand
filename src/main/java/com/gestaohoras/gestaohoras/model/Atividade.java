package com.gestaohoras.gestaohoras.model;

import jakarta.persistence.*;
import lombok.Data;

@Table
@Entity
@Data
public class Atividade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ATI_ID")
    private Integer Id;

    @Column(name = "ATI_DESCRICAO")
    private String descricao;

    @Column(name = "ATI_HORAS")
    private Float horas;

    @JoinColumn(name = "ATI_USU_ID")
    private Usuario usuario;
}
