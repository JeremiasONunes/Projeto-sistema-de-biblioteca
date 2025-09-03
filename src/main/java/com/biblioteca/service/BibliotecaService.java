package com.biblioteca.service;

import com.biblioteca.model.*;
import com.biblioteca.exception.*;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class BibliotecaService {
    private List<Livro> livros = new ArrayList<>();
    private List<Usuario> usuarios = new ArrayList<>();
    private List<Emprestimo> emprestimos = new ArrayList<>();
    
    public void cadastrarLivro(Livro livro) {
        livros.add(livro);
    }
    
    public List<Livro> listarLivros() {
        return new ArrayList<>(livros);
    }
    
    public List<Livro> pesquisarLivro(String termo) {
        return livros.stream()
                .filter(l -> l.getTitulo().toLowerCase().contains(termo.toLowerCase()) ||
                           l.getAutor().toLowerCase().contains(termo.toLowerCase()))
                .toList();
    }
    
    public void cadastrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }
    
    public List<Usuario> listarUsuarios() {
        return new ArrayList<>(usuarios);
    }
    
    public void emprestarLivro(String tituloLivro, String matriculaUsuario) 
            throws LivroNaoEncontradoException, LivroIndisponivelException {
        
        Livro livro = livros.stream()
                .filter(l -> l.getTitulo().equalsIgnoreCase(tituloLivro))
                .findFirst()
                .orElseThrow(() -> new LivroNaoEncontradoException("Livro não encontrado: " + tituloLivro));
        
        if (!livro.isDisponivel()) {
            throw new LivroIndisponivelException("Livro indisponível para empréstimo: " + tituloLivro);
        }
        
        Usuario usuario = usuarios.stream()
                .filter(u -> u.getMatricula().equals(matriculaUsuario))
                .findFirst()
                .orElseThrow(() -> new LivroNaoEncontradoException("Usuário não encontrado: " + matriculaUsuario));
        
        livro.setDisponivel(false);
        emprestimos.add(new Emprestimo(livro, usuario));
    }
    
    public void devolverLivro(String tituloLivro) throws LivroNaoEncontradoException {
        Emprestimo emprestimo = emprestimos.stream()
                .filter(e -> e.getLivro().getTitulo().equalsIgnoreCase(tituloLivro) && !e.isDevolvido())
                .findFirst()
                .orElseThrow(() -> new LivroNaoEncontradoException("Empréstimo não encontrado para: " + tituloLivro));
        
        emprestimo.setDataDevolucaoReal(LocalDate.now());
        emprestimo.getLivro().setDisponivel(true);
    }
    
    public List<Emprestimo> listarEmprestimos() {
        return new ArrayList<>(emprestimos);
    }
}