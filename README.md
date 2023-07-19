# task-tracker
A simple SpringBoot application to track the tasks for team members

### Step 1: Set up the Project and Database
1. Install PostgreSQL and create a new database (in this example, db name is 'tracker') for your application. Note down the database name, username, and password.
2. Set up your development environment with Java JDK 11 or later and Apache Maven.

### Step 2: Create a Spring Boot Project
1. Use Spring Initializr (https://start.spring.io/) to generate a new Spring Boot project with the following dependencies:
* Web
* Thymeleaf
* JPA
* PostgreSQL
2. Download the generated project and import it into your preferred IDE.

### Step 3: Define the Data Model
Create a TaskEntry entity class representing a Task entry. Create a new Java class TaskEntry.java in the com.test.tracker package.

### Step 4: Create a Repository
Create a JpaTaskEntryRepository interface that extends JpaRepository to manage TaskEntry entities. Create a new Java interface JpaTasksEntryRepository.java in the com.test.tracker package.

### Step 5: Implement the RESTful Endpoints
Create a TaskEntryController class to handle HTTP requests and serve the HTML UI. Create a new Java class TaskEntryController.java in the com.test.tracker package.

### Step 6: Create the HTML UI
Create an HTML file list_entries.html in the src/main/resources/templates folder. This file will serve as the UI for managing Tasks entries.

### Step 7: Create the Database and Tables
CREATE DATABASE tracker;
CREATE USER testuser WITH ENCRYPTED PASSWORD 'mypass';
GRANT ALL PRIVILEGES ON DATABASE tracker TO testuser;

In the application.properties file (usually located in src/main/resources), configure the database connection:
```
spring.datasource.url=jdbc:postgresql://localhost:5432/your_database_name
spring.datasource.username=your_database_username
spring.datasource.password=your_database_password
spring.jpa.hibernate.ddl-auto=create
```
### Step 8: Run the Spring Boot application
``` mvn spring-boot:run ```
Note: The application will automatically create the necessary database tables based on the JiraEntry entity. 

When we access http://localhost:8080/tasks, we will see the UI for managing Task entries.
