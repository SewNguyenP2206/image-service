FROM openjdk:oraclelinux8
WORKDIR /app
COPY .mvn/ .mvn
COPY mvnw pom.xml ./
COPY ./mvnw dependency:go-offline
COPY src ./src
CMD ["sh", "./mvnw", "spring-boot:run"]