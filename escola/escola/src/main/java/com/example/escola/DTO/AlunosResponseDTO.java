package com.example.escola.DTO;

public class AlunosResponseDTO {
    private String nomeAluno;
    private Double ra;
    private int idade;
    private String curso;
    private String semestre;
    private String turno;

    public AlunosResponseDTO() {
    }

    public AlunosResponseDTO(String nomeAluno, Double ra, int idade, String curso, String semestre, String turno) {
        this.nomeAluno = nomeAluno;
        this.ra = ra;
        this.idade = idade;
        this.curso = curso;
        this.semestre = semestre;
        this.turno = turno;
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
