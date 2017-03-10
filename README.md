# Spring Data Elastic Search Example
This project depicts the Elastic Search functionality with Spring Data Elastic Search Example.

## Description
This Project loads the list of Users into Elastic and Searches. 
Using the following endpoints, different operations can be achieved:
- `/rest/search/{name}` - This returns the list of Users for a name.
- `/rest/search/{salary}` - This returns the list of Users for the matching salary.
- `/rest/search/all` - This returns all Users.

## Libraries used
- Spring Boot
- Spring REST Controller
- Spring Data Elastic Search

## Git 2.10.0
- IntelliJ IDEA 2016.2.4

## Compilation Command
- `mvn clean install` - Plain maven clean and install
