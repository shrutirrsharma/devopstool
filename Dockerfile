FROM openjdk:8
EXPOSE 8080
ADD target/devopstool.war devopstool.war
ENTRYPOINT ["java","-jar","/devopstool.war"]
