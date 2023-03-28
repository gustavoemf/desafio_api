package com.example.desafio.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "enderecos", schema = "publico")
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    @Column(name = "id", nullable = false, unique = true)
    private Long id;
    @Getter @Setter
    @Column(name = "rua", nullable = false, length = 30)
    private String rua;
    @Getter @Setter
    @Column(name = "numero", nullable = false, length = 10)
    private String numero;
    @Getter @Setter
    @Column(name = "bairro", nullable = false, length = 30)
    private String bairro;
    @Getter @Setter
    @Column(name = "cep", nullable = false, length = 10)
    private String cep;
}