# PLANO DE TRABALHO DOCENTE 

## MODELO PEDAGÓGICO SENAC 

**Curso:** Técnico em Desenvolvimento de Sistemas  
**Carga Horária Total:** 36 horas  
**Carga Horária da UC:** 36 horas  

**Docente:** Jeremias O Nunes  

---

## PLANO DE AULA – Collections e Estruturas de Dados

📌 **Disciplina:** Desenvolver programas orientados a objetos em linguagem Java  
👨🏫 **Mentor(a):** Jeremias O Nunes  
📆 **Data:** Aula nº 05  
⏰ **Duração:** 3 horas (180 minutos)  

---

## 📖 Planejamento

### 📌 Conteúdo Formativo
- Collections Framework: hierarquia e principais interfaces  
- ArrayList vs LinkedList: características e performance  
- Conceitos de generics e type safety  
- Operações CRUD com Collections  
- Streams API para pesquisa e filtragem  

### 🎯 Objetivo Geral
Implementar estruturas de dados eficientes utilizando Collections Framework para gerenciamento de dados do sistema.

### 💡 Habilidades e Competências
✅ Utilizar Collections Framework adequadamente  
✅ Implementar operações CRUD com ArrayList  
✅ Aplicar conceitos de generics e type safety  
✅ Desenvolver métodos de busca e filtragem  

### 📌 Materiais Necessários
📌 Hierarquias de classes das aulas anteriores  
📌 Documentação do Collections Framework  
📌 IDE configurada com projeto biblioteca  

---

## 🎓 Estratégias de Ensino e Aprendizagem

### Introdução e Contextualização (15min)
**Metodologia Ativa - Problematização:**  
Discussão sobre limitações de arrays tradicionais e necessidade de estruturas dinâmicas para gerenciar múltiplos livros e usuários.

---

### **Tópico 1: Collections Framework Fundamentos (20min)**
#### 📌 Demonstração Prática:
**Metodologia Ativa - Aula Expositiva Dialogada:**  
Collections Framework: hierarquia, interfaces List, Set, Map e suas implementações principais.

#### 📌 Atividade Prática 1:
🎯 **Objetivo:** Compreender a hierarquia do Collections Framework  
📝 **Tarefa:**  
- **Metodologia Ativa - Mapeamento Conceitual:**  
Criação de diagrama das principais interfaces e classes do framework

**Parte do Projeto Construída:** Base conceitual para escolha de Collections

---

### **Tópico 2: ArrayList vs LinkedList (17min)**
#### 📌 Demonstração Prática:
**Metodologia Ativa - Comparação Prática:**  
Demonstração das diferenças de performance entre ArrayList e LinkedList em operações básicas.

#### 📌 Atividade Prática 2:
🎯 **Objetivo:** Analisar performance de diferentes Collections  
📝 **Tarefa:**  
- **Metodologia Ativa - Experimentação:**  
Testes de performance com inserção, busca e remoção em ArrayList vs LinkedList

**Parte do Projeto Construída:** Conhecimento para escolha adequada de Collection

---

### **Tópico 3: Generics e Type Safety (17min)**
#### 📌 Demonstração Prática:
**Metodologia Ativa - Live Coding:**  
Implementação de ArrayList com e sem generics, demonstrando vantagens do type safety.

#### 📌 Atividade Prática 3:
🎯 **Objetivo:** Aplicar generics corretamente  
📝 **Tarefa:**  
- **Metodologia Ativa - Refatoração Guiada:**  
Conversão de código sem generics para versão type-safe

**Parte do Projeto Construída:** Código type-safe implementado

---

### **Tópico 4: Implementação de ArrayList para Livros (35min)**
#### 📌 Demonstração Prática:
**Metodologia Ativa - Desenvolvimento Incremental:**  
Criação de ArrayList<Livro> e implementação de operações básicas de manipulação.

#### 📌 Atividade Prática 4:
🎯 **Objetivo:** Implementar armazenamento de livros  
📝 **Tarefa:**  
- **Metodologia Ativa - Hands-on Development:**  
Criação de ArrayList<Livro> com métodos add, remove, get e size

**Parte do Projeto Construída:** Sistema de armazenamento de livros funcional

---

### **Tópico 5: Operações CRUD Completas (35min)**
#### 📌 Demonstração Prática:
**Metodologia Ativa - TDD (Test-Driven Development):**  
Implementação sistemática de Create, Read, Update, Delete para livros.

#### 📌 Atividade Prática 5:
🎯 **Objetivo:** Desenvolver CRUD completo  
📝 **Tarefa:**  
- **Metodologia Ativa - Pair Programming:**  
Implementação de métodos cadastrarLivro(), listarLivros(), atualizarLivro(), removerLivro()

**Parte do Projeto Construída:** CRUD funcional para livros

---

### **Tópico 6: Streams API e Pesquisa (35min)**
#### 📌 Demonstração Prática:
**Metodologia Ativa - Demonstração Interativa:**  
Introdução à Streams API com operações filter, map e collect.

#### 📌 Atividade Prática 6:
🎯 **Objetivo:** Implementar busca avançada  
📝 **Tarefa:**  
- **Metodologia Ativa - Resolução de Problemas:**  
Criação de métodos pesquisarPorTitulo(), pesquisarPorAutor(), filtrarDisponiveis()

**Parte do Projeto Construída:** Sistema de busca e filtragem implementado

---

### **Tópico 7: ArrayList para Usuários (21min)**
#### 📌 Demonstração Prática:
**Metodologia Ativa - Extensão de Conceitos:**  
Aplicação dos mesmos conceitos para gerenciamento de usuários polimórficos.

#### 📌 Atividade Prática 7:
🎯 **Objetivo:** Implementar gerenciamento de usuários  
📝 **Tarefa:**  
- **Metodologia Ativa - Aplicação Prática:**  
Criação de ArrayList<Usuario> com CRUD para Aluno e Professor

**Parte do Projeto Construída:** Sistema completo de gerenciamento de usuários

---

### Encerramento e Reflexão (15min)
#### 📌 Discussão em grupo:
**Metodologia Ativa - Retrospectiva Técnica:**  
Análise das vantagens das Collections e impacto na escalabilidade do sistema.

#### 📌 Desafio para a próxima aula:
**Metodologia Ativa - Desafio Prático:**  
Pensar em como otimizar ainda mais as operações de busca com diferentes estratégias.

---

### 📌 Objetos de Aprendizagem
📝 **Materiais Didáticos Utilizados:**  
- Documentação oficial do Collections Framework  
- Código implementado com CRUD funcional  
- Exemplos de uso de Streams API  

---

## 🎯 Avaliação

### **Avaliação Formativa (Durante a aula):**
✅ Compreensão do Collections Framework e suas interfaces  
✅ Uso correto de generics para type safety  
✅ Qualidade das implementações CRUD  
✅ Aplicação adequada de Streams API para busca  

### **Avaliação Somativa (Entregáveis):**
✅ ArrayList<Livro> com operações CRUD completas  
✅ ArrayList<Usuario> com polimorfismo funcional  
✅ Métodos de busca e filtragem implementados com Streams  

### **Critérios de Qualidade:**
- **Excelente (9-10):** Collections implementadas corretamente, CRUD eficiente, Streams aplicadas adequadamente  
- **Bom (7-8):** Implementação funcional com boa compreensão dos conceitos  
- **Satisfatório (6-7):** Conceitos aplicados com orientação, funcionalidades básicas implementadas  
- **Insatisfatório (<6):** Dificuldades na compreensão ou implementação de Collections  

---

## 🎓 Conclusão

### **Aprendizado Esperado:**
🎯 **Conhecimento Técnico:**  
- Domínio do Collections Framework Java  
- Compreensão de generics e type safety  
- Conhecimento de Streams API básica  

🎯 **Aplicação Prática:**  
- Sistema de armazenamento dinâmico e eficiente  
- Operações CRUD completas e funcionais  
- Capacidades de busca e filtragem avançadas  

🎯 **Competências Profissionais:**  
- Escolha adequada de estruturas de dados  
- Desenvolvimento de sistemas escaláveis  
- Aplicação de APIs modernas do Java  

### **Conexão com o Projeto:**  
Esta aula transforma o Sistema de Biblioteca em uma aplicação capaz de gerenciar múltiplos livros e usuários dinamicamente, com operações eficientes de busca e manipulação de dados.

### **Preparação para Próxima Aula:**  
Com Collections implementadas, o sistema estará pronto para operações mais específicas de gerenciamento de dados e implementação de funcionalidades de CRUD mais robustas.