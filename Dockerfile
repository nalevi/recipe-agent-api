# Use an official OpenJDK runtime as a parent image
FROM openjdk:17

# Set the working directory inside the container
WORKDIR /app

# Copy the jar file from the host to the container
COPY build/libs/recipe-agent-api-0.0.1-SNAPSHOT.jar /app/recipe-agent-api-0.0.1-SNAPSHOT.jar

RUN /bin/bash -c 'mv /app/recipe-agent-api-0.0.1-SNAPSHOT.jar /app/recipe-agent-api.jar'

# Expose port 8080 to the outside world
EXPOSE 8080

# Run the jar file
ENTRYPOINT ["java", "-jar", "/app/recipe-agent-api.jar"]
