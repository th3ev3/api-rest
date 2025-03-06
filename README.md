
#  API: Gerenciamento de Usuários


Esta é uma API RESTful desenvolvida em Spring Boot para gerenciar usuários. Ela permite realizar operações básicas de CRUD (Create, Read, Update, Delete) em um banco de dados de usuários. A API utiliza o banco de dados H2 (em memória) para armazenar os dados, o que a torna ideal para desenvolvimento, testes e prototipação.


## Endpoints da API

#### A API possui os seguintes endpoints:



|Método HTTP	   | Endpoint     | Descrição                           |
| :---------- | :--------- | :---------------------------------- |
| `GET	` | `/usuarios` | Listar todos os usuários |
| `POST	` | `/usuarios` | Criar um novo usuário |
| `GET	` | `/usuarios{id}` | Obter um usuário pelo ID |
| `PUT	` | `/usuarios{id}` | Atualizar um usuário pelo ID|
| `DELETE	` | `/usuarios{id}` | Deletar um usuário pelo ID |

## 1. Listar Todos os Usuários (GET /usuarios)
Descrição:
Retorna uma lista de todos os usuários cadastrados.

Exemplo de Requisição:

```bash
GET /usuarios HTTP/1.1
Host: localhost:8080
```
    
Exemplo de Resposta:

```bash
[
    {
        "id": 1,
        "nome": "João Silva",
        "email": "joao.silva@exemplo.com"
    },
    {
        "id": 2,
        "nome": "Maria Oliveira",
        "email": "maria.oliveira@exemplo.com"
    }
]
```


## 2. Criar um Novo Usuário (POST /usuarios)


Descrição:
Cria um novo usuário com os dados fornecidos.

Exemplo de Requisição:

```bash
POST /usuarios HTTP/1.1
Host: localhost:8080
Content-Type: application/json

{
    "nome": "Ana Souza",
    "email": "ana.souza@exemplo.com"
}
```


    
Exemplo de Resposta:

```bash
{
    "id": 3,
    "nome": "Ana Souza",
    "email": "ana.souza@exemplo.com"
}
```

## 3. Obter um Usuário pelo ID (GET /usuarios/{id})



Descrição:
Retorna os detalhes de um usuário específico com base no ID fornecido.

Exemplo de Requisição:

```bash
GET /usuarios/1 HTTP/1.1
Host: localhost:8080
```


    
Exemplo de Resposta:

```bash
{
    "id": 1,
    "nome": "João Silva",
    "email": "joao.silva@exemplo.com"
}
```

## 5. Deletar um Usuário pelo ID (DELETE /usuarios/{id})



Descrição:
Remove um usuário com base no ID fornecido.

Exemplo de Requisição:

```bash
DELETE /usuarios/1 HTTP/1.1
Host: localhost:8080
```

Resposta

```bash
Status Code: 204 No Content (usuário deletado com sucesso).

```



## Banco de dados H2 

A API utiliza o banco de dados H2 em memória. Para acessar o console do H2 e visualizar os dados diretamente:

```bash

Acesse: http://localhost:8080/h2-console.

Use as seguintes credenciais:

JDBC URL: jdbc:h2:mem:testdb

User Name: sa

Password: password
```
