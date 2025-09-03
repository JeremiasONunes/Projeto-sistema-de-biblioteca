# PLANO DE TRABALHO DOCENTE 

## MODELO PEDAGÓGICO SENAC 

**Curso:** Técnico em Desenvolvimento de Sistemas  
**Carga Horária Total:** 36 horas  
**Carga Horária da UC:** 36 horas  

**Docente:** Jeremias O Nunes  

---

## PLANO DE AULA – Streams API e Pesquisa Avançada

📌 **Disciplina:** Desenvolver programas orientados a objetos em linguagem Java  
👨🏫 **Mentor(a):** Jeremias O Nunes  
📆 **Data:** Aula nº 07  
⏰ **Duração:** 3 horas (180 minutos)  

---

## 📖 Planejamento

### 📌 Conteúdo Formativo
- Streams API: conceitos de programação funcional  
- Operações intermediárias vs terminais  
- Predicados e expressões lambda  
- Implementação de filtros avançados  
- Otimização de consultas e performance  

### 🎯 Objetivo Geral
Utilizar Streams API para implementar funcionalidades de pesquisa e filtragem no sistema.

### 💡 Habilidades e Competências
✅ Aplicar conceitos de programação funcional com Streams  
✅ Implementar filtros e predicados eficientes  
✅ Desenvolver métodos de busca avançada  
✅ Otimizar performance de consultas  

### 📌 Materiais Necessários
📌 Sistema CRUD implementado da aula anterior  
📌 Documentação da Streams API  
📌 IDE configurada com projeto biblioteca  

---

## 🎓 Estratégias de Ensino e Aprendizagem

### Introdução e Contextualização (15min)
**Metodologia Ativa - Problematização:**  
Discussão sobre limitações das buscas tradicionais com loops e necessidade de consultas mais sofisticadas no sistema biblioteca.

---

### **Tópico 1: Conceitos de Streams API (20min)**
#### 📌 Demonstração Prática:
**Metodologia Ativa - Aula Expositiva Dialogada:**  
Streams API: paradigma funcional, pipeline de operações, lazy evaluation e imutabilidade.

#### 📌 Atividade Prática 1:
🎯 **Objetivo:** Compreender o paradigma funcional  
📝 **Tarefa:**  
- **Metodologia Ativa - Comparação Prática:**  
Comparação entre loop tradicional e Stream para operações simples

**Parte do Projeto Construída:** Base conceitual de programação funcional

---

### **Tópico 2: Operações Intermediárias vs Terminais (17min)**
#### 📌 Demonstração Prática:
**Metodologia Ativa - Demonstração Interativa:**  
Diferenças entre filter, map, sorted (intermediárias) e collect, forEach, count (terminais).

#### 📌 Atividade Prática 2:
🎯 **Objetivo:** Distinguir tipos de operações Stream  
📝 **Tarefa:**  
- **Metodologia Ativa - Experimentação Guiada:**  
Criação de pipelines simples combinando operações intermediárias e terminais

**Parte do Projeto Construída:** Compreensão de pipeline de Streams

---

### **Tópico 3: Predicados e Expressões Lambda (17min)**
#### 📌 Demonstração Prática:
**Metodologia Ativa - Live Coding:**  
Criação de predicados com lambda expressions para filtros customizados.

#### 📌 Atividade Prática 3:
🎯 **Objetivo:** Dominar expressões lambda  
📝 **Tarefa:**  
- **Metodologia Ativa - Construção Incremental:**  
Desenvolvimento de predicados para diferentes critérios de busca

**Parte do Projeto Construída:** Biblioteca de predicados reutilizáveis

---

### **Tópico 4: Pesquisa por Título e Autor (30min)**
#### 📌 Demonstração Prática:
**Metodologia Ativa - Desenvolvimento Guiado:**  
Implementação de métodos pesquisarPorTitulo() e pesquisarPorAutor() usando Streams.

#### 📌 Atividade Prática 4:
🎯 **Objetivo:** Implementar busca básica com Streams  
📝 **Tarefa:**  
- **Metodologia Ativa - Pair Programming:**  
Criação de métodos de busca case-insensitive com filter e collect

**Parte do Projeto Construída:** Métodos de busca básica funcionais

---

### **Tópico 5: Filtros e Predicados Avançados (30min)**
#### 📌 Demonstração Prática:
**Metodologia Ativa - Resolução de Problemas:**  
Desenvolvimento de filtros combinados: disponibilidade, ano de publicação, tipo de usuário.

#### 📌 Atividade Prática 5:
🎯 **Objetivo:** Criar filtros complexos  
📝 **Tarefa:**  
- **Metodologia Ativa - TDD (Test-Driven Development):**  
Implementação de filtros combinados usando and(), or() e negate()

**Parte do Projeto Construída:** Sistema de filtros avançados

---

### **Tópico 6: Métodos de Busca Avançada (33min)**
#### 📌 Demonstração Prática:
**Metodologia Ativa - Desenvolvimento Incremental:**  
Criação de métodos de busca com múltiplos critérios e ordenação.

#### 📌 Atividade Prática 6:
🎯 **Objetivo:** Implementar busca sofisticada  
📝 **Tarefa:**  
- **Metodologia Ativa - Programação Colaborativa:**  
Desenvolvimento de busca por múltiplos critérios com sorted() e limit()

**Parte do Projeto Construída:** Sistema de busca avançada completo

---

### **Tópico 7: Performance e Otimização (33min)**
#### 📌 Demonstração Prática:
**Metodologia Ativa - Análise de Performance:**  
Comparação de performance entre diferentes abordagens de consulta.

#### 📌 Atividade Prática 7:
🎯 **Objetivo:** Otimizar consultas  
📝 **Tarefa:**  
- **Metodologia Ativa - Benchmarking:**  
Análise e otimização de consultas com parallel streams e short-circuiting

**Parte do Projeto Construída:** Sistema otimizado para performance

---

### Encerramento e Reflexão (15min)
#### 📌 Discussão em grupo:
**Metodologia Ativa - Retrospectiva Técnica:**  
Análise das vantagens da programação funcional e impacto na legibilidade do código.

#### 📌 Desafio para a próxima aula:
**Metodologia Ativa - Desafio de Integração:**  
Pensar em como integrar as funcionalidades de busca com sistema de empréstimos.

---

### 📌 Objetos de Aprendizagem
📝 **Materiais Didáticos Utilizados:**  
- Documentação oficial da Streams API  
- Código implementado com diferentes tipos de consulta  
- Exemplos de otimização e performance  

---

## 🎯 Avaliação

### **Avaliação Formativa (Durante a aula):**
✅ Compreensão dos conceitos de programação funcional  
✅ Uso correto de operações intermediárias e terminais  
✅ Qualidade dos predicados e expressões lambda  
✅ Eficiência das implementações de busca  

### **Avaliação Somativa (Entregáveis):**
✅ Métodos de busca por título e autor funcionais  
✅ Sistema de filtros avançados implementado  
✅ Consultas otimizadas para performance  

### **Critérios de Qualidade:**
- **Excelente (9-10):** Streams aplicadas corretamente, código funcional elegante, otimizações eficazes  
- **Bom (7-8):** Implementação funcional com boa compreensão de Streams  
- **Satisfatório (6-7):** Conceitos aplicados com orientação, funcionalidades básicas  
- **Insatisfatório (<6):** Dificuldades na compreensão ou implementação de Streams  

---

## 🎓 Conclusão

### **Aprendizado Esperado:**
🎯 **Conhecimento Técnico:**  
- Domínio da Streams API e programação funcional  
- Compreensão de predicados e expressões lambda  
- Conhecimento de otimização de consultas  

🎯 **Aplicação Prática:**  
- Sistema de busca sofisticado e eficiente  
- Filtros flexíveis e reutilizáveis  
- Código mais legível e manutenível  

🎯 **Competências Profissionais:**  
- Aplicação de paradigmas modernos de programação  
- Desenvolvimento de soluções elegantes e eficientes  
- Capacidade de otimização e análise de performance  

### **Conexão com o Projeto:**  
Esta aula eleva o Sistema de Biblioteca a um nível profissional, oferecendo capacidades de busca e filtragem que rivalizam com sistemas comerciais.

### **Preparação para Próxima Aula:**  
Com sistema de busca avançado implementado, o projeto estará pronto para integrar funcionalidades de empréstimo que utilizarão APIs de data e tempo.