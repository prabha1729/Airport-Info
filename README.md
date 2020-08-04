# Grainger Coding Challenge

This is a spring boot web project that returns
   - airport information  
   - the distance between the 2 airports in miles.
## Usage
```
# To build the project standard maven build is sufficient
mvn clean install

# To start/run the project spring boot maven plugin is included just run
mvn spring-boot:run

# The integration test may be executed using
mvn test
```
 
Once the application is started,
## To get the Airport Info 
- Goto http://localhost:8082/airport/{IATAcode} which return all information available about the airport inputted.

## To get the distance between airports
- Goto http://localhost:8082/airport?originAirportCode={IATAcode}&destinationAirportCode={IATAcode} return the distance in miles between the 2 airports



## For Example
- http://localhost:8082/airport/ORD
- http://localhost:8082/airport/distance?originAirportCode=ORD&destinationAirportCode=JFK
