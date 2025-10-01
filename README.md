# 📝 Atividade Prática – Biblioteca de Jogos Pessoais com Spring Boot

## 📖 Introdução
Este projeto consiste no desenvolvimento de uma **aplicação Web Full Stack** utilizando o framework **Spring Boot** para o backend e **Thymeleaf** para a interface visual.  
A aplicação foi desenvolvida como parte da disciplina de **Linguagem de Programação**, com o objetivo de consolidar os conhecimentos em **desenvolvimento de sistemas web, persistência em banco de dados e construção de interfaces dinâmicas**.

---

## 🎯 Objetivo
O principal objetivo do sistema é permitir que o usuário mantenha uma **Biblioteca Pessoal de Jogos**, possibilitando:

- Cadastrar, listar, editar e remover jogos e categorias.  
- Utilizar recursos visuais como alternância de **tema Dark/Light** e rodapé fixo com informações do desenvolvedor.  
- Implementar a persistência dos dados em banco relacional, utilizando **PostgreSQL (produção)** e **H2 (ambiente local)**.  

---

## ⚙️ Metodologia de Desenvolvimento
O projeto foi desenvolvido em etapas:

1. Configuração inicial via Spring Initializr.  
2. Modelagem das entidades (**Categoria** e **Jogo**) e definição dos relacionamentos.  
3. Criação do backend com Spring Boot, utilizando Spring Data JPA para persistência.  
4. Construção da interface com Thymeleaf e recursos visuais em CSS/JavaScript.  
5. Testes em ambiente local com H2 Database.  
6. Deploy na nuvem, com backend hospedado no Render e banco de dados no Neon (PostgreSQL).  

---

## 🗄️ Modelagem dos Dados

### Entidade **Categoria**
- `id` (Long, PK)  
- `nome` (String)  
- `descricao` (String)  
- `iconeUrl` (String)  
- `dataCriacao` (LocalDateTime)  
- `dataAtualizacao` (LocalDateTime)  
- `ativo` (boolean)  

### Entidade **Jogo**
- `id` (Long, PK)  
- `titulo` (String)  
- `autor` (String)  
- `anoPublicacao` (Integer)  
- `genero` (String)  
- `descricao` (String)  
- `plataforma` (String)  
- `tempoEstimado` (Integer – horas)  
- `dataLancamento` (LocalDate)  
- `nota` (Double – 0 a 10)  
- `dificuldade` (Enum: FÁCIL, MÉDIO, DIFÍCIL)  
- `multiplayer` (boolean)  
- `preco` (BigDecimal)  
- `lojaUrl` (String)  
- `urlCapa` (String)  
- `finalizado` (boolean)  
- `dataAdicionado` (LocalDate)  
- `dataFinalizacao` (LocalDate)  
- `categoria` (ManyToOne)  

---

## 🎨 Requisitos Visuais
- Alternância de **tema Dark/Light**.  
- **Rodapé fixo** contendo:  
  - Nome completo do desenvolvedor.  
  - Link para o GitHub do projeto.  

---

## ⚙️ Tecnologias Utilizadas
- Java 21  
- Spring Boot 3.3.x  
- Thymeleaf  
- Spring Data JPA  
- H2 Database (teste/local)  
- PostgreSQL (Neon) (produção)  
- Render (deploy do backend)  
- Maven (gerenciador de dependências)  
