# Grainger Coding Challenge

This is a spring boot web project that returns
   - airport information  
   - the distance between the 2 airports in miles.

# Reach out to me
[<img align="left" alt="LinkedIn" width="22px" src="https://cdn.jsdelivr.net/npm/simple-icons@v3/icons/linkedin.svg" />](https://www.linkedin.com/in/prabhakargaddam/)
[<img align="left" alt="Gmail" width="22px" src="https://cdn.jsdelivr.net/npm/simple-icons@v3/icons/gmail.svg" />](<mailto:prabhakargaddam1729@gmail.com>)

<br/>

# Execution
```
# To build the project standard maven build is sufficient
mvn clean install

# To start/run the project spring boot maven plugin is included just run
mvn spring-boot:run

# The integration test may be executed using
mvn test
```
 # Usage 
Once the application is started,
## To get the Airport Info 
- Goto http://localhost:8082/airport/{IATAcode} which return all information available about the airport inputted.

## To get the distance between airports
- Goto http://localhost:8082/airport?originAirportCode={IATAcode}&destinationAirportCode={IATAcode} return the distance in miles between the 2 airports



## For Example
- http://localhost:8082/airport/ORD
- http://localhost:8082/airport/distance?originAirportCode=ORD&destinationAirportCode=JFK


## You may also like...

- [Stock Trade ](https://github.com/prabha1729/Hacker-Rank-Stock-Trade-Api) - A RESTful service to manage trades using Spring Boot framework
- [Contact System](https://github.com/prabha1729/Spring-Boot-RESTful-Api) - A Spring Boot RESTful service for Contact Entry System.

