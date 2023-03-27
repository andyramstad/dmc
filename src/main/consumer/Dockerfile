FROM openjdk:17-jdk-slim
ARG JAR_FILE=dmc-consumer-1.0.0.jar
COPY ${JAR_FILE} consumer.jar
ENTRYPOINT ["java", "-jar", "consumer.jar"]