FROM openjdk:8-jre-alpine

MAINTAINER ml9987@student.uni-lj.si

RUN mkdir /app

WORKDIR /app

ADD ./target/series-stream-catalog-0.0.2-SNAPSHOT.jar /app

EXPOSE 8080

CMD ["java", "-jar", "series-stream-catalog-0.0.2-SNAPSHOT.jar"]