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
