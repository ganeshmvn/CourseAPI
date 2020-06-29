FROM maven:3.5.2-jdk-8-alpine AS MAVEN_BUILD
MAINTAINER Ganesh MVN
WORKDIR /build/
COPY pom.xml /build/
COPY src /build/src/
RUN mvn package
FROM openjdk:8-jre-alpine
WORKDIR /app
COPY --from=MAVEN_BUILD /build/target/courseapiv1.jar /app/
ENTRYPOINT ["java", "-jar", "dcourseapiv1.jar"]
