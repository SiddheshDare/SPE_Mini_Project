FROM openjdk:17-jdk-slim
WORKDIR /app
COPY target/Calculator_sci-1.0-SNAPSHOT.jar java_sci_cal.jar
CMD ["java", "-jar", "java_sci_cal.jar"]
