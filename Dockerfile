FROM openjdk:17

# Copy the packaged Spring Boot application (JAR or WAR)
COPY target/SpringBootMVCSDPProject-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/ROOT.war

# Command to run the app when the container starts
ENTRYPOINT ["java", "-jar", "/app.jar"]
