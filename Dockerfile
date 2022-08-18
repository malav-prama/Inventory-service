# define base docker image
FROM openjdk:15
ARG JAR_FILE=target/Inventory-service-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} inventory-service.jar
ENTRYPOINT ["java","-jar","/inventory-service.jar"]