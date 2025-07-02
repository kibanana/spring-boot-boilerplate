# Spring Boot Boilerplate

A clean architecture Spring Boot boilerplate project following Domain-Driven Design (DDD) principles.

## Features

- **Clean Architecture**: Separation of concerns with clear boundaries
- **Domain-Driven Design**: Domain-centric approach with proper modeling
- **Spring Boot 3.2.1**: Latest stable version with Jakarta EE
- **Spring Security**: Authentication and authorization
- **Spring Data JPA**: Data persistence with Hibernate
- **H2 Database**: In-memory database for quick development
- **QueryDSL**: Type-safe queries
- **JWT**: Token-based authentication
- **Validation**: Bean validation with proper error handling
- **Testing**: JUnit 5 and Testcontainers
- **Documentation**: API documentation with OpenAPI 3

## Project Structure

```
src/main/java/com/boilerplate/
├── BoilerplateApplication.java          # Main application class
├── common/                              # Common utilities and base classes
│   ├── domain/                          # Base domain entities
│   └── dto/                             # Common DTOs
├── config/                              # Configuration classes
│   ├── SecurityConfig.java             # Security configuration
│   ├── JpaConfig.java                   # JPA configuration
│   └── WebConfig.java                   # Web MVC configuration
├── error/                               # Exception handling
│   ├── BusinessException.java          # Business logic exceptions
│   └── GlobalExceptionHandler.java     # Global exception handler
└── user/                                # User domain (example)
    ├── api/                             # REST controllers and DTOs
    │   ├── UserController.java         # User REST API
    │   └── dto/                         # User API DTOs
    ├── domain/                          # Domain entities and value objects
    │   ├── User.java                    # User entity
    │   ├── UserStatus.java              # User status enum
    │   └── repository/                  # Repository interfaces
    └── service/                         # Application services
        └── UserService.java             # User business logic
```

## Getting Started

### Prerequisites

- Java 21
- Docker (optional, for database)

### Running the Application

1. Clone the repository
2. Run the application:
   ```bash
   ./gradlew bootRun
   ```

3. Access the application:
   - API: http://localhost:8080/api
   - H2 Console: http://localhost:8080/h2-console
   - Health Check: http://localhost:8080/actuator/health

### Running Tests

```bash
./gradlew test
```

## API Usage

### Create User
```bash
curl -X POST http://localhost:8080/api/public/users \
  -H "Content-Type: application/json" \
  -d '{
    "email": "user@example.com",
    "name": "John Doe",
    "password": "password123"
  }'
```

### Get All Users
```bash
curl http://localhost:8080/api/public/users
```

### Get User by ID
```bash
curl http://localhost:8080/api/public/users/1
```

### Update User
```bash
curl -X PUT http://localhost:8080/api/public/users/1 \
  -H "Content-Type: application/json" \
  -d '{
    "name": "Jane Doe"
  }'
```

### Delete User
```bash
curl -X DELETE http://localhost:8080/api/public/users/1
```

## Configuration

The application comes with sensible defaults:

- **Database**: H2 in-memory database
- **Security**: Basic authentication disabled for public endpoints
- **Logging**: Debug level for application classes
- **CORS**: Enabled for all origins in development

## Extending the Boilerplate

To add a new domain:

1. Create domain package: `com.boilerplate.{domain}`
2. Add domain entity in `{domain}/domain/`
3. Add repository interface in `{domain}/domain/repository/`
4. Add service in `{domain}/service/`
5. Add API controller and DTOs in `{domain}/api/`

## Technology Stack

- **Framework**: Spring Boot 3.2.1
- **Security**: Spring Security 6
- **Database**: Spring Data JPA + Hibernate
- **Testing**: JUnit 5, Mockito, Testcontainers
- **Documentation**: OpenAPI 3 (Swagger)
- **Build Tool**: Gradle 8
- **Java Version**: 21

## License

This project is licensed under the MIT License.