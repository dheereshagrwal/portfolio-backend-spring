FROM eclipse-temurin:20-jdk-alpine
COPY target/portfolio-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]