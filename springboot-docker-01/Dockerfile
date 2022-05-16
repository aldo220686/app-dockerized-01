# define base docker image
FROM openjdk:11
LABEL maintainer="aldo sanchez"
ADD target/springboot-docker-demo-0.0.1-SNAPSHOT.jar springboot-docker-demo.jar
# Run the jar file 
ENTRYPOINT ["java", "-jar", "springboot-docker-demo.jar"]