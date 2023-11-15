FROM openjdk:17-jdk

ARG NAMEZ
ARG JAR_FILE=./build/libs/demo-0.0.1-SNAPSHOT.jar

COPY ${JAR_FILE} demo.jar

ENV NAME=${NAMEZ}

ENTRYPOINT ["java", "-jar", "/demo.jar"]

