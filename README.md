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
src/main/java
│
├── controller
│   └── BookController.java
│   └── AIController.java
│
├── entity
│   ├── Author.java
│   └── Book.java
│
├── dto
│   ├── AuthorDto.java
│   └── BookRequestDto.java
│   └── BookResponseDto.java
│
├── repository
│   └── BookRepository.java
│
├── service
│   └── BookService.java
│   └── impl
│      └── BookServiceImpl.java
│
├── config
│   └── DataLoader.java
│   └── BookMapper.java
│   └── ModelMapperConfig.java
│   └── MyChatConfig.java
│
├── exception
│   ├── BookNotFoundException.java
│   └── DuplicateBookException.java
│   └── GlobalExceptionHandler.java

```
```
src/main/resources
│
├──Application.properties

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

# 📸 Swagger and OracleDB Snapshots

<img width="1440" height="900" alt="Screenshot 2026-06-15 at 1 01 49 AM" src="https://github.com/user-attachments/assets/e668cbab-7180-4348-8290-22b837533549" />
<img width="1440" height="900" alt="Screenshot 2026-06-15 at 1 01 57 AM" src="https://github.com/user-attachments/assets/67d693e3-bedb-4aff-ab2b-d85008ced612" />
<img width="1440" height="900" alt="Screenshot 2026-06-15 at 1 23 53 AM" src="https://github.com/user-attachments/assets/1673f717-0da2-436a-a00a-bcb901ea0346" />

#

<img width="703" height="319" alt="Screenshot 2026-06-15 at 12 44 03 AM" src="https://github.com/user-attachments/assets/7b7c3b48-8ba9-4acc-b506-4ccbd210785f" />
<img width="753" height="273" alt="Screenshot 2026-06-15 at 12 45 41 AM" src="https://github.com/user-attachments/assets/51dd2d37-8472-4365-a37d-e02dcac4fe0d" />
<img width="718" height="319" alt="Screenshot 2026-06-15 at 12 45 58 AM" src="https://github.com/user-attachments/assets/995adf48-2349-4c29-865a-d18df788f8df" />

---

# 📸 Swagger -> Custom Queries' and AI API Endpoints

## GET BOOKS BY CATEGORY

<img width="1280" height="800" alt="image" src="https://github.com/user-attachments/assets/46baa5da-a5cc-4a4d-ba17-3d0795495c0a" />
<img width="1280" height="800" alt="image" src="https://github.com/user-attachments/assets/3add4cb6-fa92-4c6a-aa43-21ef7edc7d51" />
<img width="1280" height="800" alt="image" src="https://github.com/user-attachments/assets/631948ea-ee1b-4aa2-9660-475e30b6ef83" />
<img width="1280" height="800" alt="image" src="https://github.com/user-attachments/assets/fa418f0e-69a7-456a-8b2c-b5b19f69d524" />

## GET BOOKS BY TITLE

<img width="1280" height="800" alt="image" src="https://github.com/user-attachments/assets/b610ad37-c1ae-4b9a-b6f9-29b1703eb668" />
<img width="1600" height="1000" alt="image" src="https://github.com/user-attachments/assets/0da6909a-7944-4b3e-a5b8-47ab110b2c9b" />

## GET BOOKS BY PRICE RANGE

<img width="1600" height="1000" alt="image" src="https://github.com/user-attachments/assets/4524c2f5-f9a8-40de-9048-940e62ee9ff6" />
<img width="1600" height="1000" alt="image" src="https://github.com/user-attachments/assets/6205a7eb-bc49-4ff9-a06c-7666ce5ec45e" />
<img width="1600" height="1000" alt="image" src="https://github.com/user-attachments/assets/230644ef-653e-454b-acb2-44ce7676ff9e" />

## GET AUTHOR REVIEW (AI)

<img width="1280" height="800" alt="image" src="https://github.com/user-attachments/assets/5fc6d5a2-36d1-4bc5-b026-81fb93527b11" />
<img width="1280" height="800" alt="image" src="https://github.com/user-attachments/assets/a6cb3005-4d11-4a66-9173-fcfa6a530808" />

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
