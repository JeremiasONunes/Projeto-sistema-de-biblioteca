package com.biblioteca.view;

import com.biblioteca.exception.*;
import com.biblioteca.model.*;
import com.biblioteca.service.BibliotecaService;
import java.util.Scanner;

public class MenuPrincipal {
    private BibliotecaService service = new BibliotecaService();
    private Scanner scanner = new Scanner(System.in);
    
    public void executar() {
        int opcao;
        do {
            exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer
            
            try {
                switch (opcao) {
                    case 1 -> cadastrarLivro();
                    case 2 -> listarLivros();
                    case 3 -> pesquisarLivro();
                    case 4 -> cadastrarUsuario();
                    case 5 -> emprestarLivro();
                    case 6 -> devolverLivro();
                    case 7 -> listarEmprestimos();
                    case 8 -> listarUsuarios();
                    case 0 -> System.out.println("Saindo...");
                    default -> System.out.println("Opção inválida!");
                }
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }
        } while (opcao != 0);
    }
    
    private void exibirMenu() {
        System.out.println("\n=== SISTEMA DE BIBLIOTECA ===");
        System.out.println("1 - Cadastrar Livro");
        System.out.println("2 - Listar Livros");
        System.out.println("3 - Pesquisar Livro");
        System.out.println("4 - Cadastrar Usuário");
        System.out.println("5 - Emprestar Livro");
        System.out.println("6 - Devolver Livro");
        System.out.println("7 - Listar Empréstimos");
        System.out.println("8 - Listar Usuários");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opção: ");
    }
    
    private void cadastrarLivro() {
        System.out.print("Tipo (1-Impresso, 2-Ebook): ");
        int tipo = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Título: ");
        String titulo = scanner.nextLine();
        System.out.print("Autor: ");
        String autor = scanner.nextLine();
        System.out.print("Ano: ");
        int ano = scanner.nextInt();
        
        if (tipo == 1) {
            System.out.print("Número de páginas: ");
            int paginas = scanner.nextInt();
            service.cadastrarLivro(new LivroImpresso(titulo, autor, ano, paginas));
        } else {
            System.out.print("Tamanho (MB): ");
            double tamanho = scanner.nextDouble();
            service.cadastrarLivro(new Ebook(titulo, autor, ano, tamanho));
        }
        System.out.println("Livro cadastrado com sucesso!");
    }
    
    private void listarLivros() {
        service.listarLivros().forEach(System.out::println);
    }

    private void listarUsuarios() {
        service.listarUsuarios().forEach(System.out::println);
    }

    private void pesquisarLivro() {
        System.out.print("Digite o termo de busca: ");
        String termo = scanner.nextLine();
        service.pesquisarLivro(termo).forEach(System.out::println);
    }
    
    private void cadastrarUsuario() {
        System.out.print("Tipo (1-Aluno, 2-Professor): ");
        int tipo = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Matrícula: ");
        String matricula = scanner.nextLine();
        
        if (tipo == 1) {
            System.out.print("Curso: ");
            String curso = scanner.nextLine();
            service.cadastrarUsuario(new Aluno(nome, matricula, curso));
        } else {
            System.out.print("Departamento: ");
            String departamento = scanner.nextLine();
            service.cadastrarUsuario(new Professor(nome, matricula, departamento));
        }
        System.out.println("Usuário cadastrado com sucesso!");
    }
    
    private void emprestarLivro() throws LivroNaoEncontradoException, LivroIndisponivelException {
        System.out.print("Título do livro: ");
        String titulo = scanner.nextLine();
        System.out.print("Matrícula do usuário: ");
        String matricula = scanner.nextLine();
        
        service.emprestarLivro(titulo, matricula);
        System.out.println("Empréstimo realizado com sucesso!");
    }
    
    private void devolverLivro() throws LivroNaoEncontradoException {
        System.out.print("Título do livro: ");
        String titulo = scanner.nextLine();
        
        service.devolverLivro(titulo);
        System.out.println("Devolução realizada com sucesso!");
    }
    
    private void listarEmprestimos() {
        service.listarEmprestimos().forEach(System.out::println);
    }
}