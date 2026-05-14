# Employee Management REST API

A secure RESTful API built using Spring Boot and MySQL for managing employee data. This project follows industry-standard backend architecture using Controller-Service-Repository layers, DTO pattern, and BCrypt password hashing for secure password storage.

## Features

* Employee CRUD Operations
* REST API Architecture
* Spring Boot Backend Development
* MySQL Database Integration
* DTO Pattern
* Password Hashing using BCrypt
* Layered Architecture
* Postman API Testing
* Secure Password Storage

## Technologies Used

* Java
* Spring Boot
* Spring Data JPA
* Spring Security
* MySQL
* Maven
* Git & GitHub
* Postman

## API Endpoints

| Method | Endpoint       | Description        |
| ------ | -------------- | ------------------ |
| POST   | /employee      | Add Employee       |
| GET    | /employee      | Get All Employees  |
| GET    | /employee/{id} | Get Employee By ID |
| PUT    | /employee/{id} | Update Employee    |
| DELETE | /employee/{id} | Delete Employee    |

## Security

* Passwords are stored in hashed format using BCryptPasswordEncoder.
* Sensitive data like passwords are hidden from API responses using DTO architecture.

## Project Structure

controller → Handles API requests
service → Business logic layer
repository → Database operations
entity → Database table mapping
dto → API response/request objects
mapper → Entity to DTO conversion
config → Security configuration

## Database Configuration

Update your `application.properties` file with your local MySQL credentials before running the project.

## Run the Project

1. Clone the repository
2. Open project in IntelliJ or STS
3. Configure MySQL database
4. Run Spring Boot application
5. Test APIs using Postman

## Author

Prasad Patil
