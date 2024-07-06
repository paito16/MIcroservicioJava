FROM eclipse-temurin:22-jdk-alpine as base
EXPOSE 8080
ADD target/spring-boot-docker.jar spring-boot-docker.jar
ENTRYPOINT [ "java", "-jar", "/spring-boot-docker.jar"]