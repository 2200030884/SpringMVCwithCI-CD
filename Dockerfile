FROM openjdk:21

# Copy the packaged Spring Boot application (JAR or WAR)

WORKDIR /app

COPY target/*.war app.war

EXPOSE 8081

# Command to run the app when the container starts
ENTRYPOINT ["java", "-jar", "app.war"]
