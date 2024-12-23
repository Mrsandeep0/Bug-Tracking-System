# Bug Tracking System

This is a simple Java-based Bug Tracking System that allows project managers to register and assign developers to bugs. The system utilizes Java Servlets, JSP, and MySQL for backend functionality.

## Table of Contents

- [Features](#features)
- [Technologies Used](#technologies-used)
- [Installation](#installation)
- [Usage](#usage)
- [File Structure](#file-structure)
- [License](#license)
- [Contributing](#contributing)
- [Contact](#contact)

## Features

- Register managers for the bug tracking system.
- Assign developers to specific bugs.
- Display success and error messages for operations.
- Store and retrieve data from a MySQL database.

## Technologies Used

- **Java**: Programming language used for server-side logic.
- **Java Servlets**: For handling HTTP requests and responses.
- **JSP**: For creating dynamic web pages.
- **MySQL**: Database for storing project data.
- **HTML/CSS**: For frontend design and layout.
- **NetBeans**: Integrated Development Environment (IDE) for development.
## Installation

To run this project locally, follow these steps:

BugtrackingSystemProject/
│
├── src/
│   ├── AssignDeveloper.java        # Servlet to assign developers
│   └── ManagerReg.java             # Servlet for manager registration
│
├── web/
│   ├── success.jsp                 # Page for successful assignment
│   ├── error.jsp                   # Page for errors
│   ├── manager.jsp                 # Page for successful manager registration
│   └── css/
│       └── style.css               # Styles for the web pages
│
└── WEB-INF/
    └── web.xml                     # Configuration file for servlets

