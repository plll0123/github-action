FROM openjdk:17-jdk

ARG NAMEZ

ENV NAME=${NAMEZ}

ENTRYPOINT ["java", "-jar", "./build/libs/demo-0.0.1-SNAPSHOT.jar"]

