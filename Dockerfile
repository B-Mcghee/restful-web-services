FROM adoptopenjdk/openjdk16
ARG JAR_FILE=target/restful-web-service.jar
ADD ${JAR_FILE} restful-web-service.jar
ENTRYPOINT ["java","-jar","/restful-web-service.jar"]
