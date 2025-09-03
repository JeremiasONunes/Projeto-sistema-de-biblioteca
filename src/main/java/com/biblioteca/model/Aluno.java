package com.biblioteca.model;

public class Aluno extends Usuario {
    private String curso;
    
    public Aluno(String nome, String matricula, String curso) {
        super(nome, matricula);
        this.curso = curso;
    }
    
    public String getCurso() { return curso; }
    public void setCurso(String curso) { this.curso = curso; }
    
    @Override
    public String toString() {
        return super.toString() + String.format(" | Curso: %s", curso);
    }
}