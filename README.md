📚 Book Store Management Application

A full-stack Book Store Management Application built using Java (Spring Boot) that allows users to manage books and their prices efficiently. The application supports adding, updating, deleting, and viewing books through RESTful APIs with a clean and scalable architecture.

🚀 Features

➕ Add new books with title, author, and price

✏️ Update (replace) existing book details

❌ Delete books from the store

📖 View all available books

💰 Manage book pricing efficiently

🧩 Clean layered architecture (Controller, Service, Repository)

🛠️ Tech Stack
Backend

Java

Spring Boot

Spring Data JPA

RESTful APIs

Database

MySQL (can be replaced with H2/PostgreSQL)

Tools

Maven

Postman (for API testing)

🏗️ Project Architecture
book-store-application
│
├── controller     → Handles REST API requests
├── service        → Business logic layer
├── repository     → Database interaction using JPA
├── model/entity   → Book entity
└── config         → Application configurations

📌 API Endpoints
Method	Endpoint	Description
POST	/books	Add a new book
GET	/books	Get all books
PUT	/books/{id}	Update book details
DELETE	/books/{id}	Delete a book
⚙️ Setup & Installation
Prerequisites

Java 17+

Maven

MySQL

IDE (IntelliJ IDEA / Eclipse)

Steps

Clone the repository

git clone https://github.com/your-username/book-store-application.git


Configure Database
Update application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/bookstore
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update


Run the application

mvn spring-boot:run


Test APIs
Use Postman or Swagger to test the endpoints.
