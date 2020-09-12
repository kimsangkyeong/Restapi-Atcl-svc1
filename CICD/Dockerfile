FROM openjdk:14 as builder

# copy outputfile to container
RUN mkdir /app
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} /app/app.jar

WORKDIR /app

# RestAPI listen port
EXPOSE 30002
# DB encrypt key
ENV JASYPT_ENCRYPTOR_PASSWORD=newkey

# run application
ENTRYPOINT ["java","-jar","/app/app.jar"]
