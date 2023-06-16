FROM openjdk:8
EXPOSE 8080
ADD target/my-docker-myname.jar my-docker-myname.jar
ENTRYPOINT ["java","-jar", "/my-docker-myname.jar"]