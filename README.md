# Student Research Project – Java + PostgreSQL

This project is a simple academic simulation developed in **Java**, using the **AWT** library for the graphical interface. It was built with **NetBeans IDE** and integrates with a **PostgreSQL** database using **JDBC** for data connectivity.

## 🎯 Objective

The main goal of this project is to simulate a student research management system. It allows users to register and manage student data through a graphical interface, storing all information in a PostgreSQL database.

## 🧰 Technologies Used

- **Java (JDK 21)**  
- **NetBeans IDE**  
- **AWT (Abstract Window Toolkit)**  
- **PostgreSQL**  
- **JDBC (Java Database Connectivity)**  

## ⚙️ Features

- Student registration form  
- Database connection using JDBC  
- Insert, update, and delete records  
- AWT-based graphical interface  
- Basic error handling and validation

## 🗃️ Database

The project uses a PostgreSQL database. You’ll need to set up a database and configure your JDBC connection with the correct credentials and URL.  

Example configuration:

```java
String url = "jdbc:postgresql://localhost:5432/studentdb";
String user = "your_username";
String password = "your_password";
