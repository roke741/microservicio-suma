FROM openjdk:17-jdk-alpine
ADD target/servicioSuma-0.0.1-SNAPSHOT.jar servicioSuma.jar
ENTRYPOINT ["java","-jar","servicioSuma.jar"]