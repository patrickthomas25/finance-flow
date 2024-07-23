# Finance Flow
Java RESTful API de Cotrole Financeiro criada para ajudar no gerenciamento de finanças pessoais.

## Visão Geral
Este projeto visa fornecer uma API RESTful para gerenciar finanças pessoais, incluindo contas, transações, categorias, orçamentos e relatórios. Utilizando as tecnologias mais recentes e robustas, este projeto oferece uma base sólida para aprendizado e desenvolvimento de APIs em Java.

## Principais Tecnologias
- Java 17: Utilizaremos a versão LTS mais recente do Java para tirar vantagem das últimas inovações que essa linguagem robusta e amplamente utilizada oferece;
- Spring Boot 3: Trabalharemos com a mais nova versão do Spring Boot, que maximiza a produtividade do desenvolvedor por meio de sua poderosa premissa de autoconfiguração;
- Spring Data JPA: Exploraremos como essa ferramenta pode simplificar nossa camada de acesso aos dados, facilitando a integração com bancos de dados SQL;
- OpenAPI (Swagger): Vamos criar uma documentação de API eficaz e fácil de entender usando a OpenAPI (Swagger), perfeitamente alinhada com a alta produtividade que o Spring Boot oferece;
- Railway: facilita o deploy e monitoramento de nossas soluções na nuvem, além de oferecer diversos bancos de dados como serviço e pipelines de CI/CD.


## Diagrama de Classes
```mermaid
    classDiagram
    User "1" --> "N" Account
    User "1" --> "N" Category
    User "1" --> "N" Budget
    User "1" --> "N" Report
    Account "1" --> "N" Transaction
    Category "1" --> "N" Transaction
    Category "1" --> "N" Budget

    class User {
        +String name
        +String email
        +String password
        +Date creationDate
        +Date lastUpdate
    }

    class Account {
        +String name
        +String type
        +Float initialBalance
        +Float currentBalance
        +Date creationDate
    }

    class Transaction {
        +String type
        +String description
        +Float amount
        +Date transactionDate
        +Date creationDate
    }

    class Category {
        +String name
        +String type
        +Date creationDate
    }

    class Budget {
        +Float plannedAmount
        +Date startDate
        +Date endDate
        +Date creationDate
    }

    class Report {
        +String type
        +Date startDate
        +Date endDate
        +Date creationDate
    }
```