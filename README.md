# 🚀 Spring Docker Playground

![Java](https://img.shields.io/badge/Java-21-orange)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.3.10-brightgreen)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-Latest-blue)
![Docker](https://img.shields.io/badge/Docker-Enabled-2496ED)
![Gradle](https://img.shields.io/badge/Gradle-8.7-yellow)

> Playground project to test and practice different tools for Backend development with Spring Framework and Docker

## 🌟 Overview

This project serves as a sandbox environment for exploring Spring technologies and Docker containerization. It includes a simple Spring Boot application with database integration, all containerized for easy setup and experimentation.

## 🛠️ Tech Stack

- Java 21
- Spring Boot 3.3
- Gradle 8.7
- PostgreSQL
- Docker & Docker Compose

## 🚦 Getting Started

### Prerequisites

- Docker and Docker Compose installed

### Running the Application

```bash
# Start the application with database
docker-compose up

# Rebuild and start (after code changes)
docker-compose up --build
```

The application will be accessible at `http://localhost:8080`
