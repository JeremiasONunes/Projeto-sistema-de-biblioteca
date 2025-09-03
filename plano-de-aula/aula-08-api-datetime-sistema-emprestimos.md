# PLANO DE TRABALHO DOCENTE 

## MODELO PEDAGÓGICO SENAC 

**Curso:** Técnico em Desenvolvimento de Sistemas  
**Carga Horária Total:** 36 horas  
**Carga Horária da UC:** 36 horas  

**Docente:** Jeremias O Nunes  

---

## PLANO DE AULA – API Date/Time e Sistema de Empréstimos

📌 **Disciplina:** Desenvolver programas orientados a objetos em linguagem Java  
👨🏫 **Mentor(a):** Jeremias O Nunes  
📆 **Data:** Aula nº 08  
⏰ **Duração:** 3 horas (180 minutos)  

---

## 📖 Planejamento

### 📌 Conteúdo Formativo
- API java.time: LocalDate, LocalDateTime, Period, Duration  
- Formatação e parsing de datas  
- Cálculos temporais e regras de negócio com datas  
- Classe Emprestimo e relacionamentos entre objetos  
- Controle de prazos e validação temporal  

### 🎯 Objetivo Geral
Integrar a API Date/Time do Java para implementar o sistema de empréstimos com controle temporal automatizado.

### 💡 Habilidades e Competências
✅ Utilizar API java.time de forma eficiente  
✅ Implementar cálculos temporais automatizados  
✅ Desenvolver regras de negócio baseadas em tempo  
✅ Criar relacionamentos complexos entre objetos  

### 📌 Materiais Necessários
📌 Sistema de busca implementado da aula anterior  
📌 Documentação da API java.time  
📌 IDE configurada com projeto biblioteca  

---

## 🎓 Estratégias de Ensino e Aprendizagem

### Introdução e Contextualização (15min)
**Metodologia Ativa - Cenário Real:**  
Discussão sobre funcionamento de empréstimos em bibliotecas reais e necessidade de controle temporal automatizado.

---

### **Tópico 1: API java.time Fundamentos (20min)**
#### 📌 Demonstração Prática:
**Metodologia Ativa - Aula Expositiva Dialogada:**  
API java.time: LocalDate, LocalDateTime, Period, Duration - diferenças e casos de uso.

#### 📌 Atividade Prática 1:
🎯 **Objetivo:** Compreender classes temporais do Java  
📝 **Tarefa:**  
- **Metodologia Ativa - Experimentação Guiada:**  
Criação de objetos LocalDate e LocalDateTime, explorando métodos básicos

**Parte do Projeto Construída:** Base de conhecimento temporal

---

### **Tópico 2: Formatação e Parsing de Datas (17min)**
#### 📌 Demonstração Prática:
**Metodologia Ativa - Demonstração Interativa:**  
DateTimeFormatter: formatação personalizada e parsing de strings para datas.

#### 📌 Atividade Prática 2:
🎯 **Objetivo:** Dominar formatação de datas  
📝 **Tarefa:**  
- **Metodologia Ativa - Prática Dirigida:**  
Criação de formatadores customizados para diferentes padrões de data

**Parte do Projeto Construída:** Sistema de formatação de datas

---

### **Tópico 3: Cálculos Temporais (17min)**
#### 📌 Demonstração Prática:
**Metodologia Ativa - Live Coding:**  
Period e Duration: cálculos de diferenças, adição e subtração de tempo.

#### 📌 Atividade Prática 3:
🎯 **Objetivo:** Implementar cálculos temporais  
📝 **Tarefa:**  
- **Metodologia Ativa - Resolução de Problemas:**  
Desenvolvimento de métodos para cálculo de prazos e diferenças

**Parte do Projeto Construída:** Biblioteca de cálculos temporais

---

### **Tópico 4: Classe Emprestimo - Modelagem (30min)**
#### 📌 Demonstração Prática:
**Metodologia Ativa - Modelagem Colaborativa:**  
Design da classe Emprestimo com relacionamentos para Livro e Usuario.

#### 📌 Atividade Prática 4:
🎯 **Objetivo:** Criar classe Emprestimo  
📝 **Tarefa:**  
- **Metodologia Ativa - Desenvolvimento Guiado:**  
Implementação da classe com atributos: livro, usuario, dataEmprestimo, dataDevolucaoPrevista

**Parte do Projeto Construída:** Classe Emprestimo funcional

---

### **Tópico 5: Cálculo Automático de Devolução (30min)**
#### 📌 Demonstração Prática:
**Metodologia Ativa - Desenvolvimento Incremental:**  
Implementação de cálculo automático de data de devolução (+7 dias).

#### 📌 Atividade Prática 5:
🎯 **Objetivo:** Automatizar cálculo de prazos  
📝 **Tarefa:**  
- **Metodologia Ativa - Pair Programming:**  
Implementação de construtor que calcula automaticamente dataDevolucaoPrevista

**Parte do Projeto Construída:** Sistema de prazos automatizado

---

### **Tópico 6: Regras de Negócio Temporais (33min)**
#### 📌 Demonstração Prática:
**Metodologia Ativa - Análise de Casos:**  
Desenvolvimento de regras: verificação de atrasos, renovações, multas.

#### 📌 Atividade Prática 6:
🎯 **Objetivo:** Implementar regras de negócio  
📝 **Tarefa:**  
- **Metodologia Ativa - TDD (Test-Driven Development):**  
Criação de métodos isAtrasado(), diasAtraso(), calcularMulta()

**Parte do Projeto Construída:** Regras de negócio temporais

---

### **Tópico 7: Validação e Controle de Atrasos (33min)**
#### 📌 Demonstração Prática:
**Metodologia Ativa - Programação Defensiva:**  
Implementação de validações temporais e controle de empréstimos em atraso.

#### 📌 Atividade Prática 7:
🎯 **Objetivo:** Implementar controle de atrasos  
📝 **Tarefa:**  
- **Metodologia Ativa - Desenvolvimento Colaborativo:**  
Criação de sistema de alertas e relatórios de empréstimos atrasados

**Parte do Projeto Construída:** Sistema completo de controle temporal

---

### Encerramento e Reflexão (15min)
#### 📌 Discussão em grupo:
**Metodologia Ativa - Avaliação de Funcionalidades:**  
Análise da robustez do sistema de empréstimos e identificação de melhorias.

#### 📌 Desafio para a próxima aula:
**Metodologia Ativa - Desafio de Robustez:**  
Pensar em como tratar erros e exceções no sistema de empréstimos.

---

### 📌 Objetos de Aprendizagem
📝 **Materiais Didáticos Utilizados:**  
- Documentação oficial da API java.time  
- Código da classe Emprestimo implementada  
- Exemplos de cálculos temporais e regras de negócio  

---

## 🎯 Avaliação

### **Avaliação Formativa (Durante a aula):**
✅ Compreensão da API java.time e suas classes  
✅ Qualidade da modelagem da classe Emprestimo  
✅ Implementação correta de cálculos temporais  
✅ Aplicação adequada de regras de negócio temporais  

### **Avaliação Somativa (Entregáveis):**
✅ Classe Emprestimo com relacionamentos funcionais  
✅ Sistema de cálculo automático de prazos  
✅ Regras de negócio temporais implementadas  

### **Critérios de Qualidade:**
- **Excelente (9-10):** API temporal usada corretamente, regras de negócio robustas, código eficiente  
- **Bom (7-8):** Implementação funcional com boa compreensão de datas  
- **Satisfatório (6-7):** Conceitos aplicados com orientação, funcionalidades básicas  
- **Insatisfatório (<6):** Dificuldades na compreensão ou uso da API temporal  

---

## 🎓 Conclusão

### **Aprendizado Esperado:**
🎯 **Conhecimento Técnico:**  
- Domínio da API java.time moderna  
- Compreensão de cálculos temporais  
- Conhecimento de formatação e parsing de datas  

🎯 **Aplicação Prática:**  
- Sistema de empréstimos automatizado  
- Controle temporal robusto e confiável  
- Regras de negócio baseadas em tempo  

🎯 **Competências Profissionais:**  
- Integração de APIs externas com POO  
- Desenvolvimento de sistemas temporais  
- Aplicação de regras de negócio complexas  

### **Conexão com o Projeto:**  
Esta aula adiciona a funcionalidade central do Sistema de Biblioteca - o controle de empréstimos - integrando perfeitamente com as funcionalidades de busca e CRUD já implementadas.

### **Preparação para Próxima Aula:**  
Com sistema de empréstimos funcionando, o projeto estará pronto para implementar tratamento robusto de exceções e validações de erro.