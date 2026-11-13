# University Course Registration and Academic Management System
**Course:** Web Technology and Internet

**Name:** Mutuyimana Evelyne

**Id:** 27701

**Stack:** Java, Spring Boot, Spring Data JPA / hibernate, postgreSQL, maven

**Database:** University_academic_db

**Scope:** Model and Repository layers

## 1. Problem Analysis
A university keeps its academic information manually, which makes it hard to manage student,courses, lectures and registration. this project designs the database and implements it with Spring Boot and Hibernate, so the data is stored in organized tables.

## 2. Entities and Attributes
| Entity| Attributes| why it exists|
|---|---|---|
| Department | id, name, code | Groups courses, lecturers and students, and has one head|
| Student | id, fullname, registrationNumber | a student is admitted into one department |
| Studentprofile | id, dataOfBirth, gender, phoneNumber, residentialAddreess| Each student has exactly one profile |
| Lecturer | id, fullName, email | works in a department and teaches courses |
| Courses | id, registrationDate, academicYear, semester, status, drage | Records a student's registration for a course |

## Relationships and cardinality
 |Relationship | cardinality | implementation |
 |---|---|---|
 | Department - Course | One-to-Many | FK department_id in course |
 | Department - Lecturer |One-to-Many | FK department_id in lecturer |
 | Department - Student | One-to-Many | FK department_id in student |
 | Department - Head (Lecturer) | One-to-One | FK head_id in department |
 | Student - StudentProfile | One-to-One | FK student_id (unique) in student_profile |
 | Lecturer - Course | Many-to-Many | Join table lecturer_course |
 | Student - Course | Many-to-Many | join entity Registration |

 **Foreign keys:** needed for all One-to-Mnay and One-to-One relationships.

 **Join table:** Lecturer - Course uses the join tbale `lecturer course`. A lecturer teaches many courses and a course has many lecturers. No eectra data is stored, so no entity is needed.

 **Join entity:** Student - Course uses the entity `Registration`. Each registration also stores date, academic year, semester, status (PENDING, APPROVED, REJECTED) and grade, so it must be an entity.

 ## 4. ERD
 ![ERD]()
 <img width="807" height="597" alt="ERD" src="https://github.com/user-attachments/assets/f33422a5-ed1b-48f4-bf84-1cc7a2cfeff2" />


 ## 5. Reional Schema
 - department(**id** PK, name, code, head_id FK to lecturer)
 - lecturer(**id** PK, full_name, email, department_id FK to department)
 - course(**id** PK, code, title, credits, department_id FK to department)
 - lecturer_course(**lecturer_id** FK, **course_id** FK, PK on both)
 - student(**id**PK, full_name, registration_number, department FK to department)
 - student_profile(**id** PK, date_of_birth, gender,phone_number,residential_address, student_id FK to student, unique)
 - registration(**id** PK, student_id FK to student, course_id FK to course, registration_date, academic_year, semester, status, grade)

   ## 6. How to Run

   1. create the database: `CREATE DATABASE university_academic_db;`
   2. open `scr/main/resources/application.properties` and putu your postgreSQL password.
   3. Run `./mvnw spring-boot:run`
   4. hibernate creates the 7 tables automatically.

   ## 7. Screenshots
**Table Creation (console):**
![create tables part 1]
<img width="951" height="372" alt="create_tables_part1" src="https://github.com/user-attachments/assets/ad7732c0-ba29-4e62-bb8f-46eaca5c8d3b" />
 ![create table part2 and foreign keys]
 <img width="950" height="497" alt="create_tables_part2_fks" src="https://github.com/user-attachments/assets/90c4c44f-fb78-427e-9909-016f8ae927a0" />

**Table in PostgreSQL (pgAdmin):**
<img width="921" height="268" alt="tables_in_pgadmin" src="https://github.com/user-attachments/assets/5c2233b5-0f66-44e9-9dea-4c3c7f502054" />
 **Join table lecturer_course (foreign keys):**
 <img width="772" height="322" alt="lecturer_course_fks" src="https://github.com/user-attachments/assets/0529c22f-ca0e-46cf-9125-db246afba2a6" />
 **Join entity registration (columns and foreign keys):**
 

<img width="801" height="383" alt="registration_columns" src="https://github.com/user-attachments/assets/7c610b8c-e829-43be-b908-51b427d5d336" />
<img width="825" height="305" alt="registration_fks" src="https://github.com/user-attachments/assets/cb0c6a23-2267-4030-8c08-93f29d67d584" />







 











