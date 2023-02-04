FROM openjdk:17-jdk-alpine
EXPOSE 8080
ADD /target/servicio-suma.jar servicioSuma.jar
ENTRYPOINT ["java","-jar","servicioSuma.jar"]