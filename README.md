<img width="1671" height="913" alt="image" src="https://github.com/user-attachments/assets/1c006bfd-b0fa-434e-856b-aed4da5017ce" />

# 📚 Spring Data JPA Fundamentals (Amigoscode Course)

This project contains the foundational setup for a Spring Boot application focused on learning **JPA (Java Persistence API)**, **Entity Mapping**, and the **Repository Pattern**.

---

## 1. Persistence Layer Setup 🛠️

We configured the application to connect to a PostgreSQL database and defined the core entity.
Database Connection and Setup 💾
the initial process of connecting the IntelliJ IDE to the database, ensuring the application can communicate with the persistence layer.

Database System: PostgreSQL

IntelliJ Integration: The database connection was configured directly within IntelliJ's Database Tool Window to facilitate visual exploration of schemas and tables.

<img width="632" height="602" alt="image" src="https://github.com/user-attachments/assets/0b563291-1b8e-416c-9903-5b5d37035af5" />
## 2. Entity Mapping (`Student.java`)

We used JPA annotations to map the `Student` Java class to a database table.

| Annotation | Purpose |
| :--- | :--- |
| **`@Entity`** | Marks the class as a persistent database entity. |
| **`@Id`** | Designates the primary key column (`id`). |
| **`@Table`** | Used to override the default table name and define table-level constraints. |
| **`@Column`** | Customizes column details like `name` (e.g., mapping `emailAddress` to `email_addr`) and enforces constraints like `unique = true`. |

## 3. Primary Key Generation Strategy

We chose the performant `SEQUENCE` strategy for ID generation:

* **`@GeneratedValue(strategy = GenerationType.SEQUENCE)`**: Instructs JPA to get IDs from a database sequence.
* **`@SequenceGenerator`**: Configures the sequence, with the crucial `allocationSize` property used to **cache a batch of IDs in memory**. This avoids constant database trips for ID generation, significantly improving insertion performance.

---

## 4. Data Access Layer (Repository Pattern) 🗄️

The database interaction logic is managed by the Repository pattern.

* **`StudentRepository`**: This interface extends **`JpaRepository<Student, Long>`**.
* **Role**: It serves as our **Data Access Layer**, automatically inheriting all standard **CRUD** methods (`save()`, `findAll()`, `delete()`, etc.) from Spring Data JPA, eliminating boilerplate code.
* **Benefit**: This setup decouples our business logic from the specific database implementation details.


---

## 5. Application Initialization 🚀

The entry point was configured to seed initial data.

* **`CommandLineRunner`**: A Spring component used to execute code immediately after the application has fully started.
* **Seeding**: The runner injects the `StudentRepository` and uses its `.save()` method to insert the first sample `Student` record into the database for testing and demonstration.
