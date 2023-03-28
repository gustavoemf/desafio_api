package com.example.desafio.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalTime;
import java.util.List;

@Entity
@Table(name = "cursos", schema = "publico")
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    @Column(name = "id", nullable = false, unique = true)
    private Long id;
    @Getter @Setter
    @Column(name = "carga_horaria", nullable = false)
    private LocalTime cargaHoraria;
    @Getter @Setter
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "curso-aluno", schema = "publico",
            uniqueConstraints = @UniqueConstraint(
                    columnNames = {
                            "curso_id",
                            "aluno_id"
                    }
            ),
        joinColumns = @JoinColumn(name = "curso_id"),
        inverseJoinColumns = @JoinColumn(name = "aluno_id")
    )
    private List<Aluno> alunos;
}