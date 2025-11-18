## 🚀 Hibernate Demo Project: Core Concepts

[![Java Version](https://img.shields.io/badge/Java-17+-blue.svg)](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
[![ORM](https://img.shields.io/badge/ORM-Hibernate%207-red.svg)](https://hibernate.org/)
[![Database](https://img.shields.io/badge/Database-PostgreSQL-blue.svg)](https://www.postgresql.org/)

This project is a practical, foundational example demonstrating **Hibernate ORM** fundamentals, **JPA standards**, and database interaction using **PostgreSQL**.

---

## ✨ Features

* **Entity Mapping:** Uses JPA annotations (`@Entity`, `@OneToMany`, etc.) for defining data models.
* **Data Lifecycle:** Implementation of the modern JPA methods: `persist()`, `merge()`, and `remove()`.
* **Fetching Strategies:** Demonstrates **Lazy** vs. **Eager** loading for associated entities.
* **Build Tool:** Maven.

---

## ⚙️ Prerequisites

You'll need the following installed and configured:

* **JDK 17+**
* **Apache Maven**
* **PostgreSQL Server** (running locally)

---

## 🛠️ Setup and Execution

### 1. Database Configuration

You **must** update the connection parameters in the `resources/hibernate.cfg.xml` file.

| Property | Description | **Required Update** |
| :--- | :--- | :--- |
| `jakarta.persistence.jdbc.url` | Database connection URL. | `jdbc:postgresql://localhost:5432/your_db_name` |
| `jakarta.persistence.jdbc.user` | Database username. | `your_db_user` |
| `jakarta.persistence.jdbc.password` | Database password. | `your_db_password` |
| `hibernate.hbm2ddl.auto` | Auto-schema update strategy. | `update` |

### 2. Run Locally

1.  **Clone the Repository:**
    \`\`\`bash
    git clone [Your Repository URL]
    cd hibernate_demo
    \`\`\`
2.  **Compile and Run:**
    The application entry point is `org.varshilearning.Main`.

    \`\`\`bash
    # Build the project
    mvn clean install

    # Run the main class
    mvn exec:java -Dexec.mainClass="org.varshilearning.Main"
    \`\`\`

---

## 📚 Code Highlights

### Fetching (Loading) Strategies

The key educational takeaway is the control over data retrieval:

| Entity Field | Annotation | Fetch Type | Behavior |
| :--- | :--- | :--- | :--- |
| `Department.employees` | `@OneToMany` | **LAZY** | Loads `Employee` list only when accessed (default for collections). |
| `Employee.department` | `@ManyToOne` | **EAGER** | Loads the `Department` object immediately (default for single associations). |

### JPA vs. Legacy Hibernate

The code prioritizes standard JPA methods for portability:

| Operation | JPA Method (Recommended) | Legacy Hibernate Method (Avoid) |
| :--- | :--- | :--- |
| **New Record** | `session.persist(entity)` | `session.save(entity)` |
| **Update/Re-attach**| `session.merge(entity)` | `session.update(entity)` |
| **Delete Record** | `session.remove(entity)` | `session.delete(entity)` |

---

## 🤝 Contribution

Feel free to fork this repository and submit pull requests for new feature demonstrations or improvements.
