# 📝 Task Tracker API

A production-ready RESTful Task Management API built with **Spring Boot** following clean architecture principles. This project demonstrates scalable backend development using **Spring Security**, **Spring Data JPA**, **MySQL**, **Docker**, and **Swagger/OpenAPI**.

---

# 🚀 Features

* ✅ Full CRUD operations for task management
* ✅ Role-based authentication (Admin / User)
* ✅ Custom UserDetailsService implementation
* ✅ Pagination, sorting, and filtering
* ✅ Task status management (TODO, IN_PROGRESS, DONE)
* ✅ Global exception handling
* ✅ DTO & Mapper pattern
* ✅ Swagger/OpenAPI documentation
* ✅ Dockerized Spring Boot application
* ✅ Dockerized MySQL database using Docker Compose
* ✅ Clean layered architecture

---

# 🛠 Tech Stack

* Java 17
* Spring Boot
* Spring Security
* Spring Data JPA (Hibernate)
* MySQL 8
* Docker
* Docker Compose
* Swagger / OpenAPI
* Maven

---

# 🗄 Database

* MySQL 8
* Relational database design
* Docker volume for persistent database storage
* Supports pagination and optimized querying

---

# 📊 Advanced Features

* Pagination using `PageRequest`
* Dynamic Sorting
* Status-based filtering
* Role-based authorization
* DTO & Mapper architecture
* Service layer abstraction
* Global Exception Handling
* Dockerized development environment

---

# 📂 Project Structure

```text
src/main/java/com/karan/tasktracker/
│
├── config
├── controller
├── dto
│   ├── request
│   └── response
├── entity
├── enums
├── exception
├── mapper
├── repository
├── security
├── service
│   └── implementation
└── TasktrackerApplication.java
```

---

# 📌 API Documentation

After running the project, Swagger UI is available at:

```
http://localhost:8081/swagger-ui/index.html
```

---

# 🐳 Running with Docker

## Build and start containers

```bash
docker compose up --build
```

Run in detached mode:

```bash
docker compose up -d
```

Stop containers:

```bash
docker compose down
```

---

# 💻 Running Without Docker

### 1. Clone Repository

```bash
git clone https://github.com/karangohel09/tasktracker.git
```

### 2. Navigate to Project

```bash
cd tasktracker
```

### 3. Configure MySQL

Update your `application.properties` or `application.yml`.

Example:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/task
spring.datasource.username=root
spring.datasource.password=root
```

### 4. Run the Application

```bash
./mvnw spring-boot:run
```

or

```bash
mvn spring-boot:run
```

---

# 🐬 Docker MySQL Configuration

When using Docker Compose:

| Property       | Value                                                 |
| -------------- | ----------------------------------------------------- |
| Database       | task                                                  |
| Username       | root                                                  |
| Password       | root                                                  |
| Container Port | 3306                                                  |
| Host Port      | 3308 *(or the port configured in docker-compose.yml)* |

You can connect using MySQL Workbench or any MySQL client.

---

# 🔍 Sample Endpoints

| Method | Endpoint                      | Description              |
| ------ | ----------------------------- | ------------------------ |
| GET    | `/api/tasks`                  | Get all tasks            |
| GET    | `/api/tasks/{id}`             | Get task by ID           |
| POST   | `/api/tasks`                  | Create a task            |
| PUT    | `/api/tasks/{id}`             | Update a task            |
| DELETE | `/api/tasks/{id}`             | Delete a task            |
| PATCH  | `/api/tasks/{id}/in-progress` | Mark task as In Progress |
| PATCH  | `/api/tasks/{id}/done`        | Mark task as Completed   |

---

# 🔐 Security

* Role-based authentication
* Admin/User authorization
* Spring Security
* Custom UserDetailsService
* Password encryption

### Planned

* JWT Authentication
* Refresh Tokens

---

# 📈 Future Improvements

* JWT Authentication
* Refresh Tokens
* User Registration & Login APIs
* Email Verification
* Unit & Integration Testing
* Redis Caching
* CI/CD Pipeline (GitHub Actions)
* Deployment on AWS / Render
* Kubernetes Support
* Monitoring with Prometheus & Grafana

---

# 👨‍💻 Author

**Karan Gohel**

GitHub
https://github.com/karangohel09

LinkedIn
https://linkedin.com/in/karan-gohel
