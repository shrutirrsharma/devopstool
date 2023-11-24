# Use an official OpenJDK runtime as a parent image
FROM openjdk:11-jre-slim

# Set the working directory to /app
WORKDIR /app

# Copy the current directory contents into the container at /app
COPY devopstool.war /app/devopstool.war

# Make port 8080 available to the world outside this container
EXPOSE 8082

# Define environment variable
ENV JAVA_OPTS="-Djava.security.egd=file:/dev/./urandom"

# Run your application when the container launches
CMD ["java", "-jar", "/app/devopstool.war"]
