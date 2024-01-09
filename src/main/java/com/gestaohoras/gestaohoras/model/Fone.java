package com.gestaohoras.gestaohoras.model;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table
@Data
public class Fone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "FON_ID")
    private Integer id;

    @Column(name = "FON_NUMERO", length = 15)
    private String numero;


}
