# PLANO DE TRABALHO DOCENTE 

## MODELO PEDAGÓGICO SENAC 

**Curso:** Técnico em Desenvolvimento de Sistemas  
**Carga Horária Total:** 36 horas  
**Carga Horária da UC:** 36 horas  

**Docente:** Jeremias O Nunes  

---

## PLANO DE AULA – Arquitetura em Camadas e Lógica de Negócio

📌 **Disciplina:** Desenvolver programas orientados a objetos em linguagem Java  
👨🏫 **Mentor(a):** Jeremias O Nunes  
📆 **Data:** Aula nº 10  
⏰ **Duração:** 3 horas (180 minutos)  

---

## 📖 Planejamento

### 📌 Conteúdo Formativo
- Arquitetura em camadas: apresentação, negócio, dados  
- Princípios SOLID: conceitos e aplicação prática  
- Coesão vs acoplamento: métricas de qualidade de código  
- Padrões de design e organização de código  
- Refatoração e melhoria contínua de código  

### 🎯 Objetivo Geral
Estruturar o sistema em camadas bem definidas, concentrando a lógica de negócio em uma camada de serviço especializada.

### 💡 Habilidades e Competências
✅ Aplicar arquitetura em camadas profissionalmente  
✅ Implementar princípios SOLID no design de classes  
✅ Desenvolver código com alta coesão e baixo acoplamento  
✅ Refatorar código para melhorar qualidade e manutenibilidade  

### 📌 Materiais Necessários
📌 Sistema com exceções implementadas da aula anterior  
📌 Documentação sobre princípios SOLID  
📌 IDE com ferramentas de refatoração  

---

## 🎓 Estratégias de Ensino e Aprendizagem

### Introdução e Contextualização (15min)
**Metodologia Ativa - Análise de Sistemas:**  
Discussão sobre problemas de manutenibilidade em sistemas mal estruturados e benefícios da arquitetura em camadas.

---

### **Tópico 1: Arquitetura em Camadas (20min)**
#### 📌 Demonstração Prática:
**Metodologia Ativa - Aula Expositiva Dialogada:**  
Arquitetura em camadas: apresentação (view), negócio (service), dados (model) - responsabilidades e benefícios.

#### 📌 Atividade Prática 1:
🎯 **Objetivo:** Compreender separação de responsabilidades  
📝 **Tarefa:**  
- **Metodologia Ativa - Mapeamento Arquitetural:**  
Análise do código atual e identificação de responsabilidades misturadas

**Parte do Projeto Construída:** Diagnóstico arquitetural do sistema

---

### **Tópico 2: Princípios SOLID (17min)**
#### 📌 Demonstração Prática:
**Metodologia Ativa - Exemplificação Prática:**  
Princípios SOLID: Single Responsibility, Open/Closed, Liskov Substitution, Interface Segregation, Dependency Inversion.

#### 📌 Atividade Prática 2:
🎯 **Objetivo:** Identificar violações dos princípios SOLID  
📝 **Tarefa:**  
- **Metodologia Ativa - Code Review:**  
Análise do código existente identificando violações dos princípios SOLID

**Parte do Projeto Construída:** Lista de melhorias baseadas em SOLID

---

### **Tópico 3: Coesão vs Acoplamento (17min)**
#### 📌 Demonstração Prática:
**Metodologia Ativa - Comparação de Códigos:**  
Demonstração de alta vs baixa coesão, forte vs fraco acoplamento com exemplos práticos.

#### 📌 Atividade Prática 3:
🎯 **Objetivo:** Avaliar qualidade do código atual  
📝 **Tarefa:**  
- **Metodologia Ativa - Análise Métrica:**  
Avaliação de coesão e acoplamento nas classes existentes

**Parte do Projeto Construída:** Métricas de qualidade identificadas

---

### **Tópico 4: Criação da BibliotecaService (30min)**
#### 📌 Demonstração Prática:
**Metodologia Ativa - Live Coding:**  
Criação da classe BibliotecaService como centralizadora de toda lógica de negócio.

#### 📌 Atividade Prática 4:
🎯 **Objetivo:** Implementar camada de serviço  
📝 **Tarefa:**  
- **Metodologia Ativa - Desenvolvimento Guiado:**  
Criação da classe BibliotecaService com estrutura básica e dependências

**Parte do Projeto Construída:** Camada de serviço estruturada

---

### **Tópico 5: Métodos Especializados (30min)**
#### 📌 Demonstração Prática:
**Metodologia Ativa - Refatoração Incremental:**  
Migração de métodos CRUD para BibliotecaService: cadastrarLivro, pesquisarLivro, emprestarLivro, devolverLivro.

#### 📌 Atividade Prática 5:
🎯 **Objetivo:** Centralizar lógica de negócio  
📝 **Tarefa:**  
- **Metodologia Ativa - Pair Programming:**  
Implementação de métodos especializados na camada de serviço

**Parte do Projeto Construída:** Lógica de negócio centralizada

---

### **Tópico 6: Aplicação dos Princípios SOLID (33min)**
#### 📌 Demonstração Prática:
**Metodologia Ativa - Refatoração Orientada:**  
Aplicação prática dos princípios SOLID no design das classes refatoradas.

#### 📌 Atividade Prática 6:
🎯 **Objetivo:** Aplicar princípios SOLID  
📝 **Tarefa:**  
- **Metodologia Ativa - TDD (Test-Driven Development):**  
Refatoração das classes aplicando cada princípio SOLID sistematicamente

**Parte do Projeto Construída:** Classes aderentes aos princípios SOLID

---

### **Tópico 7: Validações e Controle de Fluxo (33min)**
#### 📌 Demonstração Prática:
**Metodologia Ativa - Desenvolvimento Incremental:**  
Implementação de validações de negócio e controle de fluxo na camada de serviço.

#### 📌 Atividade Prática 7:
🎯 **Objetivo:** Implementar regras de negócio robustas  
📝 **Tarefa:**  
- **Metodologia Ativa - Programação Defensiva:**  
Desenvolvimento de validações complexas e controle de fluxo de empréstimos

**Parte do Projeto Construída:** Sistema com arquitetura profissional

---

### Encerramento e Reflexão (15min)
#### 📌 Discussão em grupo:
**Metodologia Ativa - Retrospectiva Arquitetural:**  
Análise das melhorias obtidas com a nova arquitetura e impacto na manutenibilidade.

#### 📌 Desafio para a próxima aula:
**Metodologia Ativa - Desafio de Usabilidade:**  
Pensar em como criar uma interface de usuário intuitiva que utilize a camada de serviço.

---

### 📌 Objetos de Aprendizagem
📝 **Materiais Didáticos Utilizados:**  
- Documentação sobre princípios SOLID  
- Código refatorado com arquitetura em camadas  
- Exemplos de boas práticas arquiteturais  

---

## 🎯 Avaliação

### **Avaliação Formativa (Durante a aula):**
✅ Compreensão dos conceitos de arquitetura em camadas  
✅ Qualidade da implementação da BibliotecaService  
✅ Aplicação adequada dos princípios SOLID  
✅ Melhoria na coesão e redução do acoplamento  

### **Avaliação Somativa (Entregáveis):**
✅ Classe BibliotecaService com lógica de negócio centralizada  
✅ Sistema refatorado seguindo princípios SOLID  
✅ Arquitetura em camadas bem definida e funcional  

### **Critérios de Qualidade:**
- **Excelente (9-10):** Arquitetura bem estruturada, SOLID aplicado corretamente, alta coesão e baixo acoplamento  
- **Bom (7-8):** Implementação funcional com boa aplicação dos conceitos arquiteturais  
- **Satisfatório (6-7):** Conceitos aplicados com orientação, estrutura básica implementada  
- **Insatisfatório (<6):** Dificuldades na compreensão ou aplicação dos princípios arquiteturais  

---

## 🎓 Conclusão

### **Aprendizado Esperado:**
🎯 **Conhecimento Técnico:**  
- Domínio de arquitetura em camadas  
- Compreensão profunda dos princípios SOLID  
- Conhecimento de métricas de qualidade de código  

🎯 **Aplicação Prática:**  
- Sistema bem estruturado e manutenível  
- Código com alta qualidade e baixo acoplamento  
- Arquitetura profissional e escalável  

🎯 **Competências Profissionais:**  
- Design de software de qualidade  
- Aplicação de padrões arquiteturais  
- Capacidade de refatoração e melhoria contínua  

### **Conexão com o Projeto:**  
Esta aula eleva o Sistema de Biblioteca ao nível de software profissional, com arquitetura bem definida que facilita manutenção, extensão e colaboração em equipe.

### **Preparação para Próxima Aula:**  
Com arquitetura sólida implementada, o sistema estará pronto para receber uma interface de usuário profissional que aproveite toda a robustez da camada de serviço.