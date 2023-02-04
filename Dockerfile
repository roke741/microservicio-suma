FROM openjdk:17-jdk-alpine
ADD /target/servicio-suma.jar servicioSuma.jar
ENTRYPOINT ["java","-jar","servicioSuma.jar"]