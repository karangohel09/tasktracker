📝 Task Tracker API

A production-ready RESTful Task Management API built with Spring Boot following clean architecture principles. This project demonstrates scalable backend development using Spring Security, Spring Data JPA, MySQL, Docker, Docker Compose, and Jenkins CI/CD automation.

🚀 Features

✅ Full CRUD operations for task management
✅ Role-based authentication (Admin / User)
✅ Custom UserDetailsService implementation
✅ Pagination, sorting, and filtering
✅ Task status management (TODO, IN_PROGRESS, DONE)
✅ Global exception handling
✅ DTO & Mapper pattern
✅ Swagger/OpenAPI documentation
✅ Dockerized Spring Boot application
✅ Dockerized MySQL database using Docker Compose
✅ Automated CI/CD Pipeline using Jenkins
✅ Automated Docker image build and deployment
✅ Clean layered architecture

🛠 Tech Stack
Java 17
Spring Boot
Spring Security
Spring Data JPA (Hibernate)
MySQL 8
Docker
Docker Compose
Jenkins
Swagger / OpenAPI
Maven
Git & GitHub
🗄 Database
MySQL 8
Relational database design
Docker volume for persistent storage
Supports pagination and optimized querying
📊 Advanced Features
Pagination using PageRequest
Dynamic Sorting
Status-based Filtering
Role-based Authorization
DTO & Mapper Architecture
Service Layer Abstraction
Global Exception Handling
Dockerized Development Environment
Automated CI/CD Deployment Pipeline
🔄 CI/CD Pipeline

This project includes a fully automated Jenkins CI/CD pipeline.

Pipeline Flow
GitHub
   ↓
Jenkins Multibranch Pipeline
   ↓
Maven Build
   ↓
Spring Boot Packaging
   ↓
Docker Image Build
   ↓
Docker Compose Deployment
   ↓
MySQL Container
   ↓
Spring Boot Container
   ↓
Application Available on Port 8081
Pipeline Features

✅ Automatic repository checkout
✅ Maven build and packaging
✅ Docker image creation
✅ Docker Compose deployment
✅ Container verification
✅ Automated application deployment

📂 Project Structure
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
📌 API Documentation

After running the application:

http://localhost:8081/swagger-ui/index.html
🐳 Running with Docker
Start Containers
docker compose up --build
Detached Mode
docker compose up -d
Stop Containers
docker compose down
💻 Running Without Docker
Clone Repository
git clone https://github.com/karangohel09/tasktracker.git
Navigate to Project
cd tasktracker
Configure Database
spring.datasource.url=jdbc:mysql://localhost:3306/task
spring.datasource.username=root
spring.datasource.password=root
Run Application
mvn spring-boot:run
🐬 Docker MySQL Configuration
Property	Value
Database	task
Username	root
Password	root
Container Port	3306
Host Port	3308
🔍 Sample Endpoints
Method	Endpoint	Description
GET	/api/tasks	Get all tasks
GET	/api/tasks/{id}	Get task by ID
POST	/api/tasks	Create task
PUT	/api/tasks/{id}	Update task
DELETE	/api/tasks/{id}	Delete task
PATCH	/api/tasks/{id}/in-progress	Mark task as In Progress
PATCH	/api/tasks/{id}/done	Mark task as Completed
🔐 Security
Role-based Authentication
Admin/User Authorization
Spring Security
Custom UserDetailsService
Password Encryption
Planned
JWT Authentication
Refresh Tokens
📈 Future Improvements
JWT Authentication
Refresh Tokens
User Registration & Login APIs
Email Verification
Unit & Integration Testing
Redis Caching
GitHub Actions
AWS EC2 Deployment
Kubernetes
Prometheus & Grafana Monitoring
👨‍💻 Author
Karan Gohel

🔗 GitHub: https://github.com/karangohel09

🔗 LinkedIn: https://linkedin.com/in/karan-gohel
