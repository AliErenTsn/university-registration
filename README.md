# University Registration System


**University Registration System** is a **Spring Boot** project developed for student/registration management processes.

---

# Project Summary
- Enables students to register at the university.
- You can filter courses and programs according to specific criteria.
- Developed using the modern Spring Boot stack (Spring Data JPA, REST API, Spring MVC, etc.).

---

## Technologies
| Layer        | Technology               |
|---------------|--------------------------|
| Backend       | Java, Spring Boot        |
| ORM           | Spring Data JPA          |
| Database    | MySQL                    |
| Build System | Maven                    |

---
# API Endpoints

## Student

| Method | Endpoint           | Description                |
|--------|--------------------|----------------------------|
| GET    | /students           | Retrieves all students     |
| GET    | /students/{id}      | Retrieves student by ID    |
| POST   | /students/save/{id} | Saves/updates a student    |
| DELETE | /students/{id}      | Deletes a student          |

## Department

| Method | Endpoint             | Description                |
|--------|----------------------|----------------------------|
| GET    | /departments          | Retrieves all departments   |
| GET    | /departments/{id}     | Retrieves department by ID  |
| POST   | /departments/save/{id}| Saves/updates a department  |
| DELETE | /departments/{id}     | Deletes a department        |

## Course

| Method | Endpoint        | Description               |
|--------|-----------------|---------------------------|
| GET    | /courses         | Retrieves all courses      |
| GET    | /courses/{id}    | Retrieves course by ID     |

## Registration

| Method | Endpoint                  | Description                                   |
|--------|---------------------------|-----------------------------------------------|
| GET    | /registration/students     | Retrieves registered students with exam scores |
| GET    | /registration/courses      | Retrieves registered courses                   |
| GET    | /registration/student/{id}| Retrieves a registered student by ID          |
| POST   | /registration/new/{stuId}/{courseId}/{grade}     | Registers a new student                         |
| DELETE | /registration/drop/{stuId}/{courseId}| Deletes a registered student                    |

## Contributors

This project was developed collaboratively by:

- [Ali Eren](https://github.com/AliErenTsn)
- [İrem Canyılmaz](https://github.com/iiremsi)

