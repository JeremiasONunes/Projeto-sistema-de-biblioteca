package com.biblioteca.model;

public class Professor extends Usuario {
    private String departamento;
    
    public Professor(String nome, String matricula, String departamento) {
        super(nome, matricula);
        this.departamento = departamento;
    }
    
    public String getDepartamento() { return departamento; }
    public void setDepartamento(String departamento) { this.departamento = departamento; }
    
    @Override
    public String toString() {
        return super.toString() + String.format(" | Departamento: %s", departamento);
    }
}