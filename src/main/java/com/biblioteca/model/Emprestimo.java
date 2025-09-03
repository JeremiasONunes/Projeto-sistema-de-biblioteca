package com.biblioteca.model;

import java.time.LocalDate;

public class Emprestimo {
    private Livro livro;
    private Usuario usuario;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucaoPrevista;
    private LocalDate dataDevolucaoReal;
    
    public Emprestimo(Livro livro, Usuario usuario) {
        this.livro = livro;
        this.usuario = usuario;
        this.dataEmprestimo = LocalDate.now();
        this.dataDevolucaoPrevista = dataEmprestimo.plusDays(7);
    }
    
    public Livro getLivro() { return livro; }
    public Usuario getUsuario() { return usuario; }
    public LocalDate getDataEmprestimo() { return dataEmprestimo; }
    public LocalDate getDataDevolucaoPrevista() { return dataDevolucaoPrevista; }
    public LocalDate getDataDevolucaoReal() { return dataDevolucaoReal; }
    public void setDataDevolucaoReal(LocalDate dataDevolucaoReal) { this.dataDevolucaoReal = dataDevolucaoReal; }
    
    public boolean isDevolvido() { return dataDevolucaoReal != null; }
    
    @Override
    public String toString() {
        return String.format("Livro: %s | Usuário: %s | Empréstimo: %s | Devolução prevista: %s | Status: %s",
                           livro.getTitulo(), usuario.getNome(), dataEmprestimo, 
                           dataDevolucaoPrevista, isDevolvido() ? "Devolvido" : "Pendente");
    }
}