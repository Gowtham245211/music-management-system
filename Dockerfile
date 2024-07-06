FROM eclipse-temurin:17

LABEL maintainer="gowthamravichandran47@gmail.com"

WORKDIR /app

COPY target/music-management-system-0.0.1-SNAPSHOT.jar /app/music-management-system.jar

ENTRYPOINT ["java", "-jar", "music-management-system.jar"]
