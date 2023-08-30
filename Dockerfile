FROM eclipse-temurin:20-jdk-alpine
VOLUME /tmp
COPY portfolio.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]