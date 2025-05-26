# -= Em Desenvolvimento =-
# 📚 Workshop Spring Boot API

Este projeto é uma **API RESTful desenvolvida com Spring Boot** como parte do meu aprendizado em backend com Java. Ele simula um sistema simples de gerenciamento de usuários, pedidos e produtos, utilizando boas práticas de estruturação em camadas e integração com banco de dados.

---

## 🧰 Tecnologias Utilizadas

- **Java 17+**
- **Spring Boot**
  - Spring Web
  - Spring Data JPA
- **Banco de Dados H2** (em memória)
- **Maven** para gerenciamento de dependências
- **JPA / Hibernate** para persistência
- **Lombok** (opcional)
- **Postman** para testes de endpoints

---

## 🗂️ Estrutura do Projeto

```
src/main/java/com/pedrosts/dev/course/
├── config/            # Configurações de instância e testes
├── controllers/       # Camada de controladores REST
├── entities/          # Entidades JPA (User, Order, Category, Product, etc)
├── enums/             # Tipos enumerados (OrderStatus)
├── repositories/      # Interfaces JPA para acesso a dados
├── services/          # Lógica de negócio e regras da aplicação
└── Application.java   # Classe principal com método main()
```

---

## 🚀 Como Executar o Projeto

### Pré-requisitos:
- Java 17 instalado
- Maven instalado (ou uso de IDE como IntelliJ/VSCode com suporte Maven)

### Passos:

```
# 1. Clone o repositório
git clone https://github.com/pedro-sts/Workshop-springboot.git

# 2. Acesse o diretório
cd Workshop-springboot

# 3. Compile e execute o projeto com Maven
./mvnw spring-boot:run
```

A aplicação será iniciada em:
```
http://localhost:8080
```

---

## 📌 Endpoints Disponíveis

| Método | Rota | Descrição |
|--------|------|-----------|
| `GET` | `/users` | Lista todos os usuários |
| `GET` | `/users/{id}` | Detalhes de um usuário |
| `GET` | `/orders` | Lista todos os pedidos |
| `GET` | `/orders/{id}` | Detalhes de um usuário |
| `GET` | `/products` | Lista os produtos disponíveis |
| `GET` | `/products/{id}` | Detalhes de um usuário |
| `GET` | `/categories` | Lista as categorias |
| `GET` | `/categories/{id}` | Detalhes de um usuário |
|--------|------|-----------|

Você pode usar o **Postman** ou o navegador para testar as rotas.

---

## 🎯 Funcionalidades

- CRUD de usuários, produtos, pedidos e categorias
- Relacionamentos entre entidades (OneToMany, ManyToOne, ManyToMany)
- Integração com banco de dados em memória H2
- Registro automático de dados de teste via `CommandLineRunner`

---

## 🧠 O que estou aprendendo com este projeto

- Como iniciar um projeto Spring Boot do zero
- Como estruturar uma aplicação em camadas (Controller, Service, Repository, Entity)
- Uso do Spring Data JPA e mapeamentos relacionais
- Injeção de dependência com `@Autowired`
- Uso de banco de dados em memória para testes
- Criação de endpoints RESTful

---

## 🏗️ Possíveis Melhorias Futuras

- Separação de camadas com DTOs
- Adição de validações com `@Valid` e Bean Validation
- Tratamento de exceções com `@ControllerAdvice`
- Documentação com Swagger (OpenAPI)
- Testes unitários com JUnit e Spring Boot Test
- Implementar segurança com Spring Security
