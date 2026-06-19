# 📝 Task Tracker API

A production-ready RESTful API for managing tasks, built using Spring Boot.  
This project demonstrates clean backend architecture, role-based access control, pagination, filtering, and scalable design.

---

## 🚀 Features

- Full CRUD operations for task management
- Role-based authentication (Admin / User)
- Custom UserDetailsService implementation
- Pagination, sorting, and filtering support
- Task status management (TODO, IN_PROGRESS, DONE)
- Global exception handling
- DTO & Mapper pattern
- Swagger/OpenAPI integration
- Clean layered architecture

---

## 🛠 Tech Stack

- Java
- Spring Boot
- Spring Security
- Spring Data JPA (Hibernate)
- MySQL
- Swagger / OpenAPI
- Maven

---

## 🗄 Database

- MySQL (Primary database)
- Designed using relational schema
- Supports pagination and efficient querying

---

## 📊 Advanced Features

- Pagination using PageRequest
- Sorting by fields (ascending / descending)
- Status-based filtering (TODO, IN_PROGRESS, DONE)
- Role-based authorization
- Modular service-layer architecture

---

## 📂 Project Structure

src/main/java/com/karan/tasktracker/
│
├── controller
├── service
│   └── implementation
├── repository
├── entity
├── dto
├── mapper
├── config
├── security
├── exception
└── enums

---

## 📌 API Documentation

Swagger UI available at:
http://localhost:8080/swagger-ui/index.html

---

## ⚙️ Setup & Run

1. Clone the repository
git clone https://github.com/karangohel09/tasktracker.git

2. Navigate to project
cd tasktracker

3. Configure MySQL in application.yml

spring:
  datasource:
    url: jdbc:mysql://localhost:3306/tasktracker
    username: your_username
    password: your_password

4. Run the application
./mvnw spring-boot:run

---

## 🔍 Sample Endpoints

GET    /tasks        → Get all tasks  
POST   /tasks        → Create a task  
PUT    /tasks/{id}   → Update task  
DELETE /tasks/{id}   → Delete task  

---

## 🔐 Security

- Role-based authentication (Admin / User)
- Custom UserDetailsService implementation
- Secure endpoint handling
- (Planned) JWT authentication

---

## 📈 Future Improvements

- JWT-based authentication
- Docker containerization
- Deployment (AWS / Render)
- Advanced filtering and search

---

## 👨‍💻 Author

Karan Gohel  
GitHub: https://github.com/karangohel09  
LinkedIn: https://linkedin.com/in/karan-gohel  
