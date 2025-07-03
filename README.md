# 📚 Student Management API

A simple **Spring Boot REST API** for managing student data. This project demonstrates **CRUD operations**, **Swagger API documentation**, **input validations**, and **global exception handling**.

---

## 🔧 Features

✅ Create, Read, Update, and Delete (CRUD) operations on Students
✅ API Documentation with **Swagger UI**
✅ Field-level **validations** (e.g., name, email, age)
✅ **Exception handling** with meaningful error responses
✅ Clean architecture with **Controller Layer**, **Service Layer**, and **Repository Layer**

---

## 🚀 Tech Stack

* Java 17+
* Spring Boot
* Spring Web
* Spring Data JPA
* Hibernate Validator
* MySQL
* Swagger (springdoc-openapi)
* Maven

---

## 📂 Project Structure

```
src/main/java/com/example/studentmanagement
├── controller    --> REST Controllers
├── model        --> JPA Entities
├── exception     --> Custom Exception Classes & Handlers
├── repository    --> Data Repositories (JPA)
├── service       --> Service Layer with business logic

```

---

## 🔗 Swagger UI

Access your API documentation at:

```
http://localhost:8080/swagger-ui/index.html
```

---

## ⚙️ API Endpoints (Sample)

| Method | Endpoint         | Description                |
| ------ | ---------------- | -------------------------- |
| GET    | `/students`      | Get all students           |
| GET    | `/students/{id}` | Get a student by ID        |
| POST   | `/students`      | Add a new student          |
| PUT    | `/students/{id}` | Update an existing student |
| DELETE | `/students/{id}` | Delete a student           |

---



---

## 🛡️ Exception Handling

Handled exceptions:

* Resource Not Found (404)
* Validation Errors (400)
* Database Errors
* Generic Server Errors (500)

---

## ▶️ Running the Application

1. Setup MySQL and update your `application.properties`
2. Run using IntelliJ or with:

   ```bash
   mvn spring-boot:run
   ```
3. Visit `http://localhost:8080/swagger-ui/index.html` to explore APIs.

---

## 🤝 Contributing

Feel free to fork and contribute! Improvements like JWT Authentication, pagination, or Docker support are welcome.

---

Let me know if you'd like to add:

* Setup instructions for MySQL
* API request/response examples

  ---
##🐱 Author
**Alisha Kapoor**
