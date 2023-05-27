FROM maven:3.9.2-eclipse-temurin-17-alpine
WORKDIR /app
COPY pom.xml .
COPY src src
RUN mvn clean
RUN mvn package
COPY target/*.jar target/app.jar
CMD ["java" , "-jar" , "target/app.jar"]

