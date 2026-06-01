# java-api-users

## 📝 Descrição
API desenvolvida para realizar o gerenciamento de usuários. O foco deste projeto é demonstrar a arquitetura em camadas (Controller, Business, Infrastructure) e o uso do Spring Data JPA com banco de dados em memória.

## 🚀 Tecnologias
- Java 25
- Spring Boot 4.0.6
- Spring Data JPA
- H2 Database
- Lombok
- Maven

## 🛠 Funcionalidades (CRUD)
- **POST** `/usuario` - Cria um novo usuário.
- **GET** `/usuario` - Busca usuário por e-mail.
- **PUT** `/usuario/{id}` - Atualiza dados do usuário.
- **DELETE** `/usuario` - Remove usuário por e-mail.

## ⚙️ Como executar
1. Clone o repositório: `git clone <url-do-seu-repo>`
2. Acesse a pasta: `cd cadastro-usuario`
3. Rode o projeto: `./mvnw spring-boot:run`
4. A API estará disponível em `http://localhost:8080`.

## 📦 Estrutura de Camadas


Este projeto segue o padrão de separação de responsabilidades para garantir que o código seja limpo e fácil de manter.
