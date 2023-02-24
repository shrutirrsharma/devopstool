FROM openjdk:8
EXPOSE 8080
ADD target/devopstool.jar devopstool.jar
ENTRYPOINT ["java","-jar","/devopstool.jar"]
