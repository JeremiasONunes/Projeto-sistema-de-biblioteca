# PLANO DE TRABALHO DOCENTE 

## MODELO PEDAGÓGICO SENAC 

**Curso:** Técnico em Desenvolvimento de Sistemas  
**Carga Horária Total:** 36 horas  
**Carga Horária da UC:** 36 horas  

**Docente:** Jeremias O Nunes  

---

## PLANO DE AULA – Tratamento de Exceções e Robustez

📌 **Disciplina:** Desenvolver programas orientados a objetos em linguagem Java  
👨🏫 **Mentor(a):** Jeremias O Nunes  
📆 **Data:** Aula nº 09  
⏰ **Duração:** 3 horas (180 minutos)  

---

## 📖 Planejamento

### 📌 Conteúdo Formativo
- Hierarquia de exceções em Java: checked vs unchecked  
- Boas práticas no tratamento de exceções  
- Stack traces: leitura e interpretação  
- Exceções personalizadas para o domínio da aplicação  
- Programação defensiva e validação de dados  

### 🎯 Objetivo Geral
Desenvolver sistema robusto de tratamento de erros utilizando exceções personalizadas e boas práticas de programação defensiva.

### 💡 Habilidades e Competências
✅ Implementar tratamento robusto de exceções  
✅ Criar exceções personalizadas adequadas  
✅ Aplicar programação defensiva eficientemente  
✅ Interpretar e debugar stack traces  

### 📌 Materiais Necessários
📌 Sistema de empréstimos da aula anterior  
📌 Documentação sobre exceções Java  
📌 IDE com ferramentas de debugging  

---

## 🎓 Estratégias de Ensino e Aprendizagem

### Introdução e Contextualização (15min)
**Metodologia Ativa - Análise de Problemas:**  
Discussão sobre erros comuns em sistemas e impacto de falhas não tratadas na experiência do usuário.

---

### **Tópico 1: Hierarquia de Exceções Java (20min)**
#### 📌 Demonstração Prática:
**Metodologia Ativa - Aula Expositiva Dialogada:**  
Hierarquia de exceções: Throwable, Error, Exception, RuntimeException - diferenças entre checked e unchecked.

#### 📌 Atividade Prática 1:
🎯 **Objetivo:** Compreender tipos de exceções  
📝 **Tarefa:**  
- **Metodologia Ativa - Mapeamento Conceitual:**  
Criação de diagrama da hierarquia de exceções com exemplos práticos

**Parte do Projeto Construída:** Base conceitual de exceções

---

### **Tópico 2: Boas Práticas em Exceções (17min)**
#### 📌 Demonstração Prática:
**Metodologia Ativa - Comparação de Códigos:**  
Demonstração de boas vs más práticas: mensagens claras, não ignorar exceções, finally vs try-with-resources.

#### 📌 Atividade Prática 2:
🎯 **Objetivo:** Identificar boas práticas  
📝 **Tarefa:**  
- **Metodologia Ativa - Code Review:**  
Análise de códigos com diferentes abordagens de tratamento de exceções

**Parte do Projeto Construída:** Checklist de boas práticas

---

### **Tópico 3: Stack Traces e Debugging (17min)**
#### 📌 Demonstração Prática:
**Metodologia Ativa - Demonstração Interativa:**  
Leitura e interpretação de stack traces, uso de ferramentas de debugging da IDE.

#### 📌 Atividade Prática 3:
🎯 **Objetivo:** Dominar análise de stack traces  
📝 **Tarefa:**  
- **Metodologia Ativa - Investigação Guiada:**  
Análise de diferentes tipos de stack traces e identificação de causas raiz

**Parte do Projeto Construída:** Habilidades de debugging avançadas

---

### **Tópico 4: Exceções Personalizadas (30min)**
#### 📌 Demonstração Prática:
**Metodologia Ativa - Live Coding:**  
Criação de LivroNaoEncontradoException e LivroIndisponivelException com mensagens específicas.

#### 📌 Atividade Prática 4:
🎯 **Objetivo:** Criar exceções do domínio  
📝 **Tarefa:**  
- **Metodologia Ativa - Desenvolvimento Guiado:**  
Implementação de exceções personalizadas para diferentes cenários de erro

**Parte do Projeto Construída:** Exceções personalizadas funcionais

---

### **Tópico 5: Try-Catch-Finally em Métodos Críticos (30min)**
#### 📌 Demonstração Prática:
**Metodologia Ativa - Refatoração Guiada:**  
Implementação de try-catch-finally nos métodos de empréstimo e devolução.

#### 📌 Atividade Prática 5:
🎯 **Objetivo:** Implementar tratamento robusto  
📝 **Tarefa:**  
- **Metodologia Ativa - Pair Programming:**  
Adição de tratamento de exceções em métodos críticos do sistema

**Parte do Projeto Construída:** Métodos críticos com tratamento robusto

---

### **Tópico 6: Validação de Dados e Feedback (33min)**
#### 📌 Demonstração Prática:
**Metodologia Ativa - Programação Defensiva:**  
Implementação de validações de entrada com mensagens claras para o usuário.

#### 📌 Atividade Prática 6:
🎯 **Objetivo:** Desenvolver validações robustas  
📝 **Tarefa:**  
- **Metodologia Ativa - TDD (Test-Driven Development):**  
Criação de validações para dados de entrada com feedback informativo

**Parte do Projeto Construída:** Sistema de validação completo

---

### **Tópico 7: Logs e Mensagens Informativas (33min)**
#### 📌 Demonstração Prática:
**Metodologia Ativa - Desenvolvimento Incremental:**  
Implementação de sistema de logs e mensagens de erro amigáveis ao usuário.

#### 📌 Atividade Prática 7:
🎯 **Objetivo:** Implementar logging e feedback  
📝 **Tarefa:**  
- **Metodologia Ativa - Desenvolvimento Colaborativo:**  
Criação de sistema de logs e mensagens de erro contextualizadas

**Parte do Projeto Construída:** Sistema de logging e feedback completo

---

### Encerramento e Reflexão (15min)
#### 📌 Discussão em grupo:
**Metodologia Ativa - Avaliação de Robustez:**  
Análise da robustez do sistema após implementação do tratamento de exceções.

#### 📌 Desafio para a próxima aula:
**Metodologia Ativa - Desafio Arquitetural:**  
Pensar em como organizar o código em camadas para melhor manutenibilidade.

---

### 📌 Objetos de Aprendizagem
📝 **Materiais Didáticos Utilizados:**  
- Documentação sobre exceções Java  
- Código com exceções personalizadas implementadas  
- Exemplos de stack traces e debugging  

---

## 🎯 Avaliação

### **Avaliação Formativa (Durante a aula):**
✅ Compreensão da hierarquia de exceções Java  
✅ Qualidade das exceções personalizadas criadas  
✅ Aplicação adequada de try-catch-finally  
✅ Eficácia das validações e mensagens de erro  

### **Avaliação Somativa (Entregáveis):**
✅ Exceções personalizadas LivroNaoEncontradoException e LivroIndisponivelException  
✅ Métodos críticos com tratamento robusto de exceções  
✅ Sistema de validação e feedback implementado  

### **Critérios de Qualidade:**
- **Excelente (9-10):** Exceções bem estruturadas, tratamento robusto, mensagens claras e logging eficaz  
- **Bom (7-8):** Implementação funcional com boa aplicação de boas práticas  
- **Satisfatório (6-7):** Conceitos aplicados com orientação, tratamento básico implementado  
- **Insatisfatório (<6):** Dificuldades na compreensão ou implementação de exceções  

---

## 🎓 Conclusão

### **Aprendizado Esperado:**
🎯 **Conhecimento Técnico:**  
- Domínio completo do sistema de exceções Java  
- Compreensão de boas práticas de tratamento de erros  
- Habilidades avançadas de debugging  

🎯 **Aplicação Prática:**  
- Sistema robusto e confiável  
- Tratamento adequado de cenários de erro  
- Feedback claro e informativo para usuários  

🎯 **Competências Profissionais:**  
- Desenvolvimento de software confiável  
- Programação defensiva e validação rigorosa  
- Capacidade de debugging e resolução de problemas  

### **Conexão com o Projeto:**  
Esta aula transforma o Sistema de Biblioteca em uma aplicação profissional e robusta, capaz de lidar graciosamente com erros e fornecer feedback adequado aos usuários.

### **Preparação para Próxima Aula:**  
Com tratamento de exceções implementado, o sistema estará pronto para ser organizado em uma arquitetura em camadas mais profissional e manutenível.