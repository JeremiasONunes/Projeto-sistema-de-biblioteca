package com.biblioteca.model;

public class Ebook extends Livro {
    private double tamanhoMB;
    
    public Ebook(String titulo, String autor, int ano, double tamanhoMB) {
        super(titulo, autor, ano);
        this.tamanhoMB = tamanhoMB;
    }
    
    public double getTamanhoMB() { return tamanhoMB; }
    public void setTamanhoMB(double tamanhoMB) { this.tamanhoMB = tamanhoMB; }
    
    @Override
    public String toString() {
        return super.toString() + String.format(" | Tamanho: %.2f MB", tamanhoMB);
    }
}