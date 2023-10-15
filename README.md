# CRUD API with Spring Boot 🍃​

Java and Spring Boot Data Management Project

## Description   📝​

I created this project to implement a data management system using Java with Spring Boot and a PostgreSQL database. To test CRUD (Create, Read, Update, Delete) operations, I utilize Postman.

## Initial Requirements ℹ️​ ⚠️​

Before I delved into this project, I ensured the following were in place:

- Java installed to run the Java application.
- Spring Boot to develop the project.
- PostgreSQL for a configured and accessible database.
- Postman for testing CRUD operations.

## Personal Requirements  🙋🏽‍♀️​

To embark on this project, I set a few personal requirements for myself:

- I needed to learn and understand the new programming language.
- I had to grasp the fundamentals of a new framework.
- I aimed to maintain clean and accessible code to the best of my ability.

## Development  ​🚧​⚒️​

I tackled this project as a self-taught developer with the aid of a tutorial. Before this, I had experience in Python from a bootcamp, and I took it as a challenge to learn Java using Spring Boot as the framework.

Here's a glimpse into my development process:

1. I started by downloading IntelliJ IDEA for Java development.
2. I used Spring Initializr, a handy tool that simplifies project setup by generating projects with their dependencies.
3. I made sure to establish all the necessary project structure and folders.

For this project, I opted for a microservices architecture. In a monolithic architecture, the entire project is typically confined to a single package and connects to a database. Microservices allow for greater flexibility, enabling specific tasks to be handled by individual microservices. This architecture facilitates connectivity with different programming languages and various software systems.

In this project, I utilized URIs to identify resources, versions, and the specific aspect of the application we were working on. It's essential to version APIs to cater to different clients and their specific needs.

During the development process, we often deal with data in JSON format. The server interprets the incoming requests, performs the necessary tasks, and provides responses, typically in the form of HTTP status codes such as 200 (success), 400 (client error), or 500 (server error).

## Curiosities  💡​

Here are some interesting observations related to modifying data in CRUD operations.

### Modifying Data with Java and Spring

If I want to modify data, I can use the same POST method that I use for saving data. Here's how it works:

1. Modify the product's name, provided that I include the product's ID.
2. Send the request to update the product.
3. Observe that the server responds with a status code 201 "Created" and returns the modified information:

![Captura de Pantalla 2023-10-14 a las 1 54 41](https://github.com/KARENNGB/CRUD-API-Spring-Boot/assets/116047613/de08ed3c-37fc-45e8-8f68-6fba24023667)


4. Verify that the information has been updated without altering the ID by using the GET method:

![Captura de Pantalla 2023-10-14 a las 1 58 53](https://github.com/KARENNGB/CRUD-API-Spring-Boot/assets/116047613/27b0e00f-7ea2-4513-88e5-263564b0338d)


This method simplifies the process of modifying data, using the same endpoint for both creating and updating records.

## Suggestions for Improvement   🙏🏽​​ ✌🏽​

As a self-taught developer, I'm always looking to learn and improve. I welcome any suggestions or tips that can help me enhance this project or my development skills. If you have any ideas, feel free to share them, and I'll be grateful for your guidance.

## In case you want to clone the repository ​​⤵️​

To get started with this project:

1. Clone or download this repository.
2. Configure the PostgreSQL database by adding your connection details to `application.properties`.
3. Run the Spring Boot application using the following command:

```bash
mvn spring-boot:run
```

