FROM maven:3.6-jdk-11 as builder
WORKDIR /app
COPY 07-spring-boot/pom.xml .
COPY 07-spring-boot/src ./src
RUN mvn package

FROM adoptopenjdk/openjdk11:alpine-slim
COPY --from=builder /app/target/*.jar /app/application.jar
ENTRYPOINT ["java","-jar","/app/application.jar"]