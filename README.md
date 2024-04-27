# Table of Contents
- [Team Members](#team-members)
- [Architecture](#architecture)
- [Runtime Environment](#runtime-environment)
- [How to run the code](#how-to-run-the-code)
- [How to run the tests](#how-to-run-the-tests)

## Team Members
This team only consists of one member; Ugochukwu Agamu.

## Architecture
This application separates calculation logic from web logic. The project is split into different components which are;
### Controller (CalculatorController):
- Acts as the entry point for handling HTTP requests related to calculator operations.
- Annotated with @Controller to mark it as a Spring MVC controller component.
- efines request mapping methods (showCalculator, calculate, clear) to handle specific HTTP endpoints (/, /calculate, /clear).

### Service (CalculatorEngine):
- Performs the actual calculation logic based on input operands and operation.
- Annotated with @Service to indicate it as a Spring service component, managed by the Spring container.
- Provides the performOperation method that performs various mathematical operations (e.g., addition, subtraction, multiplication) based on input parameters.

### View(HTML Template):
- Represents the front-end user interface (UI) displayed to users.
- The controller methods return the names of HTML templates (e.g., "calculator") to render and display to the user.

As well as test classes. An example of what it looks like is down below;
![Screenshot 2024-04-27 075507.png](README.assets%2FScreenshot%202024-04-27%20075507.png)

## Runtime Environment

The runtime environment for this Spring MVC application described includes several key components and configurations that work together to execute the application code and serve the web application to users.


The components are:
1. Java Development Kit (JDK)
2. Apache Maven (Build Tool)
3. Integrated Development Environment (IDE)
4. Web Server (Tomcat, Jetty, etc.)
5. Dependencies and Libraries

To prepare your environment, you will have to follow the following steps:
1. Install Java Development Kit (JDK)
2. Install Apache Maven
3. Set Up Integrated Development Environment (IDE)
4. Configure Web Server
5. Clone or Download the Project
6. Import Project into IDE

## How to run the code
### From an IDE
To run the code in your IDE, all you need to do is run the Spring Boot application from your IDE using Maven. Once the application is running, open a web browser and go to http://localhost:8080 (or another port if configured differently) to access your calculator application.
### From the Command Line
To run the code from the command line, you will have to follow the steps below;
1. Open a terminal/command prompt.
2. Navigate to the root directory of your Maven project (where your pom.xml file is located).

```
cd path/to/your/project
```
3. Use the following Maven command to build the project and generate the executable JAR file:

```
mvn clean package
```
4. Once the build is successful, navigate to the target directory where the JAR file is located. Then, use the java command to run the JAR file:

```
cd target
java -jar your-application.jar
```
5. Replace your-application.jar with the actual name of your generated JAR file. 
6. After starting the application, you should be able to access it through a web browser or using a tool like curl or Postman to send HTTP requests to the endpoints defined in your Spring controllers
-- By default, your Spring application will run on port 8080. You can access it in a web browser by navigating to http://localhost:8080

## OR
You can also use the Maven Spring Boot plugin to directly run your Spring Boot application without explicitly building the JAR file. This command starts the Spring Boot application using the Maven Spring Boot plugin. The plugin automatically detects the main class of your Spring Boot application and launches it.

```
mvn spring-boot:run
```

## How to run the tests
### From an IDE
You just have to run the tests in the IDE.
### From the Command Line
Similar to the steps in the previous section.
1. Open a terminal or command prompt and navigate to the root directory of your Maven project

```
cd /path/to/your/project
```
2. Use the following Maven command to compile your project and execute the JUnit tests:

```
mvn test
```
This command will trigger the test phase of Maven's build lifecycle, which will compile the source code, run the tests, and produce a report of the test results.

# Link to Final Video Presentation
https://youtu.be/7LTSNqxZTuY
