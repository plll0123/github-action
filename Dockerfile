FROM openjdk:17-jdk

ARG NAMEZ

ENV NAME=${NAMEZ}

ENTRYPOINT ["java", "-jar"]
