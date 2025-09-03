package com.biblioteca;

import com.biblioteca.view.MenuPrincipal;

public class Main {
    public static void main(String[] args) {
        System.out.println("Iniciando Sistema de Biblioteca...");
        new MenuPrincipal().executar();
    }
}