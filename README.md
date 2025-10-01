📝 Atividade Prática – Biblioteca de Jogos Pessoais com Spring Boot
📖 Introdução

Este projeto consiste no desenvolvimento de uma aplicação Web Full Stack utilizando o framework Spring Boot para o backend e Thymeleaf para a interface visual.
A aplicação foi desenvolvida como parte da disciplina de Linguagem de Programação, com o objetivo de consolidar os conhecimentos em desenvolvimento de sistemas web, persistência em banco de dados e construção de interfaces dinâmicas.

🎯 Objetivo

O principal objetivo do sistema é permitir que o usuário mantenha uma Biblioteca Pessoal de Jogos, possibilitando:

Cadastrar, listar, editar e remover jogos e categorias.

Utilizar recursos visuais como alternância de tema Dark/Light e rodapé fixo com informações do desenvolvedor.

Implementar a persistência dos dados em banco relacional, utilizando PostgreSQL (produção) e H2 (ambiente local).

⚙️ Metodologia de Desenvolvimento

O projeto foi desenvolvido em etapas:

Configuração inicial via Spring Initializr.

Modelagem das entidades (Categoria e Jogo) e definição dos relacionamentos.

Criação do backend com Spring Boot, utilizando Spring Data JPA para persistência.

Construção da interface com Thymeleaf e recursos visuais em CSS/JavaScript.

Testes em ambiente local com H2 Database.

Deploy na nuvem, com backend hospedado no Render e banco de dados no Neon (PostgreSQL).

🗄️ Modelagem dos Dados
Entidade Categoria

id (Long, PK)

nome (String)

descricao (String)

iconeUrl (String)

dataCriacao (LocalDateTime)

dataAtualizacao (LocalDateTime)

ativo (boolean)

Entidade Jogo

id (Long, PK)

titulo (String)

autor (String)

anoPublicacao (Integer)

genero (String)

descricao (String)

plataforma (String)

tempoEstimado (Integer – horas)

dataLancamento (LocalDate)

nota (Double – 0 a 10)

dificuldade (Enum: FÁCIL, MÉDIO, DIFÍCIL)

multiplayer (boolean)

preco (BigDecimal)

lojaUrl (String)

urlCapa (String)

finalizado (boolean)

dataAdicionado (LocalDate)

dataFinalizacao (LocalDate)

categoria (ManyToOne)

🎨 Requisitos Visuais

Alternância de tema Dark/Light.

Rodapé fixo contendo:

Nome completo do desenvolvedor.

Link para o GitHub do projeto.

⚙️ Tecnologias Utilizadas

Java 21

Spring Boot 3.3.x

Thymeleaf

Spring Data JPA

H2 Database (teste/local)

PostgreSQL (Neon) (produção)

Render (deploy do backend)

Maven (gerenciador de dependências)

🚀 Execução Local
Pré-requisitos

Java 21

Maven

PostgreSQL (opcional, apenas se preferir rodar com banco real local)

Passos

Clonar o repositório:

git clone https://github.com/SeuUsuario/bibliotecajogos.git
cd bibliotecajogos


Configurar application.properties:

spring.datasource.url=jdbc:postgresql://localhost:5432/bibliotecajogos
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true


Executar a aplicação:

mvn spring-boot:run


Acessar no navegador:

http://localhost:8080


Obs.: Caso não configure o PostgreSQL localmente, o projeto poderá ser executado com H2 Database já configurado para testes.

🌐 Deploy

Aplicação (Render):

https://bibliotecajogos-SeuNomeSobrenome.onrender.com


Banco de Dados (Neon PostgreSQL):
Configurado remotamente e vinculado ao Render.

📌 Entrega

A entrega deste projeto será feita via Moodle, contendo:

Link do repositório público no GitHub.

Link da aplicação hospedada no Render.

👨‍🎓 Desenvolvedor

Nickolle Karen Tamarozi Ramos

GitHub: https://github.com/Nickkaren
