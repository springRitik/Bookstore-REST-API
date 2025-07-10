# 📚 Bookstore REST API

A complete Spring Boot-based CRUD API for managing Authors and Books, built using Java, Spring Data JPA, H2 in-memory database, Lombok, and documented via Swagger UI.

---

## 🚀 Features

- Add, view, and delete *authors*
- Add, view, and delete *books*
- Each book is linked to one author (Many-to-One relationship)
- RESTful endpoints for both entities
- Interactive API documentation using Swagger UI
- In-memory H2 database (no external setup needed)

---

## 🧰 Tech Stack

- *Java 17*
- *Spring Boot*
- *Spring Data JPA*
- *Lombok*
- *H2 Database*
- *Swagger (springdoc-openapi)*

---

## 📁 Project Structure

com.bookstore.BookstoreApi ├── model │   ├── Author.java │   └── Book.java ├── repository │   ├── AuthorRepository.java │   └── BookRepository.java ├── controller │   ├── AuthorController.java │   └── BookController.java └── BookstoreApiApplication.java

---

## 🛠️ How to Run

1. Clone the repository
```bash
git clone https://github.com/your-username/bookstore-api.git
cd bookstore-api

2. Open in Eclipse / IntelliJ


3. Run the BookstoreApiApplication.java file


4. Access the app at:
🔗 http://localhost:8080




---

🧪 API Endpoints

📌 Authors

Method	Endpoint	Description

POST	/authors	Add new author
GET	/authors	Get all authors
GET	/authors/{id}	Get author by ID
DELETE	/authors/{id}	Delete author


📌 Books

Method	Endpoint	Description

POST	/books	Add new book
GET	/books	Get all books
GET	/books/{id}	Get book by ID
DELETE	/books/{id}	Delete book



---

🔐 Swagger UI

Access Swagger documentation here:
🔗 http://localhost:8080/swagger-ui/index.html


---

🛢️ H2 Console

To view database:

URL: http://localhost:8080/h2-console

JDBC URL: jdbc:h2:mem:bookstoredb

Username: sa

Password: (leave blank)



---

📥 Sample JSON for Postman

➕ Add Author

{
  "name": "A. P. J. Abdul Kalam",
  "bio": "Indian aerospace scientist and former president"
}

➕ Add Book (linked to existing author)

{
  "title": "Wings of Fire",
  "genre": "Biography",
  "price": 350.0,
  "author": {
    "id": 1
  }
}


---

👨‍💻 Author

Ritik Kumar
Java Developer Intern at Elevate Labs
📧 ritikrajput302@gmail.com
🔗 LinkedIn
🐱 GitHub


---

📄 License

This project is open-source and free to use.

---
