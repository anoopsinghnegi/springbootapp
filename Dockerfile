FROM openjdk:8-jdk-alpine

MAINTAINER AnoopSinghNegi

ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} devops.jar

EXPOSE 8885

ENTRYPOINT ["java", "-jar", "devops.jar"]
