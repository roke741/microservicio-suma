FROM openjdk:17-jdk-alpine
VOLUME /tmp
ADD /target/servicioSuma-0.0.1-SNAPSHOT.jar servicioSuma.jar
ENTRYPOINT ["java","-jar","servicioSuma.jar"]