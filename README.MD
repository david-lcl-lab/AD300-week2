# AD300 WK 2 Assignments
This repo contains the abstract `Animal` class with concrete classes
`Dog, Cat, Mouse, SeaMonkey`.

To demonstrate the use of interfaces:

`Dog` implements `Tricks`

`SeaMonkey` implements `Swim`

## Build and Run
Build using maven
`mvn compile`

Run using maven
`mvn exec:java -Dexec.mainClass="org.example.Main"`

## Tests
Junit is used for test cases.

An initial suite of tests is included for `Cat`.

Run tests using
`mvn test`

## CI
This project uses a Git Hub action defined in `.github/workflows/maven.yml`
The `maven.yml` will then run `mvn verify`.

*Note:* The Git Hub runner uses Adoptium's Temurin jdk.



## Dependencies
- OpenJDK 21.0.5
- Maven 3.87
- Junit 4.13.2
- Jupiter 5.11.14
