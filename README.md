# 📚 Sistema de Biblioteca - Java

Sistema de gerenciamento de biblioteca desenvolvido em Java aplicando conceitos de Programação Orientada a Objetos (POO).

## 🎯 Objetivo

Desenvolver um sistema completo para gerenciar livros, usuários e empréstimos em uma biblioteca, demonstrando a aplicação prática de:
- Classes e Objetos
- Herança e Polimorfismo
- Encapsulamento
- Tratamento de Exceções
- APIs Java (LocalDate)
- Estruturas de Dados (ArrayList)

## 🏗️ Arquitetura do Sistema

### Estrutura de Pacotes
```
com.biblioteca/
├── model/          # Modelos de dados
├── service/        # Lógica de negócio
├── view/           # Interface do usuário
├── exception/      # Exceções personalizadas
└── Main.java       # Classe principal
```

### Diagrama de Classes

#### Hierarquia de Livros
```
Livro (classe base)
├── LivroImpresso (herda de Livro)
└── Ebook (herda de Livro)
```

#### Hierarquia de Usuários
```
Usuario (classe abstrata)
├── Aluno (herda de Usuario)
└── Professor (herda de Usuario)
```

## 📋 Funcionalidades

### 📖 Gerenciamento de Livros
- ✅ Cadastrar livros (impressos e digitais)
- ✅ Listar todos os livros
- ✅ Pesquisar por título ou autor
- ✅ Controlar disponibilidade

### 👥 Gerenciamento de Usuários
- ✅ Cadastrar alunos e professores
- ✅ Listar usuários cadastrados
- ✅ Diferenciação por tipo (curso/departamento)

### 📅 Sistema de Empréstimos
- ✅ Registrar empréstimos
- ✅ Calcular data de devolução (+7 dias)
- ✅ Processar devoluções
- ✅ Histórico completo de empréstimos

### ⚠️ Tratamento de Erros
- ✅ Livro não encontrado
- ✅ Livro indisponível
- ✅ Usuário não encontrado

## 🔧 Tecnologias Utilizadas

- **Java 17+**
- **java.util** - Collections (ArrayList)
- **java.time** - Manipulação de datas (LocalDate)
- **java.util.stream** - Operações funcionais

## 🚀 Como Executar

### Pré-requisitos
- Java JDK 17 ou superior instalado
- Terminal/Prompt de comando

### Compilação
```bash
# Navegar para o diretório do projeto
cd projeto-escola-proficional

# Compilar todas as classes
javac -cp . src\main\java\com\biblioteca\*.java src\main\java\com\biblioteca\model\*.java src\main\java\com\biblioteca\service\*.java src\main\java\com\biblioteca\view\*.java src\main\java\com\biblioteca\exception\*.java

# Executar o sistema
cd src\main\java
java com.biblioteca.Main
```

## 📱 Interface do Sistema

### Menu Principal
```
=== SISTEMA DE BIBLIOTECA ===
1 - Cadastrar Livro
2 - Listar Livros
3 - Pesquisar Livro
4 - Cadastrar Usuário
5 - Emprestar Livro
6 - Devolver Livro
7 - Listar Empréstimos
0 - Sair
```

## 💡 Conceitos de POO Aplicados

### 1. **Encapsulamento**
- Atributos privados com getters/setters
- Controle de acesso aos dados

### 2. **Herança**
- `LivroImpresso` e `Ebook` herdam de `Livro`
- `Aluno` e `Professor` herdam de `Usuario`

### 3. **Polimorfismo**
- Método `toString()` sobrescrito em todas as classes
- Comportamento específico para cada tipo

### 4. **Abstração**
- Classe `Usuario` abstrata
- Interface comum para diferentes tipos de usuários

## 🗂️ Estrutura de Dados

### Classe Livro
```java
- titulo: String
- autor: String
- ano: int
- disponivel: boolean
```

### Classe Usuario
```java
- nome: String
- matricula: String
```

### Classe Emprestimo
```java
- livro: Livro
- usuario: Usuario
- dataEmprestimo: LocalDate
- dataDevolucaoPrevista: LocalDate
- dataDevolucaoReal: LocalDate
```

## 🔍 Regras de Negócio

1. **Empréstimos**
   - Livro deve estar disponível
   - Prazo padrão: 7 dias
   - Um livro por vez por empréstimo

2. **Usuários**
   - Matrícula única por usuário
   - Alunos têm curso associado
   - Professores têm departamento associado

3. **Livros**
   - Podem ser impressos ou digitais
   - Status de disponibilidade automático
   - Busca por título ou autor

## 🧪 Exemplo de Uso

### Cadastrar um Livro Impresso
```
1 - Cadastrar Livro
Tipo (1-Impresso, 2-Ebook): 1
Título: Dom Casmurro
Autor: Machado de Assis
Ano: 1899
Número de páginas: 256
```

### Realizar um Empréstimo
```
5 - Emprestar Livro
Título do livro: Dom Casmurro
Matrícula do usuário: 2024001
```

## 🔮 Próximas Implementações

- [ ] Interface gráfica (JavaFX/Swing)
- [ ] Persistência em banco de dados
- [ ] Sistema de multas por atraso
- [ ] Notificações automáticas (Threads)
- [ ] Relatórios de empréstimos
- [ ] API REST

## 👨‍💻 Desenvolvedor

Projeto desenvolvido como parte do aprendizado de Programação Orientada a Objetos em Java.

---

**Versão:** 1.0  
**Data:** 2024  
**Linguagem:** Java 17+