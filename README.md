# Java SpringBoot REST API with Docker + PostgreSQL database

This is a boilerplate API with Java to add CRUD operations to a postgreSQL database.

## API Reference

API address is:

```http
  http://localhost:8080
```

#### Get all users

```http
  GET /api/users
```

#### Get user

```http
  GET /api/users/{uid}
```

#### Add user

```http
  POST /api/users
```

| Parameter   | Type     | Description   |
| :---------- | :------- | :------------ |
| `firstName` | `string` | **Required**. |
| `lastName`  | `string` | **Required**. |
| `email`     | `string` | **Required**. |

#### Update user

```http
  PUT /api/users/{uid}
```

| Parameter   | Type     | Description   |
| :---------- | :------- | :------------ |
| `firstName` | `string` | **Required**. |
| `lastName`  | `string` | **Required**. |
| `email`     | `string` | **Required**. |

#### Delete user

```http
  DELETE /api/users/{uid}
```

## Installation

Use Docker on your local machine and make sure it's running.

```bash
  cd docker-api-example
  docker-compose up
```

To view Adminer GUI to PostgreSQL in your browser navigate to:

```bash
  localhost:8070
```
