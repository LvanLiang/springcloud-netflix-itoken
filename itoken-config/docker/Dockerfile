FROM openjdk:8-jre
MAINTAINER liangxp liangxp0@126.com

RUN mkdir /app

COPY itoken-config-0.0.1-SNAPSHOT.jar /app/app.jar

ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/app/app.jar", "--spring.profiles.active=prod"]

EXPOSE 8888