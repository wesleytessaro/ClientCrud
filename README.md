# ClientCrud
## Spring Boot - CRUD 
### Diagrama
![alt text](https://raw.githubusercontent.com/wesleytessaro/ClientCrud/main/diagrama.png)

# Busca de cliente por id
GET /clients/1

# Inserção de novo cliente
POST /clients
{
  "name": "Wesley And",
  "cpf": "12345678901",
  "income": 6500.0,
  "birthDate": "1994-07-20T10:30:00Z",
  "children": 2
}

# Atualização de cliente
PUT /clients/1
{
  "name": "Wesley Andrade",
  "cpf": "12345678901",
  "income": 6500.0,
  "birthDate": "1994-07-20T10:30:00Z",
  "children": 2
}

# Deleção de cliente
DELETE /clients/1

