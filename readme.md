# SimpleRestAPI-Spring: Game Creation Platform

Welcome to the **SimpleRestAPI-Spring** project! This repository contains a Spring Boot application designed to create and manage games for companies. It uses a memory database (H2) for rapid development and testing, making it an ideal starting point for game-related business logic.

---

## Features

- **Game Creation**: APIs for creating and managing games.
- **Spring Boot Integration**: Built with the robust and efficient Spring Boot framework.
- **Memory Database**: Uses H2 for lightweight, in-memory data persistence.
- **Java 21**: Leverages the long-term support features of Java 21.

---

## Prerequisites

To run this project, you need:

1. **Java 21** (or later) installed on your machine.
2. **Maven** for dependency management and project builds.

---

## Dependencies

The project relies on the following dependencies:

```xml
<dependencies>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-data-jpa</artifactId>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
    <dependency>
        <groupId>com.h2database</groupId>
        <artifactId>h2</artifactId>
        <scope>runtime</scope>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-test</artifactId>
        <scope>test</scope>
    </dependency>
</dependencies>
```

## Getting Started

Step 1: Clone the Repository

```bash
git clone https://github.com/lostmart/simpleRestAPI-sping.git
cd simpleRestAPI-sping
```

Step 2: Build the Project

```bash
mvn clean install
```

Step 3: Run the Application

```bash
mvn spring-boot:run
```

API Endpoints
Method Endpoint Description

- POST /api/games Create a new game
- GET /api/games Retrieve all games
- GET /api/games/{id} Retrieve a game by ID
- PUT /api/games/{id} Update game information
- DELETE /api/games/{id} Delete a game by ID

Database
This application uses the H2 in-memory database for storage. The H2 console is accessible during runtime at:

URL: http://localhost:8080/h2-console
JDBC URL: jdbc:h2:mem:testdb
Username: sa
Password: (leave empty)
