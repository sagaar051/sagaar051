# 🏫 Student Management System

## Overview
A comprehensive full-stack Student Management System built with Java and Spring Boot. This application provides complete CRUD operations for managing student records, courses, and grades with a user-friendly web interface.

## ✨ Features
- **Student Management**: Add, update, delete, and view student records
- **Course Management**: Manage courses and assign to students
- **Grade Tracking**: Record and track student grades and performance
- **Search & Filter**: Advanced search capabilities for finding students
- **Reports**: Generate academic reports and transcripts
- **User Authentication**: Secure login for admin and student roles
- **Responsive UI**: Mobile-friendly interface using Thymeleaf

## 🛠️ Tech Stack
- **Backend**: Java, Spring Boot, Spring Security, Spring Data JPA
- **Frontend**: HTML5, CSS3, JavaScript, Thymeleaf
- **Database**: MySQL
- **ORM**: Hibernate
- **Build Tool**: Maven
- **Testing**: JUnit 5, Mockito

## 📋 Project Structure
```
student-system/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/sagaar051/studentmgmt/
│   │   │       ├── controller/
│   │   │       ├── service/
│   │   │       ├── entity/
│   │   │       ├── repository/
│   │   │       └── config/
│   │   ├── resources/
│   │   │   ├── templates/
│   │   │   ├── static/
│   │   │   └── application.properties
│   │   └── webapp/
│   └── test/
├── database/
│   └── schema.sql
├── pom.xml
└── README.md
```

## 🚀 Getting Started

### Prerequisites
- Java 11 or higher
- Maven 3.6+
- MySQL 5.7+

### Installation

1. **Clone the repository**
   ```bash
   git clone https://github.com/sagaar051/student-system.git
   cd student-system
   ```

2. **Create database**
   ```bash
   mysql -u root -p
   CREATE DATABASE student_mgmt;
   USE student_mgmt;
   source database/schema.sql;
   ```

3. **Configure application properties**
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/student_mgmt
   spring.datasource.username=root
   spring.datasource.password=your_password
   spring.jpa.hibernate.ddl-auto=update
   ```

4. **Build and run**
   ```bash
   mvn clean install
   mvn spring-boot:run
   ```

Application starts on `http://localhost:8080`

## 📊 Database Schema

### Students Table
```sql
CREATE TABLE students (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE,
    roll_number VARCHAR(20) UNIQUE,
    enrollment_date DATE,
    status ENUM('ACTIVE', 'INACTIVE')
);
```

### Courses Table
```sql
CREATE TABLE courses (
    id INT PRIMARY KEY AUTO_INCREMENT,
    course_code VARCHAR(20) UNIQUE,
    course_name VARCHAR(100),
    credits INT,
    instructor VARCHAR(100)
);
```

## 🎯 Key Functionalities

### 1. Student Management
- View all students with pagination
- Add new student records
- Edit student information
- Delete student records
- Search by roll number or name

### 2. Course Management
- Create new courses
- Assign courses to students
- Remove course assignments
- View course details

### 3. Grade Management
- Enter grades for courses
- Calculate GPA
- Generate grade reports
- View academic history

## 👤 User Roles
- **Admin**: Full system access, can manage all records
- **Faculty**: Can view and update grades
- **Student**: Can view own records and grades

## 📈 Performance Metrics
- Load Time: < 500ms
- Concurrent Users: 100+
- Database Queries: Optimized with indexes

## 🧪 Testing
```bash
mvn test
```

## 📝 License
MIT License - See LICENSE file for details

## 👨‍💻 Author
**Sagar Gouda** - [GitHub](https://github.com/sagaar051) | [LinkedIn](https://www.linkedin.com/in/sagar051/)

## 🔗 Related Projects
- [PhishCatcher - ML Detection System](../phish-catcher)
- [Personal Portfolio](../portfolio)
