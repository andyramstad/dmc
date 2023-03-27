FROM openjdk:17-jdk-slim
ARG JAR_FILE=dmc-producer-1.0.0.jar
COPY ${JAR_FILE} producer.jar
ENTRYPOINT ["java", "-jar", "producer.jar"]