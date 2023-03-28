package com.example.desafio.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "contatos", schema = "publico")
public class Contato {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    @Column(name = "id", nullable = false, unique = true)
    private Long id;
    @Getter @Setter
    @Column(name = "tipo", nullable = false, length = 20)
    private String tipo;
    @Getter @Setter
    @Column(name = "valor", nullable = false, length = 20)
    private String valor;
    @Getter @Setter
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "id_aluno", nullable = false)
    private Aluno aluno;
}