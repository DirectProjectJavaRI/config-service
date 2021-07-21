# config-service

Configuration Service Standalone Spring Boot Micro-service Application based on Direct Java RI6

## Build Component
This project is using maven pom.xml file for the build lifecyle.

`mvn clean install`

## Running Component
To run thins project locally with default configuration:

`java -jar config-service-<version>.jar`

For a custom configuration please use externalized `application.properties` along with the JAR file.

## Microservice health check

`config-service` has available health check through the Spring Boot Actuator at

`http://<host>:<port>/actuator`

## Microservice containerization

Microservice application should be built and ready to deploy using `mvn clean isntall` command or full package built form `direct-ri-build-microsrvcs` project.

To create docker image or `config-service` run command below:

`docker build -t config-service:latest .`

When running created image containerized microservice will start on default port `8082` with default `admin` user and `direct` password.
To fully operate HISP you will need to provide default domain as `DEFAULT_DOMAIN` and default postmaster email address as `DEFAULT_POSTMASTER` environmental variables. 

## Dependencies

Running `nhind` database with specified connection to it in the `Dockerfile`