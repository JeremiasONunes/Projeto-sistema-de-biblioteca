package com.biblioteca.model;

public class LivroImpresso extends Livro {
    private int numeroPaginas;
    
    public LivroImpresso(String titulo, String autor, int ano, int numeroPaginas) {
        super(titulo, autor, ano);
        this.numeroPaginas = numeroPaginas;
    }
    
    public int getNumeroPaginas() { return numeroPaginas; }
    public void setNumeroPaginas(int numeroPaginas) { this.numeroPaginas = numeroPaginas; }
    
    @Override
    public String toString() {
        return super.toString() + String.format(" | Páginas: %d", numeroPaginas);
    }
}