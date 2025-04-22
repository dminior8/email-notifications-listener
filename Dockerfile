# Etap budowania
FROM openjdk:21-jdk-slim AS build

WORKDIR /app

COPY .mvn /app/.mvn
COPY mvnw pom.xml /app/

RUN chmod +x mvnw && ./mvnw dependency:go-offline

COPY . .

RUN ./mvnw clean package -DskipTests

# Etap uruchamiania
FROM openjdk:21-jdk-slim

WORKDIR /app

COPY --from=build /app/target/email-notifications-listener-0.0.1-SNAPSHOT.jar ./app.jar

EXPOSE 8081

CMD ["java", "-jar", "app.jar"]
