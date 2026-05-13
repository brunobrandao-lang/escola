package com.example.escola.model;

import jakarta.persistence.*;

@Entity
@Table(name = "table_Aluno")
public class AlunosModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String nomeAluno;

    @Column(nullable = false, unique = true)
    private Double ra;

    @Column(nullable = false)
    private int idade;

    @Column(nullable = false)
    private String curso;

    @Column(nullable = false)
    private String semestre;

    @Column(nullable = false)
    private String turno;

    public AlunosModel() {
    }

    public AlunosModel(Long id, String nomeAluno, Double ra, int idade, String curso, String semestre, String turno) {
        this.id = id;
        this.nomeAluno = nomeAluno;
        this.ra = ra;
        this.idade = idade;
        this.curso = curso;
        this.semestre = semestre;
        this.turno = turno;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public Double getRa() {
        return ra;
    }

    public void setRa(Double ra) {
        this.ra = ra;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
}
