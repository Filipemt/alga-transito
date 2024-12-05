# Algatrânsito API

Uma API para gestão de veículos e proprietários, desenvolvida com **Java** e **Spring Boot**. Este projeto foi criado para facilitar o gerenciamento de registros de veículos e seus respectivos proprietários, incluindo operações CRUD e validações.

## Estrutura do Projeto

```
algatransito-api/
├── src/main/java/com/algaworks/algatransito
│   ├── api/controller          # Controladores REST
│   ├── domain/exception        # Classes de exceção
│   ├── domain/model            # Modelos de domínio
│   ├── domain/repository       # Interfaces de repositório
│   ├── domain/service          # Regras de negócio
│   └── domain/validation       # Grupos de validação
├── src/main/resources
│   └── application.properties  # Configuração do Spring Boot
├── pom.xml                      # Dependências do Maven
└── ...
```

## Funcionalidades

- **Proprietários**:
    - Cadastro, edição, exclusão e consulta de proprietários.
- **Veículos**:
    - Cadastro, edição, exclusão e consulta de veículos.
    - Associação de veículos a proprietários.
- **Validações**:
    - Regras de negócio para evitar inconsistências.

## Tecnologias Utilizadas

- **Java 17**
- **Spring Boot 3**
- **Maven**
- **H2 Database** (banco de dados em memória para testes)
- **Swagger** (para documentação da API)

## Configuração do Ambiente

### Pré-requisitos

- Java 17+
- Maven 3.8+

### Configuração

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/algatransito-api.git
   cd algatransito-api
   ```

2. Configure o arquivo `application.properties` (caso necessário):
   ```properties
   spring.datasource.url=jdbc:h2:mem:algatransito
   spring.datasource.username=sa
   spring.datasource.password=
   spring.jpa.hibernate.ddl-auto=update
   spring.h2.console.enabled=true
   ```

## Como Executar

1. Compile e execute o projeto com Maven:
   ```bash
   mvn spring-boot:run
   ```

2. Acesse a aplicação:
    - API: [http://localhost:8080](http://localhost:8080)
    - Console H2: [http://localhost:8080/h2-console](http://localhost:8080/h2-console)
    - Documentação Swagger: [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

## Contribuindo

1. Faça um fork do projeto
2. Crie um branch para sua feature: `git checkout -b minha-feature`
3. Faça commit das alterações: `git commit -m 'Minha nova feature'`
4. Envie para o branch principal: `git push origin minha-feature`
5. Abra um Pull Request

## Licença

Este projeto está licenciado sob os termos da [MIT License](LICENSE).
