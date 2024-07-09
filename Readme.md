Product Management System
Overview
This Java application is a simple console-based product management system that allows users to add, view, and manage products. It is designed to demonstrate basic Java programming concepts, including object-oriented programming, collections, and basic input/output.

Features
Add Product: Allows the user to enter product details (ID, name, and price) and add them to the management system.
View Products: Displays all the products currently in the system.
Exit: Exits the application.
Requirements
Java 8 or higher
Maven (optional, if you choose to build the project with Maven)
Log4j2 (for logging purposes)
Installation
With Java Installed
Clone the repository or download the source code.
Navigate to the src directory where ProductManagement.java is located.
Compile the Java files using the following command:
Shell Session
javac ProductManagement.java
Run the compiled class with the Java interpreter:
Shell Session
java ProductManagement
Using Maven
If the project is set up with Maven:

Clone the repository.
Navigate to the project root directory.
Run the following command to compile and execute the application:
Shell Session
mvn clean compile exec:java -Dexec.mainClass="com.examples.product_management.ProductManagement"
Usage
To use the application, follow the on-screen prompts:

Run the application using one of the methods described in the Installation section.
Choose an option from the menu by entering 1 to add a product, 2 to view all products, or 3 to exit the application.
Follow the subsequent prompts to add or view products.
Logging
Logs are generated using Log4j2. Ensure that the log4j2.xml configuration file is present in the src/main/resources directory to configure the logging behavior.

Contributing
Contributions to this project are welcome. Please follow these steps:

Fork the repository.
Create a new branch for your feature.
Add your feature or improvement.
Create a pull request.
License