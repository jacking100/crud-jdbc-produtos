# CRUD de Produtos - Java + JDBC

Projeto para **cadastro, edição, exclusão e consulta de produtos** implementado em **Java** utilizando **JDBC**, com persistência em banco de dados **PostgreSQL**.

O objetivo deste projeto é demonstrar uma aplicação **simples, mas completa**, seguindo boas práticas de arquitetura em camadas.

---

## Tecnologias e padrões utilizados

- **Java 21**
- **JDBC** para comunicação com o banco de dados
- **PostgreSQL** como sistema de gerenciamento de banco de dados
- **Arquitetura em camadas**:
  - `controllers` – lógica de interação com o usuário
  - `entities` – definição das entidades do sistema
  - `factories` – gerenciadores de conexões e objetos
  - `repositories` – operações de CRUD no banco de dados

---

## Funcionalidades

- Criar (INSERT) produtos no banco de dados
- Consultar (SELECT) produtos cadastrados
- Atualizar (UPDATE) informações de produtos
- Excluir (DELETE) produtos
- Organização do código seguindo **padrões de projeto** e **responsabilidade única por camada**

---


