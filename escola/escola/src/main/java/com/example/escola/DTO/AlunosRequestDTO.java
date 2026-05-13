package com.example.escola.DTO;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class AlunosRequestDTO {
    @NotBlank(message = "O nome do aluno é obrigatório")
    private String nomeAluno;

    @NotNull(message = "Informe o Registro do Aluno (RA)")
    private Double ra;

    @NotNull(message = "Informe a idade do aluno")
    private int idade;

    @NotBlank(message = "Informe o curso")
    private String curso;

    @NotBlank(message = "informe o semestre")
    private String semestre;

    @NotBlank(message = "informe o turno")
    private String turno;

    public AlunosRequestDTO() {
    }

    public AlunosRequestDTO(String nomeAluno, Double ra, int idade, String curso, String semestre, String turno) {
        this.nomeAluno = nomeAluno;
        this.ra = ra;
        this.idade = idade;
        this.curso = curso;
        this.semestre = semestre;
        this.turno = turno;
    }

    public @NotBlank(message = "O nome do aluno é obrigatório") String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(@NotBlank(message = "O nome do aluno é obrigatório") String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public @NotNull(message = "Informe o Registro do Aluno (RA)") Double getra() {
        return ra;
    }

    public void setRA(@NotNull(message = "Informe o Registro do Aluno (RA)") Double Ra) {
        this.ra = ra;
    }

    @NotNull(message = "Informe a idade do aluno")
    public int getIdade() {
        return idade;
    }

    public void setIdade(@NotNull(message = "Informe a idade do aluno") int idade) {
        this.idade = idade;
    }

    public @NotBlank(message = "Informe o curso") String getCurso() {
        return curso;
    }

    public void setCurso(@NotBlank(message = "Informe o curso") String curso) {
        this.curso = curso;
    }

    public @NotBlank(message = "informe o semestre") String getSemestre() {
        return semestre;
    }

    public void setSemestre(@NotBlank(message = "informe o semestre") String semestre) {
        this.semestre = semestre;
    }

    public @NotBlank(message = "informe o turno") String getTurno() {
        return turno;
    }

    public void setTurno(@NotBlank(message = "informe o turno") String turno) {
        this.turno = turno;
    }
}
