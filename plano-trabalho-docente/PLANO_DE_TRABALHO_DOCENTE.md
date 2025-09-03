# PLANO DE TRABALHO DOCENTE 

## MODELO PEDAGÓGICO SENAC 

**Curso:** Técnico em Desenvolvimento de Sistemas  
**Carga horária:** 36 horas  
**Carga Horária da UC:** 36 horas  

**Docente:** Jeremias O Nunes 

---

## SITUAÇÃO DE APRENDIZAGEM: Desenvolvimento de Sistema de Biblioteca em Java

**Número de aulas:** 12  
**Carga horária prevista:** 36 horas  

### Contexto + Cenário:
O mercado de desenvolvimento de software demanda profissionais capazes de criar sistemas robustos utilizando programação orientada a objetos. Com o crescimento da digitalização de processos em instituições educacionais e bibliotecas, há uma necessidade crescente de sistemas especializados em gestão de acervos e empréstimos. O projeto Sistema de Biblioteca surge como resposta a essa demanda, oferecendo uma plataforma moderna para cadastro de livros, usuários e controle completo de empréstimos.

### Problema:
Muitos profissionais de desenvolvimento carecem de conhecimentos sólidos em programação orientada a objetos e boas práticas de desenvolvimento Java, resultando em sistemas pouco estruturados e com baixa manutenibilidade. Além disso, há uma lacuna na compreensão de como implementar tratamento de exceções e integrar APIs Java de forma eficiente.

### Desafios:
- Dominar conceitos fundamentais de POO (classes, objetos, herança, polimorfismo)
- Aplicar encapsulamento e abstração em projetos reais
- Implementar tratamento robusto de exceções
- Integrar APIs Java para manipulação de datas e collections
- Desenvolver interfaces de usuário funcionais e intuitivas

### Indicadores:
**Indicador 1:** Instala e configura ambiente de desenvolvimento, conforme especificações do sistema.
**Indicador 2:** Desenvolve programas, utilizando os conceitos de orientação a objetos, de acordo com as definições do projeto.
**Indicador 3:** Testa códigos desenvolvidos em Java e trata erros, considerando as melhores práticas de programação adotadas pelo mercado.

---

## Elementos de Competência

| Conhecimentos | Habilidades | Atitudes/Valores |
|---------------|-------------|------------------|
| • Linguagem Java: histórico, edições da plataforma, JDK, ambiente de desenvolvimento<br>• Ambiente e linguagem: sintaxe, convenções, POO, classes e objetos<br>• IDE: configurações, estrutura de arquivos, debug<br>• Objetos e métodos: encapsulamento, herança, polimorfismo<br>• API Date/Time e Collections<br>• Tratamento de erros e exceções | • Aplicar conceitos de POO na construção de softwares<br>• Pesquisar dados para desenvolvimento<br>• Interpretar projetos com requisitos<br>• Testar e debugar código Java | • Atitude propositiva na solução de problemas<br>• Iniciativa no desenvolvimento das atividades<br>• Colaboração no trabalho em equipe<br>• Responsabilidade com prazos e entregas<br>• Comprometimento com qualidade de código |

---

## Sugestões de Atividades de Aprendizagem

### 🎓 Aula 1 – Configuração do Ambiente e Fundamentos Java

**Objetivo:**  
Capacitar o aluno a instalar e configurar o ambiente de desenvolvimento Java, compreendendo os fundamentos da linguagem e conceitos iniciais de orientação a objetos.

**Atividades:**  
**Teoria (30% - 54min):**  
• Conceitos fundamentais de Java: JDK, JVM, sintaxe básica  
• Princípios de orientação a objetos: classes, objetos, encapsulamento  
• Convenções de nomenclatura e estrutura de pacotes  

**Prática (70% - 126min):**  
• Instalação e configuração do JDK 17+ e IDE (Eclipse/IntelliJ)  
• Criação da estrutura de pacotes do projeto biblioteca  
• Desenvolvimento das classes básicas Livro e Usuario  
• Implementação de getters/setters e construtores  
• Exercícios de criação e manipulação de objetos

**Indicador trabalhado:**  
✔️ Indicador 1 - Instala e configura ambiente de desenvolvimento

**Descrição alinhada ao indicador:**  
Esta aula estabelece a base técnica necessária para o desenvolvimento, onde os alunos configuram completamente o ambiente Java e criam as primeiras classes do sistema, demonstrando domínio das ferramentas essenciais.

---

### 🎓 Aula 2 – Aprofundamento em Classes e Objetos

**Objetivo:**  
Consolidar conceitos de classes e objetos, implementando métodos construtores e explorando relacionamentos entre classes.

**Atividades:**  
**Teoria (30% - 54min):**  
• Construtores: tipos, sobrecarga e boas práticas  
• Relacionamentos entre objetos: composição vs agregação  
• Conceitos de debugging e análise de memória  

**Prática (70% - 126min):**  
• Refinamento das classes Livro e Usuario com construtores sobrecarregados  
• Implementação de métodos de validação e regras de negócio básicas  
• Desenvolvimento de relacionamentos entre objetos (composição)  
• Exercícios práticos de instanciação e manipulação de objetos  
• Laboratório de debugging básico e análise de objetos em memória

**Indicador trabalhado:**  
✔️ Indicador 2 - Desenvolve programas utilizando conceitos de orientação a objetos

**Descrição alinhada ao indicador:**  
Esta aula consolida os fundamentos de POO, preparando os alunos para conceitos mais avançados através da prática intensiva com objetos.

---

### 🎓 Aula 3 – Herança: Criando Hierarquias de Classes

**Objetivo:**  
Implementar herança criando especializações das classes base do sistema de biblioteca.

**Atividades:**  
**Teoria (30% - 54min):**  
• Conceitos de herança: superclasse, subclasse, hierarquia  
• Classes abstratas vs classes concretas  
• Palavras-chave super() e this(): uso e diferenças  

**Prática (70% - 126min):**  
• Análise de requisitos para especialização de livros e usuários  
• Criação das subclasses LivroImpresso e Ebook  
• Implementação da classe abstrata Usuario  
• Implementação prática de super() e this()  
• Exercícios de herança com atributos e métodos específicos

**Indicador trabalhado:**  
✔️ Indicador 2 - Desenvolve programas utilizando conceitos de orientação a objetos

**Descrição alinhada ao indicador:**  
A aula introduz herança de forma gradual, permitindo que os alunos compreendam a especialização de classes no contexto do projeto.

---

### 🎓 Aula 4 – Polimorfismo e Sobrescrita de Métodos

**Objetivo:**  
Aplicar polimorfismo através da sobrescrita de métodos e implementação de comportamentos específicos.

**Atividades:**  
**Teoria (30% - 54min):**  
• Polimorfismo: conceitos e tipos (sobrecarga vs sobrescrita)  
• Binding dinâmico e resolução de métodos em tempo de execução  
• Casting de objetos e operador instanceof  

**Prática (70% - 126min):**  
• Implementação das subclasses Aluno e Professor  
• Implementação de sobrescrita de métodos (toString, equals)  
• Demonstração prática de polimorfismo com arrays de objetos  
• Exercício de casting e instanceof  
• Laboratório de polimorfismo em tempo de execução

**Indicador trabalhado:**  
✔️ Indicador 2 - Desenvolve programas utilizando conceitos de orientação a objetos

**Descrição alinhada ao indicador:**  
Esta aula completa a tríade fundamental da POO, demonstrando como diferentes objetos podem ter comportamentos específicos mantendo uma interface comum.

---

### 🎓 Aula 5 – Collections e Estruturas de Dados

**Objetivo:**  
Implementar estruturas de dados eficientes utilizando Collections Framework para gerenciamento de dados do sistema.

**Atividades:**  
**Teoria (30% - 54min):**  
• Collections Framework: hierarquia e principais interfaces  
• ArrayList vs LinkedList: características e performance  
• Conceitos de generics e type safety  

**Prática (70% - 126min):**  
• Implementação de ArrayList para armazenamento de livros e usuários  
• Desenvolvimento de operações CRUD (Create, Read, Update, Delete)  
• Implementação de Streams API para pesquisa e filtragem avançada  
• Criação de métodos de busca por título, autor e disponibilidade  
• Laboratório de performance entre diferentes tipos de Collections

**Indicador trabalhado:**  
✔️ Indicador 2 - Desenvolve programas utilizando conceitos de orientação a objetos

**Descrição alinhada ao indicador:**  
Esta aula integra Collections com POO, demonstrando como manipular objetos em estruturas de dados complexas seguindo padrões profissionais de desenvolvimento.

---

### 🎓 Aula 6 – Gerenciamento de Dados com ArrayList

**Objetivo:**  
Implementar operações CRUD utilizando ArrayList para gerenciar livros e usuários do sistema.

**Atividades:**  
**Teoria (30% - 54min):**  
• Operações CRUD: conceitos e importância  
• Padrões de acesso a dados e manipulação de coleções  
• Boas práticas em gerenciamento de dados em memória  

**Prática (70% - 126min):**  
• Criação de listas para armazenamento de livros e usuários  
• Implementação de métodos de cadastro (Create)  
• Desenvolvimento de funcionalidades de listagem (Read)  
• Implementação de atualização e remoção de dados (Update/Delete)  
• Exercícios de manipulação básica de Collections

**Indicador trabalhado:**  
✔️ Indicador 2 - Desenvolve programas utilizando conceitos de orientação a objetos

**Descrição alinhada ao indicador:**  
A aula introduz Collections de forma prática, integrando com os objetos já criados para formar a base de dados do sistema.

---

### 🎓 Aula 7 – Streams API e Pesquisa Avançada

**Objetivo:**  
Utilizar Streams API para implementar funcionalidades de pesquisa e filtragem no sistema.

**Atividades:**  
**Teoria (30% - 54min):**  
• Streams API: conceitos de programação funcional  
• Operações intermediárias vs terminais  
• Predicados e expressões lambda  

**Prática (70% - 126min):**  
• Implementação de pesquisa por título e autor  
• Desenvolvimento de filtros e predicados  
• Criação de métodos de busca avançada  
• Laboratório de performance e otimização de consultas  
• Exercícios com diferentes operações de Stream

**Indicador trabalhado:**  
✔️ Indicador 2 - Desenvolve programas utilizando conceitos de orientação a objetos

**Descrição alinhada ao indicador:**  
Esta aula expande as capacidades do sistema, demonstrando como integrar APIs modernas do Java com design orientado a objetos.

---

### 🎓 Aula 8 – API Date/Time e Sistema de Empréstimos

**Objetivo:**  
Integrar a API Date/Time do Java para implementar o sistema de empréstimos com controle temporal automatizado.

**Atividades:**  
**Teoria (30% - 54min):**  
• API java.time: LocalDate, LocalDateTime, Period, Duration  
• Formatação e parsing de datas  
• Cálculos temporais e regras de negócio com datas  

**Prática (70% - 126min):**  
• Criação da classe Emprestimo com relacionamentos entre objetos  
• Implementação de cálculo automático de data de devolução (+7 dias)  
• Implementação de formatação e manipulação de datas  
• Desenvolvimento de regras de negócio temporais  
• Exercício de validação de prazos e controle de atrasos

**Indicador trabalhado:**  
✔️ Indicador 2 - Desenvolve programas utilizando conceitos de orientação a objetos

**Descrição alinhada ao indicador:**  
A aula demonstra a integração de APIs externas com design orientado a objetos, criando funcionalidades complexas que seguem padrões de mercado.

---

### 🎓 Aula 9 – Tratamento de Exceções e Robustez

**Objetivo:**  
Desenvolver sistema robusto de tratamento de erros utilizando exceções personalizadas e boas práticas de programação defensiva.

**Atividades:**  
**Teoria (30% - 54min):**  
• Hierarquia de exceções em Java: checked vs unchecked  
• Boas práticas no tratamento de exceções  
• Stack traces: leitura e interpretação  

**Prática (70% - 126min):**  
• Análise de cenários de erro e criação de exceções personalizadas  
• Implementação de LivroNaoEncontradoException e LivroIndisponivelException  
• Implementação de try-catch-finally em métodos críticos do sistema  
• Desenvolvimento de validação de dados de entrada com feedback claro  
• Laboratório de debugging e análise de stack traces  
• Criação de logs de erro e mensagens informativas para usuários

**Indicador trabalhado:**  
✔️ Indicador 3 - Testa códigos desenvolvidos e trata erros

**Descrição alinhada ao indicador:**  
Esta aula foca na criação de software confiável, implementando tratamento de exceções que segue as melhores práticas adotadas pelo mercado profissional.

---

### 🎓 Aula 10 – Arquitetura em Camadas e Lógica de Negócio

**Objetivo:**  
Estruturar o sistema em camadas bem definidas, concentrando a lógica de negócio em uma camada de serviço especializada.

**Atividades:**  
**Teoria (30% - 54min):**  
• Arquitetura em camadas: apresentação, negócio, dados  
• Princípios SOLID: conceitos e aplicação  
• Coesão vs acoplamento: métricas de qualidade de código  

**Prática (70% - 126min):**  
• Criação da classe BibliotecaService como centralizadora de regras de negócio  
• Implementação de métodos especializados (cadastrar, pesquisar, emprestar, devolver)  
• Aplicação dos princípios SOLID no design das classes  
• Desenvolvimento de validações de negócio e controle de fluxo  
• Exercício de refatoração para melhorar coesão e reduzir acoplamento

**Indicador trabalhado:**  
✔️ Indicador 2 - Desenvolve programas utilizando conceitos de orientação a objetos

**Descrição alinhada ao indicador:**  
A aula demonstra como organizar código complexo seguindo padrões arquiteturais profissionais, aplicando POO de forma estruturada e escalável.

---

### 🎓 Aula 11 – Interface de Usuário e Experiência do Usuário

**Objetivo:**  
Projetar e implementar interface de usuário intuitiva em console, focando na experiência do usuário e usabilidade.

**Atividades:**  
**Teoria (30% - 54min):**  
• Princípios de UX/UI para aplicações console  
• Padrões de entrada de dados e validação  
• Design de fluxos de navegação e feedback ao usuário  

**Prática (70% - 126min):**  
• Desenvolvimento da classe MenuPrincipal com padrões de interface  
• Implementação de entrada de dados robusta utilizando Scanner  
• Implementação de validação de entrada e feedback ao usuário  
• Criação de mensagens claras e tratamento de erros na interface  
• Laboratório de testes de usabilidade e refinamento da experiência

**Indicador trabalhado:**  
✔️ Indicador 2 - Desenvolve programas utilizando conceitos de orientação a objetos

**Descrição alinhada ao indicador:**  
Esta aula integra POO com design de interface, criando uma experiência de usuário profissional que demonstra a aplicação prática dos conceitos aprendidos.

---

### 🎓 Aula 12 – Integração, Testes e Finalização

**Objetivo:**  
Integrar todos os componentes do sistema, realizar testes completos e finalizar o projeto com documentação.

**Atividades:**  
**Teoria (30% - 54min):**  
• Metodologias de teste: unitário, integração, funcional  
• Documentação técnica: padrões e boas práticas  
• Apresentação de projetos: estrutura e conteúdo  

**Prática (70% - 126min):**  
• Integração completa de todas as camadas do sistema  
• Execução de testes funcionais e casos de uso  
• Debugging e correção de problemas identificados  
• Criação de documentação técnica (README.md)  
• Apresentação final dos projetos desenvolvidos  
• Avaliação e feedback sobre o aprendizado

**Indicador trabalhado:**  
✔️ Indicadores 1, 2 e 3 - Consolidação completa dos conhecimentos

**Descrição alinhada ao indicador:**  
Esta aula final integra todos os conceitos aprendidos, demonstrando um sistema completo que aplica POO, tratamento de erros e boas práticas de desenvolvimento.

**Objetivo:**  
Implementar estratégias de teste e debug para garantir a qualidade e confiabilidade do sistema desenvolvido.

**Atividades:**  
• Planejamento de cenários de teste e casos de uso críticos  
• Integração completa de todas as camadas do sistema  
• Prática de debugging utilizando ferramentas da IDE  
• Execução de testes funcionais e validação de regras de negócio  
• Laboratório de identificação e correção de bugs  
• Análise de performance e otimização de código

**Indicador trabalhado:**  
✔️ Indicador 3 - Testa códigos desenvolvidos e trata erros

**Descrição alinhada ao indicador:**  
A aula foca na garantia de qualidade do software, aplicando técnicas de teste e debug que são fundamentais no mercado profissional de desenvolvimento.

---



---

## Estratégias de Avaliação para esta Situação de Aprendizagem

### Procedimentos de Avaliação:
- **Avaliação diagnóstica:** Análise do conhecimento prévio em programação e conceitos de POO
- **Avaliação formativa:** Acompanhamento contínuo durante workshops e desenvolvimento incremental
- **Avaliação somativa:** Entrega do sistema completo funcionando com documentação técnica

### Instrumentos de Avaliação:
- **Ficha de observação:** Para atividades colaborativas e práticas de desenvolvimento
- **Estudo de caso:** Análise de soluções para problemas reais de gestão de biblioteca
- **Autoavaliação:** Reflexão sobre evolução das competências em POO e Java
- **Avaliação entre pares:** Code review e análise colaborativa de soluções
- **Projetos e entregas práticas:** Sistema funcional, código limpo e documentação profissional

---

## Orientações específicas para esta Situação de Aprendizagem

- **Estabelecer ambiente colaborativo e motivador:** Incentivar trabalho em grupos e troca de experiências entre alunos
- **Foco na aplicação prática alinhada ao cenário real:** Todos os exercícios baseados no Sistema de Biblioteca
- **Suporte individualizado para dúvidas e dificuldades:** Atendimento personalizado durante atividades práticas
- **Incentivo à reflexão sobre a aplicabilidade dos conhecimentos:** Discussões sobre impacto no mercado de desenvolvimento
- **Monitoramento contínuo do progresso:** Checkpoints regulares e feedback imediato sobre evolução

---

## Recursos Didáticos

### RD Padrão:
- Computadores com acesso à internet e JDK 17+ instalado
- IDE de desenvolvimento (Eclipse, IntelliJ IDEA ou VS Code)
- Projetores e telas para apresentações e demonstrações
- Quadro branco ou flipchart para diagramas UML

### RD Complementar:
- Documentação oficial Oracle Java e tutoriais especializados
- Repositório Git para versionamento e colaboração
- Templates e estruturas base do Sistema de Biblioteca
- Exemplos de sistemas similares para referência e benchmarking
- Bibliografia especializada em POO, Java e boas práticas de desenvolvimento
- Plataformas online para compartilhamento e review de código