# 📘 Material de Estudo – Aula 01: Configuração do Ambiente e Fundamentos Java

## ☕ 1. História e Características do Java

### 📜 Histórico da Linguagem
- **1995:** Criada pela Sun Microsystems (James Gosling)
- **2010:** Oracle adquire a Sun Microsystems
- **Hoje:** Uma das linguagens mais populares do mundo

### 🌟 Características Principais
Java é uma linguagem de programação **orientada a objetos** com características únicas:

- **Portabilidade** → "Write once, run anywhere" (WORA)
- **Segurança** → Controle rigoroso de memória e acesso
- **Robustez** → Tratamento de erros e gerenciamento automático de memória
- **Simplicidade** → Sintaxe clara e organizada
- **Multithreading** → Suporte nativo para programação paralela

### 🎯 Onde Java é Usado?
- **Aplicações Enterprise** → Sistemas bancários, e-commerce
- **Desenvolvimento Android** → Apps móveis
- **Aplicações Web** → Servidores e APIs
- **Big Data** → Hadoop, Elasticsearch
- **Sistemas Embarcados** → IoT e dispositivos inteligentes

## 🔧 2. Ambiente de Desenvolvimento Java

### 🛠️ JDK (Java Development Kit)
**O que é:** Kit completo de desenvolvimento Java

**Contém:**
- Compilador Java (`javac`)
- Interpretador Java (`java`)
- Debugger (`jdb`)
- Documentação (`javadoc`)
- Bibliotecas padrão

**Quando usar:** Para desenvolver aplicações Java

### 📦 JRE (Java Runtime Environment)
**O que é:** Ambiente mínimo para executar aplicações Java

**Contém:**
- JVM (Java Virtual Machine)
- Bibliotecas essenciais
- Arquivos de suporte

**Quando usar:** Apenas para rodar aplicações Java prontas

### ⚙️ JVM (Java Virtual Machine)
**O que é:** Máquina virtual que executa bytecode Java

**Função:**
- Interpreta bytecode (arquivos `.class`)
- Gerencia memória automaticamente
- Fornece portabilidade entre sistemas operacionais

### 🔄 Fluxo de Compilação e Execução
```
Código Java (.java) → [javac] → Bytecode (.class) → [JVM] → Execução
```

👉 **Resumindo:**
- **JDK** → desenvolve (inclui JRE + ferramentas)
- **JRE** → executa (inclui JVM + bibliotecas)
- **JVM** → interpreta (executa bytecode)

### 💻 Instalação do Ambiente

#### Passo 1: Download do JDK
1. Acesse: https://www.oracle.com/java/technologies/downloads/
2. Baixe JDK 17+ (versão LTS recomendada)
3. Escolha a versão para seu sistema operacional

#### Passo 2: Instalação
- **Windows:** Execute o `.exe` e siga o assistente
- **Linux:** Use o gerenciador de pacotes ou `.tar.gz`
- **macOS:** Execute o `.dmg`

#### Passo 3: Configuração de Variáveis
```bash
# Windows (Variáveis de Ambiente)
JAVA_HOME = C:\Program Files\Java\jdk-17
PATH = %JAVA_HOME%\bin

# Linux/macOS (.bashrc ou .zshrc)
export JAVA_HOME=/usr/lib/jvm/java-17-openjdk
export PATH=$JAVA_HOME/bin:$PATH
```

#### Passo 4: Verificação
```bash
java -version    # Verifica JRE
javac -version   # Verifica JDK
```

## 🏗️ 3. Fundamentos de Programação Orientada a Objetos

### 🎯 O que é POO?
POO (Programação Orientada a Objetos) é um **paradigma de programação** que organiza o código em torno de **objetos** que interagem entre si.

### 🧩 Conceitos Fundamentais

#### 📋 Classe
**Definição:** Molde ou template para criar objetos
**Analogia:** Planta de uma casa (não é a casa, mas o projeto dela)

```java
// Classe = molde
class Livro {
    // Atributos = características
    String titulo;
    String autor;
    int ano;
    boolean disponivel;
    
    // Métodos = ações
    void emprestar() {
        disponivel = false;
    }
    
    void devolver() {
        disponivel = true;
    }
}
```

#### 🎭 Objeto
**Definição:** Instância de uma classe (a "casa" construída a partir da "planta")

```java
public class Main {
    public static void main(String[] args) {
        // Criando objetos (instâncias)
        Livro livro1 = new Livro();
        livro1.titulo = "Dom Casmurro";
        livro1.autor = "Machado de Assis";
        livro1.ano = 1899;
        livro1.disponivel = true;
        
        Livro livro2 = new Livro();
        livro2.titulo = "O Cortiço";
        livro2.autor = "Aluísio Azevedo";
        livro2.ano = 1890;
        livro2.disponivel = true;
        
        // Usando métodos
        livro1.emprestar();
        System.out.println(livro1.disponivel); // false
    }
}
```

#### 📊 Atributos (Propriedades)
**Definição:** Dados que descrevem o objeto
**Exemplos:**
- Livro: título, autor, ano, disponível
- Usuario: nome, matrícula, tipo
- Emprestimo: dataEmprestimo, dataDevolucao

#### ⚡ Métodos (Comportamentos)
**Definição:** Ações que o objeto pode realizar
**Exemplos:**
- Livro: emprestar(), devolver(), exibirInfo()
- Usuario: cadastrar(), atualizar(), validar()
- Emprestimo: calcularMulta(), renovar()

## 📝 4. Convenções e Estrutura de Pacotes Java

### 📝 Convenções de Nomenclatura Java

#### Classes
```java
// ✅ Correto: PascalCase (primeira letra maiúscula)
class Livro { }
class BibliotecaService { }
class LivroNaoEncontradoException { }

// ❌ Incorreto
class livro { }        // minúscula
class LIVRO { }        // maiúscula
class livro_impresso { } // snake_case
```

#### Métodos e Variáveis
```java
// ✅ Correto: camelCase (primeira letra minúscula)
String nomeCompleto;
int idadeUsuario;
void calcularMulta() { }
void verificarDisponibilidade() { }

// ❌ Incorreto
String NomeCompleto;     // PascalCase
int idade_usuario;       // snake_case
void CalcularMulta() { } // PascalCase
```

#### Constantes
```java
// ✅ Correto: UPPER_SNAKE_CASE
public static final int PRAZO_EMPRESTIMO = 7;
public static final String NOME_SISTEMA = "Biblioteca";
```

### 📁 Estrutura de Pacotes

#### Convenção de Pacotes
```java
// Formato: dominio.empresa.projeto.modulo
com.biblioteca.model     // Classes de modelo
com.biblioteca.service   // Lógica de negócio
com.biblioteca.view      // Interface do usuário
com.biblioteca.exception // Exceções personalizadas
com.biblioteca.util      // Utilitários
```

#### Criando a Estrutura do Projeto
```
src/
└── main/
    └── java/
        └── com/
            └── biblioteca/
                ├── model/
                │   ├── Livro.java
                │   ├── Usuario.java
                │   └── Emprestimo.java
                ├── service/
                │   └── BibliotecaService.java
                ├── view/
                │   └── MenuPrincipal.java
                ├── exception/
                │   ├── LivroNaoEncontradoException.java
                │   └── LivroIndisponivelException.java
                └── Main.java
```

### 🔄 Conversão de Tipos (Casting)

#### Conversão Implícita (Widening)
```java
int numero = 10;
double decimal = numero; // int → double (automático)
System.out.println(decimal); // 10.0
```

#### Conversão Explícita (Narrowing)
```java
double decimal = 10.7;
int numero = (int) decimal; // double → int (manual)
System.out.println(numero); // 10 (perde a parte decimal)
```

#### Conversão de Strings
```java
// String para número
String texto = "123";
int numero = Integer.parseInt(texto);
double decimal = Double.parseDouble("45.6");

// Número para String
int idade = 25;
String idadeTexto = String.valueOf(idade);
// ou
String idadeTexto2 = Integer.toString(idade);
```

## 🏛️ 5. Encapsulamento - Primeiro Pilar da POO

### 🔒 O que é Encapsulamento?
**Definição:** Ocultar os detalhes internos de uma classe e controlar o acesso aos dados através de métodos públicos.

**Analogia:** Como um carro - você não precisa saber como o motor funciona internamente, apenas usar o volante, pedais e câmbio.

### 🛡️ Modificadores de Acesso

```java
class Livro {
    // private: apenas a própria classe acessa
    private String titulo;
    private String autor;
    private int ano;
    private boolean disponivel;
    
    // public: qualquer classe pode acessar
    public Livro(String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.disponivel = true;
    }
    
    // Métodos públicos para acessar atributos privados
    public String getTitulo() {
        return titulo;
    }
    
    public void setTitulo(String titulo) {
        if (titulo != null && !titulo.trim().isEmpty()) {
            this.titulo = titulo;
        }
    }
    
    public boolean isDisponivel() {
        return disponivel;
    }
    
    public void emprestar() {
        if (disponivel) {
            disponivel = false;
        }
    }
    
    public void devolver() {
        disponivel = true;
    }
}
```

### ✅ Vantagens do Encapsulamento
1. **Controle de Acesso:** Validações nos setters
2. **Manutenibilidade:** Mudanças internas não afetam outras classes
3. **Segurança:** Dados protegidos contra alterações indevidas
4. **Flexibilidade:** Pode mudar implementação sem quebrar código externo

## 🧩 6. Outros Pilares da POO (Visão Geral)

### 🎭 Abstração
**Conceito:** Mostrar apenas o essencial, esconder complexidade
**Aplicação:** Classes abstratas e interfaces

```java
// Será implementado nas próximas aulas
abstract class Usuario {
    protected String nome;
    protected String matricula;
    
    // Método que cada tipo de usuário implementa diferente
    public abstract String getTipoUsuario();
}
```

### 👨👩👧👦 Herança
**Conceito:** Reutilizar código criando hierarquias
**Aplicação:** Especialização de classes

```java
// Será implementado nas próximas aulas
class Livro {
    // Atributos e métodos comuns
}

class LivroImpresso extends Livro {
    private int numeroPaginas;
}

class Ebook extends Livro {
    private double tamanhoMB;
}
```

### 🔀 Polimorfismo
**Conceito:** Mesma interface, comportamentos diferentes
**Aplicação:** Métodos sobrescritos

```java
// Será implementado nas próximas aulas
class Aluno extends Usuario {
    @Override
    public String getTipoUsuario() {
        return "Aluno";
    }
}

class Professor extends Usuario {
    @Override
    public String getTipoUsuario() {
        return "Professor";
    }
}
```

## 🛠️ 7. Implementação Prática - Primeiras Classes do Projeto

### 📚 Classe Livro Completa

```java
package com.biblioteca.model;

public class Livro {
    // Atributos privados (encapsulamento)
    private String titulo;
    private String autor;
    private int ano;
    private boolean disponivel;
    
    // Construtor
    public Livro(String titulo, String autor, int ano) {
        setTitulo(titulo);
        setAutor(autor);
        setAno(ano);
        this.disponivel = true; // Livro sempre inicia disponível
    }
    
    // Getters
    public String getTitulo() {
        return titulo;
    }
    
    public String getAutor() {
        return autor;
    }
    
    public int getAno() {
        return ano;
    }
    
    public boolean isDisponivel() {
        return disponivel;
    }
    
    // Setters com validação
    public void setTitulo(String titulo) {
        if (titulo != null && !titulo.trim().isEmpty()) {
            this.titulo = titulo.trim();
        } else {
            throw new IllegalArgumentException("Título não pode ser vazio");
        }
    }
    
    public void setAutor(String autor) {
        if (autor != null && !autor.trim().isEmpty()) {
            this.autor = autor.trim();
        } else {
            throw new IllegalArgumentException("Autor não pode ser vazio");
        }
    }
    
    public void setAno(int ano) {
        if (ano > 0 && ano <= java.time.Year.now().getValue()) {
            this.ano = ano;
        } else {
            throw new IllegalArgumentException("Ano inválido");
        }
    }
    
    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
    
    // Métodos de negócio
    public void emprestar() {
        if (disponivel) {
            disponivel = false;
        } else {
            throw new IllegalStateException("Livro já está emprestado");
        }
    }
    
    public void devolver() {
        disponivel = true;
    }
    
    // Método toString para exibição
    @Override
    public String toString() {
        return String.format("Livro{titulo='%s', autor='%s', ano=%d, disponivel=%s}",
                           titulo, autor, ano, disponivel ? "Sim" : "Não");
    }
}
```

### 👤 Classe Usuario Completa

```java
package com.biblioteca.model;

public class Usuario {
    private String nome;
    private String matricula;
    
    // Construtor
    public Usuario(String nome, String matricula) {
        setNome(nome);
        setMatricula(matricula);
    }
    
    // Getters
    public String getNome() {
        return nome;
    }
    
    public String getMatricula() {
        return matricula;
    }
    
    // Setters com validação
    public void setNome(String nome) {
        if (nome != null && nome.trim().length() >= 2) {
            this.nome = nome.trim();
        } else {
            throw new IllegalArgumentException("Nome deve ter pelo menos 2 caracteres");
        }
    }
    
    public void setMatricula(String matricula) {
        if (matricula != null && matricula.matches("\\d{6,}")) {
            this.matricula = matricula;
        } else {
            throw new IllegalArgumentException("Matrícula deve ter pelo menos 6 dígitos numéricos");
        }
    }
    
    @Override
    public String toString() {
        return String.format("Usuario{nome='%s', matricula='%s'}", nome, matricula);
    }
}
```

### 🧪 Testando as Classes

```java
package com.biblioteca;

import com.biblioteca.model.Livro;
import com.biblioteca.model.Usuario;

public class Main {
    public static void main(String[] args) {
        // Testando classe Livro
        Livro livro1 = new Livro("Dom Casmurro", "Machado de Assis", 1899);
        System.out.println(livro1);
        
        // Testando empréstimo
        livro1.emprestar();
        System.out.println("Após empréstimo: " + livro1.isDisponivel());
        
        // Testando devolução
        livro1.devolver();
        System.out.println("Após devolução: " + livro1.isDisponivel());
        
        // Testando classe Usuario
        Usuario usuario1 = new Usuario("Maria Silva", "202401");
        System.out.println(usuario1);
    }
}
```

## 📌 Resumo da Aula 01

### ✅ O que Aprendemos
1. **História e Características do Java**
   - Linguagem portátil e robusta
   - "Write once, run anywhere"
   - Aplicações em diversos domínios

2. **Ambiente de Desenvolvimento**
   - JDK: Kit de desenvolvimento completo
   - JRE: Ambiente de execução
   - JVM: Máquina virtual Java
   - Instalação e configuração

3. **Fundamentos de POO**
   - Classes como moldes
   - Objetos como instâncias
   - Atributos e métodos
   - Encapsulamento com modificadores de acesso

4. **Convenções Java**
   - Nomenclatura de classes, métodos e variáveis
   - Estrutura de pacotes
   - Boas práticas de organização

5. **Implementação Prática**
   - Classe Livro com encapsulamento
   - Classe Usuario com validações
   - Estrutura do projeto biblioteca

### 🎯 Próxima Aula
Na **Aula 02**, vamos aprofundar:
- Construtores sobrecarregados
- Relacionamentos entre objetos
- Métodos de validação mais robustos
- Debugging e análise de objetos

### 🏠 Exercício para Casa
Crie uma terceira classe `Biblioteca` que:
1. Tenha uma lista de livros
2. Tenha uma lista de usuários
3. Possua métodos para adicionar livros e usuários
4. Implemente um método para listar todos os livros disponíveis

### 📚 Material Complementar
- [Documentação Oracle Java](https://docs.oracle.com/en/java/)
- [Java Tutorials](https://docs.oracle.com/javase/tutorial/)
- [Convenções de Código Java](https://www.oracle.com/java/technologies/javase/codeconventions-contents.html)