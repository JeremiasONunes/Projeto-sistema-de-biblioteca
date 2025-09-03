package com.biblioteca.exception;

public class LivroNaoEncontradoException extends Exception {
    public LivroNaoEncontradoException(String mensagem) {
        super(mensagem);
    }
}