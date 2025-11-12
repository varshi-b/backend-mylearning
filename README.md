# 📚 Backend Learning Journey: JDBC & PostgreSQL

This repository documents my personal journey and practical implementation exercises as I learn core backend technologies, primarily focusing on **Java, JDBC, and PostgreSQL**.

## 🎯 Goal for this Repository

The primary goal of this repository is to serve as a verifiable portfolio of hands-on learning, ensuring that every concept learned is translated into runnable code and documented practices.

## 🛠️ Technology Stack

| Category | Technology | Notes |
| :--- | :--- | :--- |
| **Language** | Java | Core programming language for the backend logic. |
| **Database** | PostgreSQL | The relational database used for all examples. |
| **Database Access** | JDBC (Java Database Connectivity) | The API used by Java code to communicate with PostgreSQL. |
| **IDE** | IntelliJ IDEA | Development environment. |

## 🚀 Initial Focus: JDBC Setup and Fundamentals

My first set of commits focuses on establishing a functional link between a standalone Java application and a local PostgreSQL database using the JDBC driver.

### 📁 Code Structure (Example)

| File / Folder | Purpose |
| :--- | :--- |
| `src/main/java/Demo.java` | Contains the initial working code for JDBC connection and basic `Statement` execution. |
| `lib/` | Contains the manually downloaded `postgresql-XX.Y.Z.jar` (JDBC Driver). |

### Key Concepts Implemented So Far

1.  **Driver Inclusion:** Manually adding the PostgreSQL JDBC driver JAR to the IntelliJ project classpath (as no build tool is used yet).
2.  **Connection Establishment:** Using `DriverManager.getConnection()` with specific URL, username, and password.
3.  **Statement Types:** Initial examples using the basic `java.sql.Statement` for simple `SELECT` and `INSERT` queries.

## 💡 Next Steps / Future Learning

1.  Refactor current code to use **`PreparedStatement`** to prevent SQL injection vulnerabilities.
2.  Implement robust **Error Handling** using `try-catch-finally` or `try-with-resources`.
3.  Explore **Database Metadata** to inspect table structures programmatically.
4.  Introduce **DAO (Data Access Object) Pattern** for cleaner code organization.

## 🤝 Contribution

This is a personal learning repository, but feel free to watch or clone if you find the examples useful for your own learning!
