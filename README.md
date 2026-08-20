# Gestión Académica

Proyecto académico desarrollado con Java y Spring Boot para la práctica guiada de Programación IV.

## Descripción

Este proyecto implementa una aplicación base de gestión académica utilizando Spring Boot y Maven.

La aplicación cuenta actualmente con una API REST que permite mostrar un saludo de prueba y consultar una lista de cursos.

## Tecnologías utilizadas

- Java 21
- Spring Boot
- Spring Web
- Thymeleaf
- Maven
- IntelliJ IDEA
- Git
- GitHub

## Estructura del proyecto

```text
gestion-academica/
├── src/
│   └── main/
│       ├── java/
│       │   └── edu/
│       │       └── instituto/
│       │           └── gestionacademica/
│       │               ├── controller/
│       │               │   └── CursoRestController.java
│       │               ├── model/
│       │               │   └── Curso.java
│       │               ├── service/
│       │               │   └── CursoService.java
│       │               └── GestionAcademicaApplication.java
│       └── resources/
│           ├── application.properties
│           └── application-dev.properties
├── pom.xml
├── mvnw
└── mvnw.cmd