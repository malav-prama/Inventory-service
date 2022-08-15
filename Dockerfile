# define base docker image
FROM openjdk:15
ARG JAR_FILE=out/artifacts/OrderService_jar/labJ1.jar
COPY ${JAR_FILE} labj1.jar
ENTRYPOINT ["java","-jar","/labj1.jar"]