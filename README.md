<div align="center">

# 📚 Books Management System

### Spring Boot + JPA One-to-Many Unidirectional Mapping
#
A backend application demonstrating the implementation of a **One-to-Many Unidirectional Relationship** using **Spring Boot**, **Spring Data JPA**, **Hibernate**, and **Oracle Database**.

![Java](https://img.shields.io/badge/Java-17-orange)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.x-brightgreen)
![JPA](https://img.shields.io/badge/JPA-Hibernate-blue)
![Oracle](https://img.shields.io/badge/Database-Oracle-red)
![Maven](https://img.shields.io/badge/Build-Maven-yellow)
![Status](https://img.shields.io/badge/Status-Completed-success)

</div>

---

# 📌 Project Overview

This project demonstrates how to implement a **One-to-Many Unidirectional Association** in Spring Boot using JPA/Hibernate.

The application models the relationship between:

- ✍️ **Author**
- 📖 **Books**

where:

> One Author can have multiple Books, while a Book belongs to only one Author.

The project focuses on understanding entity mapping, persistence operations, cascading, and database relationships using Spring Data JPA. :contentReference[oaicite:0]{index=0}

---

# 🏗️ System Architecture

```text
Author
   |
   |  One-to-Many
   ▼
Book
```

### ✨ Relationship Mapping

```java
@OneToMany(cascade = CascadeType.ALL)
@JoinColumn(name = "author_id")
private List<Book> books;
```

The relationship is maintained only from the Author side, making it a **Unidirectional One-to-Many Mapping**. :contentReference[oaicite:1]{index=1}

---

# 🚀 Features

✅ Create Authors

✅ Create Books

✅ Associate Multiple Books with a Single Author

✅ Retrieve Author Details Along with Books

✅ JPA Repository Operations

✅ Hibernate ORM Integration

✅ Oracle Database Connectivity

✅ RESTful API Architecture

✅ Lombok Integration

---

# 🛠️ Tech Stack

| Technology | Purpose |
|------------|---------|
| Java | Core Programming Language |
| Spring Boot | Backend Framework |
| Spring Data JPA | Database Operations |
| Hibernate | ORM Framework |
| Oracle Database | Data Storage |
| Lombok | Boilerplate Reduction |
| Maven | Dependency Management |

---

# 📂 Project Structure

```text
src
│
├── controller
│   └── AuthorController.java
│
├── entity
│   ├── Author.java
│   └── Book.java
│
├── repository
│   ├── AuthorRepository.java
│   └── BookRepository.java
│
├── service
│   └── AuthorService.java
│
├── config
│   └── DataLoader.java
│
└── Application.java
```

---

# 🗄️ Database Design

## Author Table

| Column |
|----------|
| id |
| name |
| email |

---

## Book Table

| Column |
|----------|
| id |
| title |
| category |
| price |
| author_id |

---

## 🚀 API Endpoints

### 📚 Book Management APIs

| Method | Endpoint | Description |
|---------|-----------|-------------|
| GET | `/books` | Get all books |
| GET | `/books/{id}` | Get book by ID |
| POST | `/books` | Add a new book |
| PUT | `/books/{id}` | Update an existing book |
| DELETE | `/books/{id}` | Delete a book by ID |
| GET | `/books/title/{title}` | Find book by title |
| GET | `/books/category/{category}` | Find books by category |
| GET | `/books/price-range?start={start}&end={end}` | Find books within a price range |

---

### 🤖 AI Review API

| Method | Endpoint | Description |
|---------|-----------|-------------|
| GET | `/api/ai/review/{author}` | Generate an AI-powered review of an author |

---

### 📌 Sample Requests

#### Add a Book

```http
POST /books
Content-Type: application/json
```

```json
{
  "title": "Spring Boot in Action",
  "category": "Programming",
  "price": 1499
}
```

#### Get Book By Title

```http
GET /books/title/Spring Boot
```

#### Get Books By Category

```http
GET /books/category/Programming
```

#### Get Books By Price Range

```http
GET /books/price-range?start=1000&end=2000
```

#### Generate AI Author Review

```http
GET /api/ai/review/Robert Martin
```

---

### ✅ Response Example

```json
{
  "bookId": 1,
  "title": "Spring Boot",
  "price": 1200,
  "category": "Programming",
  "authors": [
    {
      "authorId": 1,
      "authorName": "Trisha",
      "email": "trisha@gmail.com"
    }
  ]
}
```

---

# ⚙️ Installation & Setup

## Clone Repository

```bash
git clone https://github.com/trishab2005/BOOKS___One-to-many-UNIDIRECTIONAL.git
```

---

## Open Project

```bash
cd BOOKS___One-to-many-UNIDIRECTIONAL
```

---

## Configure Database

Update:

```properties
src/main/resources/application.properties
```

```properties
spring.datasource.url=jdbc:oracle:thin:@localhost:1521/XEPDB1
spring.datasource.username=your_username
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

## Run Application

Using Maven:

```bash
mvn spring-boot:run
```

or

```bash
./mvnw spring-boot:run
```

---

# 📸 UI Snapshots

<img width="1280" height="800" alt="image" src="https://github.com/user-attachments/assets/dea5cdc1-cf7e-4d43-82d4-362810e34a76" />
<img width="1280" height="800" alt="image" src="https://github.com/user-attachments/assets/6bbcbf33-f907-40ca-8e7c-1c345e17acac" />
<img width="1280" height="800" alt="image" src="https://github.com/user-attachments/assets/65e34dd7-2a60-43ae-b991-e487b6c0d549" />
<img width="1280" height="800" alt="image" src="https://github.com/user-attachments/assets/d50d8711-8656-42e9-834d-d1c483feb2c3" />
<img width="1280" height="800" alt="image" src="https://github.com/user-attachments/assets/95e7d595-51e6-4c23-9ffc-5d4779e689c1" />
<img width="1280" height="800" alt="image" src="https://github.com/user-attachments/assets/2f723e21-bd49-4a6e-932e-1840fb619bd6" />
<img width="1280" height="800" alt="image" src="https://github.com/user-attachments/assets/f7b42a12-8e74-4fd8-a777-8929e3e889ff" />
<img width="1280" height="800" alt="image" src="https://github.com/user-attachments/assets/6487a378-6c87-4b9d-adad-cec30ee3a5bc" />
<img width="1280" height="800" alt="image" src="https://github.com/user-attachments/assets/f651eb1f-42b0-4a08-beb6-203ee59f1836" />
<img width="1280" height="800" alt="image" src="https://github.com/user-attachments/assets/5daab5c6-039b-4bcb-94fc-d167ca027614" />


---

# 📖 JPA Concepts Demonstrated

### One-To-Many Unidirectional Mapping

```java
@OneToMany
@JoinColumn(name = "author_id")
```

### Cascade Operations

```java
cascade = CascadeType.ALL
```

### Hibernate ORM

- Entity Mapping
- Persistence Context
- Automatic Table Creation
- Relationship Management

These concepts follow standard JPA/Hibernate approaches for unidirectional one-to-many associations. :contentReference[oaicite:2]{index=2}

---

# 🎯 Learning Outcomes

By studying this project you will understand:

- Spring Boot Project Structure
- Spring Data JPA
- Hibernate ORM
- One-To-Many Mapping
- Unidirectional Relationships
- Oracle Database Integration
- REST API Development
- Repository Pattern
- Dependency Injection

---

# 👩‍💻 Author

### Trisha Basak

B.Tech CSE Student

Java | Spring Boot | SQL | Data Structures & Algorithms

---

<div align="center">

### ⭐ If you found this project helpful, consider starring the repository!

</div>
