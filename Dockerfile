FROM openjdk:17-jdk

ARG NAMEZ

# JAR 파일을 컨테이너 이미지로 복사
COPY ./build/libs/demo-0.0.1-SNAPSHOT.jar app.jar

ENV NAME=${NAMEZ}

ENTRYPOINT ["java", "-jar", "app.jar"]

