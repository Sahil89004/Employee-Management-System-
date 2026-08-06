# Employee Management System

A Java-based Employee Management System developed to manage employee records efficiently. The application provides CRUD (Create, Read, Update, Delete) operations using a layered architecture with database connectivity.

##  Features

- Add a new employee
- View employee details
- Update employee information
- Delete employee records
- Search employees by ID
- Input validation
- Exception handling
- Database integration
- User-friendly console/menu interface

##  Tech Stack

- Java
- JDBC
- Oracle Database
- Eclipse IDE
- Git
- GitHub

## 📁 Project Structure

```
EmployeeManagementSystem
│
├── src/
│   ├── bean/
│   ├── dao/
│   ├── service/
│   ├── util/
│   └── main/
│
├── lib/
├── README.md
└── .gitignore
```

##  Prerequisites

Before running the project, make sure you have:

- Java JDK 8 or later
- Eclipse IDE
- Oracle Database
- Oracle JDBC Driver (ojdbc)
- Git

##  How to Run

1. Clone the repository

```bash
git clone https://github.com/Sahil89004/employee-management-system.git
```

2. Open the project in Eclipse.

3. Configure the Oracle database connection.

4. Add the Oracle JDBC driver to the project's build path.

5. Run the main class.

##  Database

Create the required database tables before running the application.

Example:

```sql
CREATE TABLE Employee (
    employeeId NUMBER PRIMARY KEY,
    employeeName VARCHAR2(100),
    department VARCHAR2(50),
    designation VARCHAR2(50),
    salary NUMBER
);
```

##  Future Enhancements

- GUI using JavaFX/Swing
- Spring Boot REST API
- Employee Login System
- Role-Based Authentication
- Export Reports (PDF/Excel)
- Cloud Database Support



Add screenshots of:

- Main Menu
- Add Employee
- Employee List
- Update Employee
- Delete Employee

## 🤝 Contributing

Contributions are welcome.

1. Fork the repository
2. Create a feature branch
3. Commit your changes
4. Push to your branch
5. Create a Pull Request

## 👨‍💻 Author

**Sahil Kharb**

- GitHub: https://github.com/Sahil89004


## ⭐ Support

If you found this project helpful, please consider giving it a ⭐ on GitHub.
